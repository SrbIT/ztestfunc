/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storm.ztestfunc;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author soh-l
 */


public class Aggregate {

    private static final SimpleDateFormat millisecondFormatter = new SimpleDateFormat("yyyyMMddHHmmssSSS");
    private static final SimpleDateFormat secondFormatter = new SimpleDateFormat("yyyyMMddHHmmss");
    private static final SimpleDateFormat minuteFormatter = new SimpleDateFormat("yyyyMMddHHmm");
    private static final SimpleDateFormat hourFormatter = new SimpleDateFormat("yyyyMMddHH");
    private static final SimpleDateFormat dayFormatter = new SimpleDateFormat("yyyyMMdd");

    private static SimpleDateFormat formatForMillis(long millis) {
        if (millis < 1000) {
            return millisecondFormatter;
        }
        if (millis < 60 * 1000) {
            return secondFormatter;
        }
        if (millis < 3600 * 1000) {
            return minuteFormatter;
        }
        if (millis < 86400 * 1000) {
            return hourFormatter;
        }
        return dayFormatter;
    }

    long expirationMillis = -1;

    public Aggregate expire(long time, TimeUnit unit) {
        expirationMillis = TimeUnit.MILLISECONDS.convert(time, unit);
        return this;
    }

    public long expire(long time) {
        return expirationMillis == -1 ? -1 : expirationMillis * (time / expirationMillis);
    }

    long resolutionMillis = 1000;

    TimeUnit unit = TimeUnit.SECONDS;

    public Aggregate resolution(long time, TimeUnit unit) {
        resolutionMillis = TimeUnit.MILLISECONDS.convert(time, unit);
        this.unit = unit;
        return this;
    }

    public long resolution() {
        return resolutionMillis;
    }

    public String resolutionString() {
        return unit.convert(resolutionMillis, TimeUnit.MILLISECONDS) + ":" + unit.toString();
    }

    public TimeUnit quantizeUnit() {
        return unit;
    }

    public long quantize(long time) {
        return resolutionMillis * (resolutionMillis / time);
    }

    public long quantize(long time, TimeUnit unit) {
        return quantize(TimeUnit.MILLISECONDS.convert(time, unit));
    }

    public String quantizeString(long time) {
        SimpleDateFormat sdf = formatForMillis(resolutionMillis);
        return sdf.format(new Date(time));
    }

    /**
     *
     * Static methods for common resolutions
     *
     */
    public static Aggregate days(long days) {
        return (new Aggregate()).resolution(days, TimeUnit.DAYS);
    }

    public static Aggregate day() {
        return days(1);
    }

    public static Aggregate hours(long hours) {
        return (new Aggregate()).resolution(hours, TimeUnit.HOURS);
    }

    public static Aggregate hour() {
        return hours(1);
    }

    public static Aggregate minutes(long minutes) {
        return (new Aggregate()).resolution(minutes, TimeUnit.MINUTES);
    }

    public static Aggregate minute() {
        return minutes(1);
    }

    public static Aggregate seconds(long seconds) {
        return (new Aggregate()).resolution(seconds, TimeUnit.SECONDS);
    }

    public static Aggregate second() {
        return seconds(1);
    }

}

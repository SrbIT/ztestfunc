/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storm.ztestfunc;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 *
 * @author soh-l
 */
public class time_utc {

    public static final SimpleDateFormat minuteFormatter = new SimpleDateFormat("yyyyMMddHHmm");
    public static final SimpleDateFormat hourFormatter = new SimpleDateFormat("yyyyMMddHH");
    public static final SimpleDateFormat dayFormatter = new SimpleDateFormat("yyyyMMdd");
    public static final SimpleDateFormat dateFormatUTC = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
    public static final SimpleDateFormat dateFormatUTC2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");

    public static void time_utc(String time) {
        /*  Process on t*/
        Date dateLog = null;
//        SimpleDateFormat minuteFormatter = _minuteFormatter;
//        SimpleDateFormat hourFormatter = _hourFormatter;
//        SimpleDateFormat dayFormatter = _dayFormatter;
        try {
            dateLog = dateFormatUTC.parse(time);
//            LOG.info("Time parse: " + dateLog.toString());
        } catch (ParseException ex) {
//            LOG.info("LogAggregateBolt_ParseException: " + ex);
            System.out.println("exp");

//            DateTime dateLog = DateTime.now(DateTimeZone.UTC);
            dateLog = new Date();
            System.out.println(dateLog);

            System.out.println("truoc");
            System.out.println("min: " + minuteFormatter.format(dateLog));
            System.out.println("hour: " + hourFormatter.format(dateLog));
            System.out.println("day: " + dayFormatter.format(dateLog));

            minuteFormatter.setTimeZone(TimeZone.getTimeZone("UTC"));
            hourFormatter.setTimeZone(TimeZone.getTimeZone("UTC"));
            dayFormatter.setTimeZone(TimeZone.getTimeZone("UTC"));
            System.out.println("sau");
            System.out.println("min: " + minuteFormatter.format(dateLog));
            System.out.println("hour: " + hourFormatter.format(dateLog));
            System.out.println("day: " + dayFormatter.format(dateLog));

//            LOG.info("Time ex: " + dateLog);
        }
        System.out.println("sau nua");
        System.out.println("min: " + minuteFormatter.format(dateLog));
        System.out.println("hour: " + hourFormatter.format(dateLog));
        System.out.println("day: " + dayFormatter.format(dateLog));

    }
}

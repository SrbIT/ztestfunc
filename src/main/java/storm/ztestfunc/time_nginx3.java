/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storm.ztestfunc;

import java.util.Date;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static storm.ztestfunc.converMMMtoMM.ConvertMMMtoMM;
import static storm.ztestfunc.time_utc.dayFormatter;
import static storm.ztestfunc.time_utc.hourFormatter;
import static storm.ztestfunc.time_utc.minuteFormatter;

/**
 *
 * @author soh-l
 */
public class time_nginx3 {

    public static Date time_nginx3(String time) {
        /*  Process on t*/

//        18/Feb/2016:17:49:02 +0700
        Date dateLog = null;

        String pattern = "(\\d+)\\/(\\w+)\\/(\\d+)\\:(\\d+)\\:(\\d+)\\:(\\d+)";

        // Create a Pattern object
        Pattern r = Pattern.compile(pattern);

        // Now create matcher object.
        Matcher m = r.matcher(time);
        if (m.find()) {

            System.out.println("Found value: " + m.group(1));
            System.out.println("Found value: " + m.group(2));
            System.out.println("Found value: " + m.group(3));
            System.out.println("Found value: " + m.group(4));
            System.out.println("Found value: " + m.group(5));
            System.out.println("Found value: " + m.group(6));

            dateLog = new Date(Integer.parseInt(m.group(3)) - 1900,//year
                                ConvertMMMtoMM(m.group(2)),
                                Integer.parseInt(m.group(1)),
                                Integer.parseInt(m.group(4)),
                                Integer.parseInt(m.group(5)),
                                Integer.parseInt(m.group(6)));
        } else {
            System.out.println("NO MATCH");
            dateLog = new Date();
        }
//        System.out.println(dateLog);
        System.out.println(dateLog);
        minuteFormatter.setTimeZone(TimeZone.getTimeZone("UTC"));
        hourFormatter.setTimeZone(TimeZone.getTimeZone("UTC"));
        dayFormatter.setTimeZone(TimeZone.getTimeZone("UTC"));
        String sMinuteFormatter = minuteFormatter.format(dateLog);
        String sHourFormatter = hourFormatter.format(dateLog);
        String sDayFormatter = dayFormatter.format(dateLog);

        System.out.println("dau tien");
        System.out.println("min: " + minuteFormatter.format(dateLog));
        System.out.println("hour: " + hourFormatter.format(dateLog));
        System.out.println("day: " + dayFormatter.format(dateLog));

        return dateLog;
    }
}

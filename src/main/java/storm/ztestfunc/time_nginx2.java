/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storm.ztestfunc;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static storm.ztestfunc.time_utc.dayFormatter;
import static storm.ztestfunc.time_utc.hourFormatter;
import static storm.ztestfunc.time_utc.minuteFormatter;

/**
 *
 * @author soh-l
 */
public class time_nginx2 {

    public static Date time_nginx2(String time) {
        /*  Process on t*/
        Date dateLog = null;
//        dateLog = new Date(2016-1900, 02, 18, 15, 12, 20);
//        System.out.println(dateLog);
//        String pattern = "(\\d+)\\/(\\w+)\\/(\\d+)\\:(\\d+)\\:(\\d+)\\:(\\d+)";
        String pattern = "(\\d+)\\-(\\w+)\\-(\\d+)T(\\d+)\\:(\\d+)\\:(\\d+)";

        // Create a Pattern object
        Pattern r = Pattern.compile(pattern);

        // Now create matcher object.
        Matcher m = r.matcher(time);
        if (m.find()) {
            //   String time = "2016-02-18T15:12:20.582+0700";
            System.out.println("Found value: " + m.group(1));
            System.out.println("Found value: " + m.group(2));
            System.out.println("Found value: " + m.group(3));
            System.out.println("Found value: " + m.group(4));
            System.out.println("Found value: " + m.group(5));
            System.out.println("Found value: " + m.group(6));

            dateLog = new Date(Integer.parseInt(m.group(1)) - 1900,
                                Integer.parseInt(m.group(2))-1,
                                Integer.parseInt(m.group(3)),
                                Integer.parseInt(m.group(4)),
                                Integer.parseInt(m.group(5)),
                                Integer.parseInt(m.group(6)));
        } else {
            System.out.println("NO MATCH");
        }
//        System.out.println(dateLog);
        System.out.println(dateLog);
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

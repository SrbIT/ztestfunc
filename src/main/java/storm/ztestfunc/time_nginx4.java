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
import static storm.ztestfunc.time_utc.dateFormatUTC;

/**
 *
 * @author soh-l
 */
public class time_nginx4 {

    public static String time_nginx4(String time, String time2) {
        /*  Process on t*/

//        18/Feb/2016:17:49:02 +0700
        Date dateLog = null;
        String suffixes = null;

        String pattern = "(\\d+)\\/(\\w+)\\/(\\d+)\\:(\\d+)\\:(\\d+)\\:(\\d+)";
        String pattern2 = "\\d+Z";

        // Create a Pattern object
        Pattern r = Pattern.compile(pattern);
        Pattern r2 = Pattern.compile(pattern2);

        // Now create matcher object.
        Matcher m = r.matcher(time);
        Matcher m2 = r2.matcher(time2);
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

        if (m2.find()) {
            suffixes = m2.group();

        } else {
            suffixes = "000Z";
            System.out.println("NOT MATCH suffixes");
        }

//        System.out.println(dateLog);
        System.out.println(dateLog);
        dateFormatUTC.setTimeZone(TimeZone.getTimeZone("UTC"));

        System.out.println("dau tien");
        System.out.println("dateFormatUTC: " + dateFormatUTC.format(dateLog) + '.' + suffixes);

        return dateFormatUTC.format(dateLog) + '.' + suffixes;
    }
}

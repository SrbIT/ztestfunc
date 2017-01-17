/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storm.ztestfunc;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author soh-l
 */
public class covertTime_7 {

    public static String convertUTC7(String timestamp) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        try {
            Date dTime = dateFormat.parse(timestamp);
            Calendar cal1 = Calendar.getInstance();

            cal1.setTime(dTime);
            cal1.add(Calendar.HOUR_OF_DAY, 7);

            System.out.println(cal1.getTimeZone());
            System.out.println(cal1.get(Calendar.HOUR_OF_DAY));
            System.out.println(cal1.get(Calendar.DAY_OF_MONTH));
            System.out.println(cal1.get(Calendar.MONTH) + 1);
            System.out.println(cal1.get(Calendar.YEAR) + "" + (cal1.get(Calendar.MONTH) + 1) + "" + cal1.get(Calendar.DAY_OF_MONTH));

            return cal1.get(Calendar.YEAR) + "" + (cal1.get(Calendar.MONTH) + 1) + "" + cal1.get(Calendar.DAY_OF_MONTH);
        } catch (ParseException ex) {
            System.out.println("LOI");

            Date dTime = new Date();
            Calendar cal1 = Calendar.getInstance();
            cal1.setTime(dTime);

            System.out.println(cal1.get(Calendar.YEAR) + ""
                                + (cal1.get(Calendar.MONTH) + 1) + ""
                                + cal1.get(Calendar.DAY_OF_MONTH) + ""
                                + cal1.get(Calendar.HOUR_OF_DAY)
            );

        }
        return null;

    }
}

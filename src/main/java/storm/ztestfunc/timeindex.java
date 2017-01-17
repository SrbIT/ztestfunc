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

/**
 *
 * @author soh-l
 */
public class timeindex {

    public static String SetTimeIndex(String timestamp) {

        try {
            SimpleDateFormat ft = new SimpleDateFormat("yyyy.MM.dd");
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
            Date dTime = dateFormat.parse(timestamp);
            String formatDate = ft.format(dTime);

            System.out.println("First_formatDate: " + formatDate);
            System.out.println("First: " + dTime);

            Calendar cal1 = Calendar.getInstance();

            cal1.setTime(dTime);
            cal1.add(Calendar.HOUR_OF_DAY, 7);

            Date tmpTime = cal1.getTime();
            String formatDate2 = ft.format(tmpTime);

            System.out.println("After_formatDate2: " + formatDate2);
            System.out.println("After: " + tmpTime);

            String indexName = "log-nginx";

            return indexName + "-" + formatDate2;

        } catch (ParseException ex) {
//            Logger.getLogger(timeindex.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("LOI_NE");

            Date dNow = new Date();
            SimpleDateFormat ft = new SimpleDateFormat("yyyy.MM.dd");
            String formatDate = ft.format(dNow);
            String indexName = "log-nginx";
            return indexName + "-" + formatDate;

        }

    }

}

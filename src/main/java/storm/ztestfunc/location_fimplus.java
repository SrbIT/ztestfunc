/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storm.ztestfunc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author soh-l
 */
public class location_fimplus {

    public static void location_fimplus(String _request) {

        String location = "";
        String present_id = "";

        String sPattern1 = "^\\/(.*)\\/.*\\.ism";
        String sPattern2 = ".sm\\/(.*)-";

        Pattern pPattern1 = Pattern.compile(sPattern1);
        Pattern pPattern2 = Pattern.compile(sPattern2);

        Matcher m1 = pPattern1.matcher(_request);
        Matcher m2 = pPattern2.matcher(_request);

        if (m1.find()) {
            location = m1.group(1);
            System.out.println(location);
        }

        if (m2.find()) {
            present_id = m2.group(1);
            System.out.println(present_id);
        }

    }
}

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
public class check_linkplay {

    public static String check(String _request) {
        String a = "";

        String location5 = "";
        String uid5 = "";

        String sPartern6 = "(\\/([a-zA-Z0-9-]+)\\/(\\d+\\/[a-zA-Z0-9-]+)|\\/([a-zA-Z0-9-]+)\\/([a-zA-Z0-9-]+)\\/(\\d+\\/[a-zA-Z0-9-]+))\\/[\\w.]+\\/(0?[web-]+|[mobile-]+|(QualityLevels\\()+|)([a-zA-Z0-9=_-]+)";
        Pattern pPattern6 = Pattern.compile(sPartern6);
        Matcher m6 = pPattern6.matcher(_request);

        if (m6.find()) {
            a = m6.group(1);
            System.out.println("1" + a);
            System.out.println("2" + m6.group(2));

            location5 = m6.group(3);
            if (m6.group(2) == null) {
                uid5 = m6.group(4);
                location5 = m6.group(6);
            }

            System.out.println("uid5 " + uid5);
            System.out.println("location5 " + location5);
//            System.out.println("3" + m5.group(3));
//            System.out.println("4" + m5.group(4));
//            System.out.println("5" + m5.group(5));
//            System.out.println("6" + m5.group(6));
//            System.out.println("7" + m5.group(7));
//            System.out.println("8" + m5.group(8));
//            System.out.println("9" + m5.group(9));
        }

        return a;
    }

}

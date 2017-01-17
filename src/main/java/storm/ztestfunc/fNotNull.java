/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storm.ztestfunc;

/**
 *
 * @author soh-l
 */
public class fNotNull {

    public static String fNotNull(String a) {
        if (a != null) {
            return a;
        }
        return "n";
    }
}

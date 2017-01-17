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
public class checkMovieName {

    public static String checkMV(String mv) {
        String replace = mv.replace(" ", "_");
        return replace;

    }

}

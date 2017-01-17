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
public class checkExistv2 {

    public static boolean CheckExistv2(String request) {

//        if (request.contains("olivia2")) {
//            System.out.println(request.contains("olivia2"));
//        } else if (request.contains("mp4/media")) {
//            System.out.println(request.contains("mp4/media"));
//        }else if(!request.contains(".ts") {
        //            System.out.println(request.contains("mp4/media"));
//        }
        return !(request.contains("olivia2") || request.contains("mp4/media") || (!request.contains(".ts")));

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storm.ztestfunc;

import com.github.veqryn.net.Cidr4;

/**
 *
 * @author soh-l
 */
public class cidr {

    public static boolean CheckIP(String IPv4) {

        Cidr4 myCIDR1 = new Cidr4("118.69.169.193/26");
        Cidr4 myCIDR2 = new Cidr4("103.205.104.0/22");

        System.out.println(myCIDR1.getAddressRange());
        System.out.println(myCIDR1.getAddressCount(true));
        System.out.println(myCIDR1.getLowAddress(true));
        System.out.println(myCIDR1.getNetmask());
        System.out.println(myCIDR1.isInRange(IPv4, true));

        System.out.println(myCIDR2.getAddressRange());
        System.out.println(myCIDR2.getAddressCount(true));
        System.out.println(myCIDR2.getLowAddress(true));
        System.out.println(myCIDR2.getNetmask());
        System.out.println(myCIDR2.isInRange(IPv4, true));

        return myCIDR1.isInRange(IPv4, true) || myCIDR2.isInRange(IPv4, true);

    }

}

/********************************
 * Anthony Mui
 * Period 1
 * P4.10
 *class that shows how someone's bank account will grow
 ********************************/
package CH4;

import java.util.Scanner;

public class P4_10 {
    public static void main(String[] args) {
        double x = new Scanner(System.in).nextDouble();
        System.out.println("Initial balance: "+(int)x+"\nAnnual interest rate in percent: "+6.0);
        for (int i = 1; i < 4; i++) {
            System.out.println(x*Math.pow(1.005,i));
        }
    }
}

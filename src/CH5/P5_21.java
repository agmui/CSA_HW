/********************************
 * Anthony Mui
 * Period 2
 * P5.21
 * prints if string will snap based on velocity
 ********************************/
package CH5;

import java.util.Scanner;

public class P5_21 {
    public static void main(String[] args) {
        System.out.print("input v: ");
        double v = new Scanner(System.in).nextDouble();
        if(Math.pow(v,2)>(60*3/2)){
            System.out.println("the rope will snap");
        } else {
            System.out.println("rope will not snap");
        }
    }
}

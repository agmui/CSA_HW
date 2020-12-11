/********************************
 * Anthony Mui
 * Period 1
 * E4.8
 *Program asks for the users for rect dimensions and prints out the parameter and hypotenuse
 ********************************/

package CH4;

import java.util.Scanner;

public class E4_8 {
    public static void main(String[] args) {
        int x = new Scanner(System.in).nextInt(), y = new Scanner(System.in).nextInt();
        System.out.println(2*(x+y)+" "+Math.hypot(x,y));
    }
}

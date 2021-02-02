/********************************
 * Anthony Mui
 * Period 2
 * E5.18
 * calculates tax based on status
 ********************************/
package CH5;

import java.util.Scanner;

public class E5_18 {
    public static void main(String[] args) {
        System.out.print("input income: ");
        int x = new Scanner(System.in).nextInt(), tax;
        if (x <= 5000){
            tax = 1;
        } else if (x >= 5000 && x <= 75000) {
            tax = 2;
        } else if (x >= 75000 && x <= 100000) {
            tax = 3;
        } else if (x >= 100000 && x <= 250000) {
            tax = 4;
        } else if (x >= 250000 && x <= 500000) {
            tax = 5;
        }else {
            tax = 6;
        }
        System.out.println("your income tax is: "+tax+"%");
    }
}

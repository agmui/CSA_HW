/********************************
 * Anthony Mui
 * Period 2
 * P5.2
 * prints a table based on status
 ********************************/
package CH5;

import java.util.Scanner;

public class P5_2 {
    public static void main(String[] args) {
        int help = 0, tax = 0, extra = 0;
        System.out.print("Married or not [Y/n]: ");
        String status = new Scanner(System.in).next();
        if (status == "Y"){
            help = 2;
        } else {
            help = 1;
        }
        System.out.print("input income: ");
        int x = new Scanner(System.in).nextInt();

        if (x <= 8000*help){
            tax = 10;
        } else if (x <= 32000*help) {
            tax = 15;
            extra = 8000*help;
        } else {
            tax = 25;
            extra = 44000*help;
        }
        System.out.println("your income tax is: "+tax+"%"+" + $"+extra);
        System.out.println("total: $"+ tax*x+extra);
    }
}

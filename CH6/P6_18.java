package CH6;

import java.util.Scanner;

public class P6_18 {
    public static void main(String[] args) {
        //2 is the best ratio to use for maximum power
        System.out.println("input n: ");
        double n = new Scanner(System.in).nextDouble();
        System.out.println("P = "+8*Math.pow((n*40/(Math.pow(n,2)*20+8)),2));
    }
}

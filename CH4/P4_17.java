package CH4;

import java.util.Scanner;

public class P4_17 {
    public static void main(String[] args) {
        double Q1 = new Scanner(System.in).nextDouble(), Q2 = new Scanner(System.in).nextDouble(), r = new Scanner(System.in).nextDouble();
        System.out.println("F = "+(Q1*Q2)/(4*Math.PI*8.854*Math.pow(10,-12)*Math.pow(r,2)));
    }
}

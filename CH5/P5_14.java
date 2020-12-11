package CH5;

import java.util.Scanner;

public class P5_14 {
    public static void main(String[] args) {
        System.out.print("input num: ");
        double x = new Scanner(System.in).nextDouble();
        System.out.print("input pow: ");
        int p = new Scanner(System.in).nextInt();
        if (Math.pow(x,p)>Math.pow(10,-1)){
            System.out.println("Radio Waves");
        } else if (Math.pow(x,p)<=Math.pow(10,-1)&&Math.pow(x,p)>Math.pow(10,-3)){
            System.out.println("Microwaves");

        } else if (Math.pow(x,p)<=Math.pow(10,-3)&&Math.pow(x,p)>7*Math.pow(10,-7)){
            System.out.println("Infrared");

        } else if (Math.pow(x,p)<=7*Math.pow(10,-7)&&Math.pow(x,p)>4*Math.pow(10,-7)){
            System.out.println("Visible light");

        } else if (Math.pow(x,p)<=4*Math.pow(10,-7)&&Math.pow(x,p)>Math.pow(10,-8)){
            System.out.println("Ultraviolet");

        } else if (Math.pow(x,p)<=Math.pow(10,-8)&&Math.pow(x,p)>Math.pow(10,-11)){
            System.out.println("X-rays");
        } else{
            System.out.println("Gamma rays");
        }
    }
}

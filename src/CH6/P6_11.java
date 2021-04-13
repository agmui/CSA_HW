package CH6;

import java.util.Scanner;

public class P6_11 {
    public static void main(String[] args) {
        System.out.print("input target: ");
        double target = new Scanner(System.in).nextDouble();
        System.out.print("input stock: ");
        double stock = new Scanner(System.in).nextDouble();
        if (target >= stock){
            System.out.println("target is bigger than or equal than stock");
        } else {
            System.out.println("target is less than stock");
        }
    }
}

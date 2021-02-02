package other_projects.SubAssignments;

import java.util.Scanner;

public class InternetServiceProvider {
    public static void main(String[] args) {
        while (true){
            System.out.print("input Package: ");
            String input = new Scanner(System.in).next();
            System.out.print("input hours: ");
            int hours = new Scanner(System.in).nextInt();
            int extra = 0;
            if (hours > 744) {
                System.out.println("lol u ded");
                break;
            }
            switch (input) {
                case "A" -> {
                    if (hours > 9) {
                        extra = 2 * (hours - 10);
                    }
                    System.out.println(hours * 9.95 + extra);
                }
                case "B" -> {
                    if (hours > 20) {
                        extra = (hours - 20);
                    }
                    System.out.println(hours * 14.95 + extra);
                }
                case "C" -> System.out.println(hours * 19.95);
            }
        }
    }
}

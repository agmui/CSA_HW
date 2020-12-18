package CH4;

import java.util.Scanner;

public class E4_8 {
    public static void main(String[] args) {
        int x = new Scanner(System.in).nextInt(), y = new Scanner(System.in).nextInt();
        System.out.println(2*(x+y)+" "+Math.hypot(x,y));
    }
}

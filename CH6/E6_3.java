package CH6;

import java.util.Arrays;
import java.util.Scanner;

public class E6_3 {
    public static void main(String[] args) {
        int[] l = new int[5];
        int [] l2 = new int[5];
        int greatest = 0;
        int least = 0;
        int total = 0;
        int even = 0;
        System.out.println("input 5:");
        for (int i = 0; i < 5; i++) {
            l[i] = new Scanner(System.in).nextInt();
            if (l[i] > greatest) {
                greatest = l[i];
            }
            if (l[i] < least) {
                least = l[i];
            }

            if (l[i]/2 == (int)(l[i]/2)){
                even++;
            }

            System.out.print((total += l[i])+" ");
        }
        for (int i = 0; i < l.length; i++) {
            for (int j = 0; j < l.length; j++) {
                if (i != j && l[i] == l[j]) {
                    l2[i]=l[i];
                }
            }
        }
        System.out.println("\n"+greatest + ", " + least + ", " + even + ", " + ( l.length - even) + ", " + Arrays.toString(l2));
    }
}


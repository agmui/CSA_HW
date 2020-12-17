package CH6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class E6_3 {
    public static void main(String[] args) {
        int[] l = new int[5];
        List<Integer> l2 = new ArrayList<>();
        int greatest = 0;
        int least = 0;
        int total = 0;
        int even = 0;
        System.out.println("input 5:");
        for (int i = 0; i < 5; i++) {
            l[i] = new Scanner(System.in).nextInt();
            if (i == 0){
                greatest = l[0];
                least = l[0];
            }
            if (l[i] > greatest) {
                greatest = l[i];
            }
            if (l[i] < least) {
                least = l[i];
            }

            if (l[i]%2==0){
                even++;
            }

            System.out.print((total += l[i])+" ");
            for (int j = 0; j < l.length; j++) {
                if (l[i]==l[j] && i != j && !l2.contains(l[i])){
                    l2.add(l[i]);
                }
            }
        }
        System.out.println(Arrays.toString(l));
        System.out.println("\n"+greatest + ", " + least + ", " + even + ", " + ( l.length - even) + ", " +l2);
    }
}

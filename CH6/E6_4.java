package CH6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E6_4 {

    public static void main(String[] args) {
        int i = 0;
        String input = new Scanner(System.in).next();
        char[] ch = input.toCharArray();
        for (char c : ch){
            i++;
            //System.out.println(c);
            if (Character.isUpperCase(c)||i%2==0){
                System.out.println(c);
            }
        }
    }
}

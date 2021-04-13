package CH6;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class E6_4 {

    public static void main(String[] args) {
        int count = 0;
        List<String> l = new ArrayList<String>(Arrays.asList("a", "e", "i", "o", "u", "A", "E", "I", "O", "U"));
        List<Integer> l2 = new ArrayList<>();
        String input = new Scanner(System.in).next();
        //String input = "AaeioubB";
        char[] ch = input.toCharArray();
        for (int i = 0; i < ch.length; i++){
            //System.out.println(c);
            if (Character.isUpperCase(ch[i]) || i%2==0){
                System.out.println(ch[i]);
            }

            if (l.contains(Character.toString(ch[i]))){
                ch[i]='_';
                count++;
                l2.add(i);
            }
        }
        System.out.println(Arrays.toString(ch)+","+count+","+l2);
    }
}

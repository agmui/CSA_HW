package CH6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E6_4 {
    public static void main(String[] args) {
        List<String> l = new ArrayList<String>(Arrays.asList("a", "e", "i", "o", "u"));
        //String input = new Scanner(System.in).next();
        String input = "AaeioubB";
        char[] ch = input.toCharArray();
        for (int i = 0; i < ch.length; i++){
            i++;
            //System.out.println(c);
            if (Character.isUpperCase(ch[i]) || i%2==0){
                System.out.println(ch[i]);
            }
            if (l.contains(ch[i])){
              ch[i] = '_';
            }
        }
        System.out.println(ch);
    }
}

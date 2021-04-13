package CH4;
import java.util.Scanner;

public class E4_16 {
    public static void main(String[] args) {
        String x = new Scanner(System.in).next();
        for (int i = 0; i < x.length(); i++) {
            System.out.print(x.substring(i,i+1)+" ");
        }
    }
}

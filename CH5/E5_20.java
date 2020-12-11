package CH5;
import java.util.Arrays;
import java.util.Scanner;

public class E5_20 {
    public static void main(String[] args) {
        double[] l = {0,0,0};
        for (int i = 0; i < l.length; i++) {
            l[i] = new Scanner(System.in).nextDouble();
        }
        System.out.println(Arrays.stream(l).max().getAsDouble());
    }
}

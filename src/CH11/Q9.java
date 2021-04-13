package CH11;

import java.util.Arrays;

public class Q9 {
    public static double sumTo(int n){
        /*if(n<0){
            throw new IllegalArgumentException("num is lower than 0");
        }
        if (n==0) {
            return 0;
        }
        return sumTo(n-1)+(1./n);*/
        if(n<0)throw new IllegalArgumentException("num is lower than 0"); else return (n==0) ? 0 : sumTo(n-1)+(1./n);
    }
    public static void main(String[] args) {
        System.out.println(sumTo(2));
        System.out.println(sumTo(0));
        System.out.println(sumTo(-1));
    }
}

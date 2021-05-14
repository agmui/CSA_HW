package AP_FRQ.CH_10;

public class GCF {
    public static int gcf(int a, int b){
        return (a%b==0) ? b : gcf(b, a%b);
    }
    public static void reduceFraction(int numerator, int denominator){
        System.out.println((numerator%denominator==0) ? numerator/denominator : (numerator/gcf(numerator, denominator))+"/"+(denominator/gcf(numerator, denominator)));
    }
    public static void main(String[] args) {
        System.out.println(gcf(30, 3));
        System.out.println(gcf(24, 9));
        System.out.println(gcf(7, 3));
        reduceFraction(30, 3);
        reduceFraction(8, 20);
        reduceFraction(24, 9);
        reduceFraction(7, 3);
    }
}

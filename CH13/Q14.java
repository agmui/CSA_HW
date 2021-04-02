package CH13;

public class Q14 {
    public static double P(double n, double r){
        return F(n,0)/F(n, r);
    }

    public static double F(double n, double r){
        if (n==0||(n-r)==0){
            return 1;
        }
        return (r==0) ? n*F(n-1, 0) : (n-r)*F(n-1, r) ;
    }

    public static void main(String[] args) {
        System.out.println(P(8, 6));
    }
}

package CH11;

public class Q1 {
    public static String starString(double num){
        /*if (num < 0){
            throw new IllegalArgumentException("num below 0");
        }
        if (num==0){
            return "*";
        }*/
        //return starString(num-1)+starString(num-1);
        if(num<0) throw new IllegalArgumentException("num below 0"); else return (num==0) ? "*" : starString(num-1)+starString(num-1);
    }
    public static void main(String[] args) {
        System.out.println(starString(0));
        System.out.println(starString(-1));
    }
}

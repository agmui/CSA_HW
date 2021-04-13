package CH13;

public class Q10 {
    public static String random(String s, int n){
        /*if (n==0){
            return "";
        }
        return random(s, n-1)+s;*/
        return (n==0) ? "":random(s, n-1)+s;
    }
    /*public static String random(String s, int n){
        /*if (n==1){
            return s;
        } else if (n==0){
            return "";
        }
        return random(s, n-1)+s;
        return (n==1) ? s : (n==0) ? "" : random(s, n-1)+s;
    }*/
    public static void main(String[] args) {
        System.out.println(random("hello", 3));
        System.out.println(random("hello", 0));
    }
}

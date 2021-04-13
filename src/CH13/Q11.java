package CH13;

public class Q11 {
    public static int count = -1;
    public static boolean isReverse(String x, String y){
        if (count==x.length()-1){
            return true;
        }
        count++;
        if(x.substring(count, count+1).toLowerCase().equals(y.substring(x.length()-count-1, x.length()-count).toLowerCase())) {
            return isReverse(x, y);
        }
        return false;
        /*String w1 = x.substring(count, count+1);
        String w2 = y.substring(x.length()-count-1, x.length()-count);//-1);
        if(w1.toLowerCase().equals(w2.toLowerCase())){
            return isReverse(x, y);
        }
        return false;*/
    }
    public static void main(String[] args) {
        System.out.println(isReverse("hello", "oLLeH"));
    }
}

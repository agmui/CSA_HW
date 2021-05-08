package AP_FRQ.CH_6;

public class Q1 {
    public static void main(String[] args) {
        String[] l =  {"ten", "fading", "post", "card", "thunder", "hinge", "trailing", "batting"};
        for (String i:l){
            if(i.endsWith("ing")){
                System.out.println(i);
            }
        }
    }
}

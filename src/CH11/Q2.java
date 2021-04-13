package CH11;

public class Q2 {
    public static String writeNums(int n){
        if (n==0){
            return"";
        }
        System.out.print(writeNums(n-1)+n);
        return ", ";
    }
    public static void main(String[] args) {
        writeNums(5);
        System.out.println();
        writeNums(12);
    }
}

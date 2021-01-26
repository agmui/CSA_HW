package CH7;

public class E7_10 {
    private int[] values;
    public E7_10(int[] initialValues) {
        values = initialValues;
    }
    public void swapFirstAndLast() {
        if (values.length < 2){
            System.out.println("array to small");
            return;
        }
        int last = values[values.length-1];
        values[values.length-1] = values[0];
        values[0] = last;
    }
    public void shiftRight(){
        int last = values[values.length-1];
        System.arraycopy(values, 0, values, 1, values.length - 2 + 1);
        values[0] = last;
    }
    public static void test(){
        int[] x = {1,2,3,4};
        E7_10 test = new E7_10(x);
        test.swapFirstAndLast();
        test.shiftRight();
        for (int i: x) { System.out.println(i); }
    }

    public static void main(String[] args) {
        test();
    }
}

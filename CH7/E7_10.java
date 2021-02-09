/*
* Anthony Mui
* Period 1
* E7.10
* takes a array input and can order it either by shift right or swapping first and last element
* */
package CH7;

import java.util.Scanner;

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
        System.out.print("input how many num in array: ");
        int len = new Scanner(System.in).nextInt();
        int[] x = new int[len];
        for (int i = 0; i < x.length; i++) {
            System.out.print("input "+ i +"th number: ");
            x[i] = new Scanner(System.in).nextInt();
        }
        E7_10 test = new E7_10(x);
        test.swapFirstAndLast();
        test.shiftRight();
        for (int i: x) { System.out.println(i); }
    }

    public static void main(String[] args) {
        test();
    }
}

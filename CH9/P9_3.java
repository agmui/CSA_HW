package CH9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class P9_3 {
    private String msg;
    private int[] date;
    public P9_3(String msg, int[] date){
        this.msg = msg;
        this.date = date;
    }
    public boolean occursOn(int year, int month, int day) {
        return Arrays.equals(this.date, new int[]{month, day, year});
    }
}

class Onetimer extends P9_3{
    public Onetimer(String msg, int[] date){
        super(msg, date);
    }
}

class Daily extends P9_3{
    public Daily(String msg, int[] date){
        super(msg, date);
    }
}

class Monthly extends P9_3{
    public Monthly(String msg, int[] date){
        super(msg, date);
    }
}

class Main{
    public static void main(String[] args) {
        System.out.print("input month: ");
        int month = new Scanner(System.in).nextInt();
        System.out.print("input day: ");
        int day = new Scanner(System.in).nextInt();
        System.out.print("input year: ");
        int year = new Scanner(System.in).nextInt();
        ArrayList<P9_3> appointments = new ArrayList<P9_3>();
        for (int i = 0; i < 9; i++) {
            appointments.add(new Onetimer("OneTimer", new int[]{1,1,i}));
            appointments.add(new Daily("Daily", new int[]{1,1,i}));
            appointments.add(new Monthly("Monthly", new int[]{1,1,i}));
            if (appointments.get(i).occursOn(month, day, year)){
                System.out.println(appointments.get(i).toString());
            }
        }
    }
}
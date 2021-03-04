package CH9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class P9_4 {
    private String msg;
    private int[] date;
    public P9_4(String msg, int[] date){
        this.msg = msg;
        this.date = date;
    }
    public boolean occursOn(int year, int month, int day) {
        return Arrays.equals(this.date, new int[]{month, day, year});
    }
}

class Onetimer_9_4 extends P9_4{
    public Onetimer_9_4(String msg, int[] date){
        super(msg, date);
    }
}

class Daily_9_4 extends P9_4{
    public Daily_9_4(String msg, int[] date){
        super(msg, date);
    }
}

class Monthly_9_4 extends P9_4{
    public Monthly_9_4(String msg, int[] date){
        super(msg, date);
    }
}

class Main_9_4{
    public static void main(String[] args) {
        System.out.print("input type of appointment: ");
        String remind = new Scanner(System.in).next();

        System.out.print("input description: ");
        String description = new Scanner(System.in).next();

        System.out.print("input month: ");
        int month = new Scanner(System.in).nextInt();
        System.out.print("input day: ");
        int day = new Scanner(System.in).nextInt();
        System.out.print("input year: ");
        int year = new Scanner(System.in).nextInt();
        ArrayList<P9_4> appointments = new ArrayList<P9_4>();
        P9_4 test = remind.equals("Onetimer") ? new Onetimer_9_4(description, new int[]{month, day, year}) : (remind.equals("Daily") ? new Daily_9_4(description, new int[]{month, day, year}) : new Monthly_9_4(description, new int[]{month, day, year}));
        System.out.println(test.toString());
    }
}

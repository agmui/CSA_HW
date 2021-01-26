package CH7;

import java.util.Arrays;
import java.util.Scanner;

public class P7_7 {
    public int[][] seats= setArray();
    public void printArray(){
        for (int[] seat : seats) {
            System.out.println(Arrays.toString(seat));
        }
    }
    public void checkSeating(int choice){
        if (!( choice == 10 || choice == 20 || choice == 30 || choice == 40 || choice == 50)) { System.out.println("not a listed price"); return;  }// else{System.out.println("not a listed price"); return;}
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 10; j++) {
                if (seats[i][j] == choice){
                    System.out.println("yee");
                    seats[i][j] = 0;
                    return;
                }
            }
        }
        System.out.println("no seats available");
    }

    public void checkSeating(int choice1, int choice2){
        if ( seats[choice1+1][choice2+1] != 0){
            System.out.println("yee");
            System.out.println(choice1);
            System.out.println(choice2);
            seats[choice1-1][choice2-1] = 0;
        } else {
            System.out.println("no seats available");
        }
    }
    public static int[][] setArray(){
        int[][] x = new int[9][10];
        for (int i = 0; i < 6; i++) { Arrays.fill(x[i], 10); }
        for (int i = 3; i < 6; i++) { Arrays.fill(x[i], 2, 8,20); }
        x[6] = new int[]{20, 20, 30, 30, 40, 40, 30, 30, 20, 20};
        x[7] = new int[]{20, 20, 30, 40, 50, 50, 40, 30, 20, 20};;
        x[8] = new int[]{30, 40, 50, 50, 50, 50, 50, 50, 40, 30};;
        return x;
    }
    public static void main(String[] args) {
        int[][] x = new int[9][10];
        for (int i = 0; i < 9; i++) { Arrays.fill(x[i], 0); }
        P7_7 test = new P7_7();
        test.printArray();
        while (test.seats != x){
            System.out.print("type seat or price: ");
            String help = new Scanner(System.in).next();
            if (help.equals("seat")){
                System.out.print("input row: ");
                int choice1 = new Scanner(System.in).nextInt();// if (!(choice1 < 10 && choice1 > 0) || (choice1 != (int)choice1)){ System.out.println("input valid response"); return;}
                System.out.print("input column: ");
                int choice2 = new Scanner(System.in).nextInt();// if (!(choice2 < 10 && choice2 > 0) || (choice2 != (int)choice2)){ System.out.println("input valid response"); return;}
                test.checkSeating(choice1,choice2);
                test.printArray();
            } else if (help.equals("price")){
                System.out.print("input price: ");
                int choice = new Scanner(System.in).nextInt();
                test.checkSeating(choice);
                test.printArray();
            }else{
                System.out.println("plz put in valid option");
            }
        } System.out.println("all seats sold out");
    }
}
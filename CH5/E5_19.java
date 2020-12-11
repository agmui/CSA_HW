package CH5;

import java.util.Scanner;

public class E5_19 {
    public static void main(String[] args) {
        String card = new Scanner(System.in).next();
        switch (card.substring(0, 1)) {
            case "2":
                System.out.print("Two");
                break;
            case "3":
                System.out.print("Three");
                break;
            case "4":
                System.out.print("Four");
                break;
            case "5":
                System.out.print("Five");
                break;
            case "6":
                System.out.print("Six");
                break;
            case "7":
                System.out.print("Seven");
                break;
            case "8":
                System.out.print("Eight");
                break;
            case "9":
                System.out.print("Nine");
                break;
            case "10":
                System.out.print("Ten");
                break;
            case "J":
                System.out.print("Jack");
                break;
            case "Q":
                System.out.print("Queen");
                break;
            case "K":
                System.out.print("King");
                break;
            case "A":
                System.out.print("Ace");
                break;
        } switch (card.substring(1, 2)) {
            case "H":
                System.out.print(" of Hearts");
                break;
            case "C":
                System.out.print(" of Clubs");
                break;
            case "D" :
                System.out.print(" of Diamonds");
                break;
            case "S":
                System.out.print(" of Spades");
                break;
        }
    }
}

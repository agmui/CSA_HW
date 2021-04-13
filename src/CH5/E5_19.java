/********************************
 * Anthony Mui
 * Period 2
 * E5.19
 * prints type and suite of a card
 ********************************/
package CH5;

import java.util.Scanner;

public class E5_19 {
    public static void main(String[] args) {
        String card = new Scanner(System.in).next();
        switch (card.substring(0, 1)) {
            case "2" -> System.out.print("Two");
            case "3" -> System.out.print("Three");
            case "4" -> System.out.print("Four");
            case "5" -> System.out.print("Five");
            case "6" -> System.out.print("Six");
            case "7" -> System.out.print("Seven");
            case "8" -> System.out.print("Eight");
            case "9" -> System.out.print("Nine");
            case "10" -> System.out.print("Ten");
            case "J" -> System.out.print("Jack");
            case "Q" -> System.out.print("Queen");
            case "K" -> System.out.print("King");
            case "A" -> System.out.print("Ace");
        }
        switch (card.substring(1, 2)) {
            case "H" -> System.out.print(" of Hearts");
            case "C" -> System.out.print(" of Clubs");
            case "D" -> System.out.print(" of Diamonds");
            case "S" -> System.out.print(" of Spades");
        }
    }
}

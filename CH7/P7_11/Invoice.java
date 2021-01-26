package CH7.P7_11;

import java.util.ArrayList;
import java.util.Scanner;

public class Invoice {
    ArrayList<Item> list;
    double total;
    boolean dog;
    public Invoice(){
        list = new ArrayList<Item>();
        total = 0;
        dog = false;
    }
    public void add(Item anItem){
        list.add(anItem);
        total += anItem.getPrice()*anItem.getQuantity();
        if (anItem.getIsPet()){
            dog = true;
        }
    }
    public double getDiscount(){
        if (dog && list.size() > 4) {
            total *= 0.8;
        }
        return total;
    }
    public static void main(String[] args) {
        Invoice receipt = new Invoice();
        while (true){
            System.out.print("input price: ");
            double price = new Scanner(System.in).nextDouble();
            System.out.print("dog? [Y] [N]: ");
            String YN = new Scanner(System.in).next();
            boolean isPet = false;
            if (YN.equals("Y")){
                isPet = true;
            }
            System.out.print("how many: ");
            int quantity = new Scanner(System.in).nextInt();
            Item i = new Item(price, isPet, quantity);
            receipt.add(i);
            System.out.print("done [Y][N]: ");
            String done = new Scanner(System.in).next();
            if (done.equals("Y")){
                break;
            }
        }
        for (Item i:receipt.list) {
            System.out.print(i.getQuantity());
            System.out.print(" x ");
            System.out.println(i.getPrice());
        }
        System.out.print("total: $");
        System.out.println(receipt.getDiscount());
    }
}
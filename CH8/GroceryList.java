package CH8;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<GroceryItemOrder> list;
    public GroceryList(){
        list = new ArrayList<>();
    }
    public void add(GroceryItemOrder item){
        if (list.size()>10){
            System.out.println("to many items");
        } else {
            list.add(item);
        }
    }
    public double getTotalCost(){
        double total = 0;
        for (Object o : list) {
            total += ((GroceryItemOrder) o).getCost() * ((GroceryItemOrder) o).getQuantity();
        }
        return total;
    }
    public static void main(String[] args) {
        GroceryItemOrder i1 = new GroceryItemOrder("dog", 1, 10);
        GroceryItemOrder i2 = new GroceryItemOrder("cat", 1, 10);
        GroceryItemOrder i3 = new GroceryItemOrder("milk", 2, 5);
        i2.setQuantity(2);
        GroceryList l = new GroceryList();
        l.add(i1);
        l.add(i2);
        l.add(i3);
        System.out.println("$ "+l.getTotalCost());
    }
}

class GroceryItemOrder {
    String name;
    int quantity;
    private final double price;
    public GroceryItemOrder(String name, int quantity, double pricePerUnit){
        this.name = name;
        this.quantity = quantity;
        this.price = pricePerUnit;
    }
    public double getCost(){
       return this.price;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public double getQuantity() {
        return this.quantity;
    }
}
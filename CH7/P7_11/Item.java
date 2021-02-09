/*
 * Anthony Mui
 * Period 1
 * E7.10
 * item class to define items
 * */
package CH7.P7_11;

public class Item {
    private final double price;
    private final boolean isPet;
    private final int quantity;
    public Item(double price, boolean isPet, int quantity){
        this.price = price;
        this.isPet = isPet;
        this.quantity = quantity;
    }
    public double getPrice(){
        return this.price;
    }
    public boolean getIsPet(){
        return this.isPet;
    }
    public int getQuantity(){
        return this.quantity;
    }
}
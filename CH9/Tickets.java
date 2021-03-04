package CH9;

public class Tickets {
    protected double price;
    private static int id = 0;
    public Tickets(){
        Tickets.id ++;
        price = 0;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Tickets{" +
                "id="+Tickets.id+
                "price=" + price +
                '}';
    }
}

class WalkupTicket extends Tickets{
    public WalkupTicket(){
        super();
        super.price = 50.00;
    }
}

class AdcanceTicket extends Tickets{
    public AdcanceTicket(int day){
        super();
        if (day >= 10){
            super.price = 30.00;
        } else {
            super.price = 40.00;
        }
    }
}

class StudentAdvanceTicket extends AdcanceTicket{
    public StudentAdvanceTicket(int day){
        super(day);
        if (day >= 10){
            super.price = 15.00;
        } else {
            super.price = 20.00;
        }
    }

    @Override
    public String toString() {
        return super.toString()+" (ID required)";
    }
}
class Test{
    public static void main(String[] args) {
        WalkupTicket test = new WalkupTicket();
        System.out.println(test.toString());
        AdcanceTicket test2 = new AdcanceTicket(1);
        System.out.println(test2.toString());
        StudentAdvanceTicket test3 = new StudentAdvanceTicket(10);
        System.out.println(test3.toString());
    }
}
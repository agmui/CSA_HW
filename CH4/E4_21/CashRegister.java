package CH4.E4_21;

/**
   A cash register totals up sales and computes change due.
*/
public class CashRegister
{
   private double purchase;
   private double payment;

   /**
      Constructs a cash register with no money in it.
   */
   public CashRegister()
   {
      purchase = 0;
      payment = 0;
   }

   /**
      Records the sale of an item.
      @param amount the price of the item
   */
   public void recordPurchase(double amount)
   {
      purchase = purchase + amount;
   }

   /**
      Processes a payment received from the customer.
      @param amount the amount of the payment
   */
   public void receivePayment(double amount) {
      payment = payment + amount;
   }
   public void enterDollars(int amount) {
      payment = payment + amount;
   }
   public void enterQ(int amount) {
      payment = payment + amount*.25;
   }
   public void enterN(int amount) {
      payment = payment + amount*.05;
   }
   public void enterD(int amount) {
      payment = payment + amount*.1;
   }
   public void enterP(int amount) {
      payment = payment + amount*.01;
   }

   /**
      Computes the change due and resets the machine for the next customer.
      @return the change due to the customer
   */
   public double giveChange()
   {   
      double change = payment - purchase;
      purchase = 0;
      payment = 0;
      return change;
   }
}

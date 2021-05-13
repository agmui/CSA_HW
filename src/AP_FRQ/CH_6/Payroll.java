package AP_FRQ.CH_6;

import java.util.Arrays;

public class Payroll {
    private int[] itemsSold = {48,50,37,62,38,70,55,37,64,60}; // number of items sold by each employee,
    private double[] wages = new double[itemsSold.length+1];
    public double computeBonusThreshold() {
        Arrays.sort(itemsSold);
        for (int i = 1; i < itemsSold.length-1; i++) {
            wages[itemsSold.length]+=itemsSold[i];
        }
        return wages[itemsSold.length]/(itemsSold.length-2.0);
    }
    public void computeWages(double fixedWage, double perItemWage) {
        for (int i = 0; i < itemsSold.length; i++) {
            wages[i] = (fixedWage + perItemWage * itemsSold[i]) * ((computeBonusThreshold()<=itemsSold[i]) ? 1.1: 1);
            System.out.println("fixedWage:"+fixedWage+" perItm:"+perItemWage+" itemSold:"+itemsSold[i]);
            System.out.println(wages[i]);
        }
    }

    public static void main(String[] args) {
        System.out.println(new Payroll().computeBonusThreshold());
        new Payroll().computeWages(10, 1.5);
    }
}

class Q1 {
    public static void main(String[] args) {
        String[] l =  {"ten", "fading", "post", "card", "thunder", "hinge", "trailing", "batting"};
        for (String i:l){
            if(i.endsWith("ing")){
                System.out.println(i);
            }
        }
    }
}

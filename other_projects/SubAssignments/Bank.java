/*
Anthony Mui
Period 1
Sub assignments
Bank class
 */
package other_projects.SubAssignments;

public class Bank {
    public static double presentValue(double F, double r, double n){
       return F*Math.pow(1+r, n);
    }

    public static void main(String[] args) {
        System.out.println(presentValue(1,1,1));
    }
}

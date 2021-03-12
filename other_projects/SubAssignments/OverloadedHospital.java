/*
Anthony Mui
Period 1
Sub assignments
Overloaded Hospitals
 */
package other_projects.SubAssignments;

import java.util.Scanner;

public class OverloadedHospital {
    public static Scanner s = new Scanner(System.in);
    public static double charges(double a,double b,double c,double d){
        return a+b+c+d;
    }
    public static double charges(double charges, double meds){
        return charges+meds;
    }
    public static void main(String[] args) {
        System.out.print("are you an in-patient [y][n]: ");
        String inOrOut = s.next();
        if (inOrOut.equals("y")) {
            System.out.print("# days spent in hospital: ");
            double daysSpentInHosptial = s.nextDouble();
            System.out.print("daily rates: ");
            double dailyRates = s.nextDouble();
            System.out.print("Med charges: ");
            double Meds = s.nextDouble();
            System.out.print("Hospital Services: ");
            double services = s.nextDouble();
            System.out.print("total: "+charges(daysSpentInHosptial, dailyRates, Meds, services));
        }
        else if (inOrOut.equals("n")) {
            System.out.print("# days spent in hospital: ");
            double hospitalServices = s.nextDouble();
            System.out.print("daily rates: ");
            double medication = s.nextDouble();
            System.out.print("total: $"+charges(hospitalServices, medication));
        }
    }
}

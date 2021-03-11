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
            System.out.println("# days spent in hospital: ");
            double daysSpentInHosptial = s.nextDouble();
            System.out.println("daily rates: ");
            double dailyRates = s.nextDouble();
            System.out.println("Med charges: ");
            double Meds = s.nextDouble();
            System.out.println("Hospital Services: ");
            double services = s.nextDouble();
            System.out.println("total: "+charges(daysSpentInHosptial, dailyRates, Meds, services));
        }
        else if (inOrOut.equals("n")) {
            System.out.println("# days spent in hospital: ");
            double hospitalServices = s.nextDouble();
            System.out.println("daily rates: ");
            double medication = s.nextDouble();
            System.out.println("total: $"+charges(hospitalServices, medication));
        }
    }
}

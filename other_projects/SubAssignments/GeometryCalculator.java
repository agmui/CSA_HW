package other_projects.SubAssignments;

import java.util.Scanner;

public class GeometryCalculator {
   public static void circle(int r){
       System.out.println(Math.pow(r, 2)+"pi");
   }
   public static void rect(int l, int w){
       System.out.println(l*w);
   }
   public static void triangle(int base, int height){
       System.out.println(base*height/2);
   }
   public static int invalidResponce(int x){
       if (x < 0){
           System.out.print("please input valid response: ");
           int a = new Scanner(System.in).nextInt();
           x = GeometryCalculator.invalidResponce(a);
       }
       return x;
   }
    public static void main(String[] args) {
       boolean stop = true;
        System.out.println("Geometry Calculator");
       while (stop){
            System.out.println("1. Calculate the Area of a a Circle");
           System.out.println("2. Calculate the Area of a a Rectangle");
           System.out.println("3. Calculate the Area of a a Triangle");
           System.out.println("4. Quit\n");
           System.out.print("Enter your choice (1-4): ");
           int x = new Scanner(System.in).nextInt();
           switch (x) {
               case 1 -> {
                   System.out.print("input radius: ");
                   int r = new Scanner(System.in).nextInt();
                   r = GeometryCalculator.invalidResponce(r);
                   GeometryCalculator.circle(r);
               }
               case 2 -> {
                   System.out.print("input length: ");
                   int l = new Scanner(System.in).nextInt();
                   l = GeometryCalculator.invalidResponce(l);
                   System.out.print("input width: ");
                   int w = new Scanner(System.in).nextInt();
                   w = GeometryCalculator.invalidResponce(w);
                   GeometryCalculator.rect(l, w);
               }
               case 3 -> {
                   System.out.print("input base: ");
                   int base = new Scanner(System.in).nextInt();
                   base = GeometryCalculator.invalidResponce(base);
                   System.out.print("input height: ");
                   int height = new Scanner(System.in).nextInt();
                   height = GeometryCalculator.invalidResponce(height);
                   GeometryCalculator.triangle(base, height);
               }
               case 4 -> stop = false;
           }

        }
    }
}

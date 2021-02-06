/*
 * Anthony Mui
 * Period 1
 * Sub assignment
 * finds area of basic shapes
 * */

package other_projects.SubAssignments;

import java.util.Scanner;

public class GeometryCalculator {
   public static void circle(float r){
       System.out.println(Math.pow(r, 2)+"pi");
   }
   public static void rect(float l, float w){
       System.out.println(l*w);
   }
   public static void triangle(float base, float height){
       System.out.println(base*height/2);
   }
   public static float invalidResponce(float x){
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
                   float r = new Scanner(System.in).nextFloat();
                   r = GeometryCalculator.invalidResponce(r);
                   GeometryCalculator.circle(r);
               }
               case 2 -> {
                   System.out.print("input length: ");
                   float l = new Scanner(System.in).nextFloat();
                   l = GeometryCalculator.invalidResponce(l);
                   System.out.print("input width: ");
                   float w = new Scanner(System.in).nextFloat();
                   w = GeometryCalculator.invalidResponce(w);
                   GeometryCalculator.rect(l, w);
               }
               case 3 -> {
                   System.out.print("input base: ");
                   float base = new Scanner(System.in).nextFloat();
                   base = GeometryCalculator.invalidResponce(base);
                   System.out.print("input height: ");
                   float height = new Scanner(System.in).nextFloat();
                   height = GeometryCalculator.invalidResponce(height);
                   GeometryCalculator.triangle(base, height);
               }
               case 4 -> stop = false;
           }

        }
    }
}

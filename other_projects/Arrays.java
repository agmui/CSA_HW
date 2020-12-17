package other_projects;

import java.util.Scanner;

public class Arrays{
  public static void main(String[] args) {
    System.out.print("How many days' temperatures? ");
    int x = new Scanner(System.in).nextInt();
    int[] temp = new int[x];
    float y = 0;
    int z = 0;
    for (int i = 0; i < x; i++) {
      System.out.print("Day "+(i+1)+"'s high temp: ");
      temp[i] = new Scanner(System.in).nextInt();
      y += temp[i];
    }
    for (int i : temp) {
      if(i > (y/x)){
        z++;
      }
    }
    System.out.println("Average temp = "+(y/x));
    System.out.println(z + " days were above average");
  }
}

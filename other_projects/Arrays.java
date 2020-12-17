package other_projects;

import java.util.Scanner;

public class Arrays{
  public static void main(String[] args) {
    System.out.print("input: ");
    int x = new Scanner(System.in).nextInt();
    int[] temp = new int[x];
    for (int i = 0; i < x; i++) {
      System.out.print("input day "+i+": ");
      temp[i] = new Scanner(System.in).nextInt();
    }
    System.out.print("temp");

  }
}

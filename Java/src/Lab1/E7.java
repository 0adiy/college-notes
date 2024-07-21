package Lab1;

import java.util.Scanner;

public class E7 {
  private static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {

    System.out.println("Enter your age: ");
    var age = sc.nextInt();

    sc.close();

    if (age <= 0 || age > 200)
      System.out.println("You are lying");
    else if (age < 18)
      System.out.println("Child");
    else if (age < 40)
      System.out.println("Adult");
    else
      System.out.println("Elderly");
  }
}

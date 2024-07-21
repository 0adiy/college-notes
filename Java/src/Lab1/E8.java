package Lab1;

import java.util.Scanner;

public class E8 {
  private static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {

    System.out.println("Enter num1: ");
    var num1 = sc.nextInt();

    System.out.println("Enter num2: ");
    var num2 = sc.nextInt();

    System.out.println((num1 > num2) ? "num1 is greater" : "num2 is greater");

  }
}

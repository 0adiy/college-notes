package Lab2;

import java.util.Scanner;

public class E6 {
  private static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {

    System.out.println("Enter your name: ");
    var name = sc.nextLine();

    System.out.println("Hello " + name);

    sc.close();
  }
}

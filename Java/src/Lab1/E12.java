package Lab1;

import java.util.Scanner;

public class E12 {
  private static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {

    System.out.println("Enter the size of array ");
    int size = sc.nextInt();
    int sum = 0;

    int array[] = new int[size];

    for (int i = 0; i < size; i++) {
      System.out.println("Enter element " + (i + 1) + ": ");
      int user_input = sc.nextInt();
      array[i] = user_input;

      sum += array[i];
    }

    System.out.println("Sum= " + sum);
    sc.close();
  }
}

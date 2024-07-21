package Lab1;

import java.util.Arrays;
import java.util.Scanner;

public class E11 {
  private static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {

    System.out.println("Enter the size of array ");
    int size = sc.nextInt();

    int array[] = new int[size];

    for (int i = 0; i < size; i++) {
      System.out.println("Enter element " + (i + 1) + ": ");
      int user_input = sc.nextInt();
      array[i] = user_input;
    }

    System.out.println(Arrays.toString(array));
    sc.close();
  }
}

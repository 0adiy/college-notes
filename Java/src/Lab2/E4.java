package Lab2;
/* Write a program to create an array of numbers taking input from the user. 
Input the number of elements from the user. 
Print the largest and the smallest element.
 */

import java.util.Arrays;
import java.util.Scanner;

public class E4 {
  private static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;

    System.out.println("No. of elements: ");
    var size = sc.nextInt();

    int arr[] = new int[size];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
      max = (arr[i] > max) ? arr[i] : max;
      min = (arr[i] < min) ? arr[i] : min;
    }

    System.out.println("Array is:\n" + Arrays.toString(arr));
    System.out.println("Max :" + max);
    System.out.println("Min :" + min);
    sc.close();
  }
}

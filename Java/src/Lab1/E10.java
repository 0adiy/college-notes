package Lab1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class E10 {
  public static void main(String[] arg) {
    try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));) {

      System.out.println("enter num1 : ");
      int n = Integer.parseInt(reader.readLine());

      System.out.println("enter num2 : ");
      int m = Integer.parseInt(reader.readLine());

      int sum = add(n, m);

      System.out.println("sum = " + sum);

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private static int add(int n, int m) {
    return m + n;
  }
}

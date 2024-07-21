package Lab1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class E9 {
  public static void main(String[] arg) {
    try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));) {

      System.out.println("enter num1 : ");
      int n = Integer.parseInt(reader.readLine());

      System.out.println("enter num2 : ");
      int m = Integer.parseInt(reader.readLine());

      float avg = (float) (m + n) / 2;

      System.out.println("avg =" + avg);

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
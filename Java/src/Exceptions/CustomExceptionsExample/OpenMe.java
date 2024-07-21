package Exceptions.CustomExceptionsExample;

public class OpenMe {
  public static void show() {
    var x = new Account();
    // Can't directly write the next line
    // x.withdraw(12);

    // So Exception Handling required
    try {
      x.withdraw(10);
    } catch (InsufficientBalanceException e) {
      e.printStackTrace();
    }
  }
}

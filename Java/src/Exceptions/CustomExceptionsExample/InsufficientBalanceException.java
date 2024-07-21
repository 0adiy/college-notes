package Exceptions.CustomExceptionsExample;

public class InsufficientBalanceException extends Exception {
  public InsufficientBalanceException(String msg) {
    super(msg);
  }

  public InsufficientBalanceException() {
    System.out.println("Insufficient balance");
  }

}

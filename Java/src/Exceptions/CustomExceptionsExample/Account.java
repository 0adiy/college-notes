package Exceptions.CustomExceptionsExample;

public class Account {
  // balance in account
  private float balance = 0f;

  // this will throw exception when money req is less than 0
  public void withdraw(float amt) throws InsufficientBalanceException {
    if (balance < amt) {
      throw new InsufficientBalanceException("You are not that rich");
    }
  }
}

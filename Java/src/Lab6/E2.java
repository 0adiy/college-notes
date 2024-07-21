package Lab6;

class A1 {
  A1(int a) {
    System.out.println("A=" + a);
  }
}

class B1 extends A1 {
  B1(int a, int b) {
    super(a);
    System.out.println("B=" + b);
  }
}

class C1 extends A1 {
  C1(int a, int b) {
    super(a);
    System.out.println("C=" + b);
  }
}

public class E2 {
  public static void main(String[] args) {
    B1 ob1 = new B1(10, 20);// 10 should reach class A and 20 should reach class B
    C1 ob2 = new C1(30, 40);// 30 should reach class A and 40 should reach class C
  }
}

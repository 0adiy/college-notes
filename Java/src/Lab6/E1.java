package Lab6;

class A {
  A(int a) {
    System.out.println("A=" + a);
  }
}

class B extends A {
  B(int a, int b) {
    super(a);
    System.out.println("B=" + b);
  }
}

class C extends B {
  C(int a, int b, int c) {
    super(a, b);
    System.out.println("C=" + c);
  }
}

public class E1 {
  public static void main(String[] args) {
    C c1 = new C(10, 20, 30);

  }
}

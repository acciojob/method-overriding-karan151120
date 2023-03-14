package com.driver;

public class Main {
  public static void main(String[] args) {
      B obj = new B();

      String m = obj.method();

      String n = obj.meth();

      System.out.println(m);
      System.out.println(n);
  }
}

class A {
    String meth() {
        return "Invoking method from class A";
    }
}
class B extends A{
    String method() {
        return super.meth();
    }

    @Override
    String meth() {
        return "Method is overridden in Extendend class B";
    }
}
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


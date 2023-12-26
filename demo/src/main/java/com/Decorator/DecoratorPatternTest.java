package com.Decorator;

public class DecoratorPatternTest {

  public static void main(String[] args) {
    Dress sportyDress = new CasualDress(new BasicDress());
    sportyDress.assemble();
  }
}

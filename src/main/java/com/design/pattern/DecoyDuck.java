package com.design.pattern;

public class DecoyDuck extends Duck implements Flyable {
  void quack() {
    // do nothing
  }

  public void fly() {
    System.out.println("Fly");
  }
}

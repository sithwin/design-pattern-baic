package com.design.pattern;

public class MallardDuck extends Duck implements Flyable, Quackable {
  @Override
  void display() {
    System.out.println("MallarDuck");
  }

  public void fly() {
    System.out.println("Fly");
  }

  @Override
  public void quack() {
    System.out.println("quack");
  }
}

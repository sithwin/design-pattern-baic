package com.design.pattern;

public class RedheadDuck extends Duck implements Flyable, Quackable {
  @Override
  void display() {
    System.out.println("RedheadDuck");
  }

  @Override
  public void fly() {
    System.out.println("fly");
  }

  @Override
  public void quack() {
    System.out.println("quack");
  }
}

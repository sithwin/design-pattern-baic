package com.design.pattern.strategy.quackBehaviour;

public class Squeak implements QuackBehaviour {
  @Override
  public void quack() {
    System.out.println("Squeak");
  }
}

package com.design.pattern.quackBehaviour;

public class Quack implements QuackBehaviour {
  @Override
  public void quack() {
    System.out.println("Normal Quack");
  }
}

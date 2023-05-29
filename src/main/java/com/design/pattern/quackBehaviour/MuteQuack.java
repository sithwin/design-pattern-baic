package com.design.pattern.quackBehaviour;

public class MuteQuack implements QuackBehaviour{
  @Override
  public void quack() {
    System.out.println("Quack");
  }
}

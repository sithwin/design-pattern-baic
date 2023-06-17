package com.design.pattern.strategy.quackBehaviour;

public class MuteQuack implements QuackBehaviour{
  @Override
  public void quack() {
    System.out.println("Quack");
  }
}

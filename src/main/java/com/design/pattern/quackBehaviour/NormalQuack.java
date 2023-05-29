package com.design.pattern.quackBehaviour;

public class NormalQuack implements Quackable{
  @Override
  public void quack() {
    System.out.println("Normal Quack");
  }
}

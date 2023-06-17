package com.design.pattern.strategy;

import com.design.pattern.strategy.flyBehaviour.FlyBehaviour;
import com.design.pattern.strategy.quackBehaviour.QuackBehaviour;

public class MallardDuck extends Duck {
  QuackBehaviour quackBehaviour;
  FlyBehaviour flyBehaviour;

  public MallardDuck(FlyBehaviour flyBehaviour, QuackBehaviour quackBehaviour) {
    this.quackBehaviour = quackBehaviour;
    this.flyBehaviour = flyBehaviour;
  }

  @Override
  void display() {
    System.out.println("MallarDuck");
    flyBehaviour.fly();
    quackBehaviour.quack();
  }
}

package com.design.pattern.strategy;

import com.design.pattern.strategy.flyBehaviour.FlyBehaviour;
import com.design.pattern.strategy.quackBehaviour.QuackBehaviour;

public class RedheadDuck extends Duck {
  private FlyBehaviour flyBehaviour;
  private QuackBehaviour quackBehaviour;

  public RedheadDuck(FlyBehaviour flyBehaviour, QuackBehaviour quackBehaviour) {
    this.flyBehaviour = flyBehaviour;
    this.quackBehaviour = quackBehaviour;
  }

  @Override
  void display() {
    System.out.println("RedheadDuck");
    flyBehaviour.fly();
    quackBehaviour.quack();
  }
}

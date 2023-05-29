package com.design.pattern;

import com.design.pattern.flyBehaviour.FlyBehaviour;
import com.design.pattern.quackBehaviour.QuackBehaviour;

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

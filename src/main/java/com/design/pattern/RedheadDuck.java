package com.design.pattern;

import com.design.pattern.flyBehaviour.Flyable;
import com.design.pattern.quackBehaviour.Quackable;

public class RedheadDuck extends Duck {
  private Flyable flyable;
  private Quackable quackable;

  public RedheadDuck(Flyable flyable, Quackable quackable) {
    this.flyable = flyable;
    this.quackable = quackable;
  }

  @Override
  void display() {
    System.out.println("RedheadDuck");
    flyable.fly();
    quackable.quack();
  }
}

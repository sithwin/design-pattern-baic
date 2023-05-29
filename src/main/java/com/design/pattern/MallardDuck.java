package com.design.pattern;

import com.design.pattern.flyBehaviour.Flyable;
import com.design.pattern.quackBehaviour.Quackable;

public class MallardDuck extends Duck {
  Quackable quackable;
  Flyable flyable;

  public MallardDuck(Flyable flyable, Quackable quackable) {
    this.quackable = quackable;
    this.flyable = flyable;
  }

  @Override
  void display() {
    System.out.println("MallarDuck");
    flyable.fly();
    quackable.quack();
  }
}

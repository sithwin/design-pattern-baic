package com.design.pattern.strategy.flyBehaviour;

public class FlyNoWing implements FlyBehaviour{
  @Override
  public void fly() {
    System.out.println("Fly now wing");
  }
}

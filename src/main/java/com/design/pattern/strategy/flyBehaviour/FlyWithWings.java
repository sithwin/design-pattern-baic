package com.design.pattern.strategy.flyBehaviour;

public class FlyWithWings implements FlyBehaviour {
  @Override
  public void fly() {
    System.out.println("Fly with wings");
  }
}

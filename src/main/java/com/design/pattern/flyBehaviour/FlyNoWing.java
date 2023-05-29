package com.design.pattern.flyBehaviour;

public class FlyNoWing implements FlyBehaviour{
  @Override
  public void fly() {
    System.out.println("Fly now wing");
  }
}

package com.patterns.strategy;

public abstract class Duck {
  
  FlyBehavior flyBehavior;
  QuackBehavior quackBehavior;
  
  public Duck() {
    display();
  }
  
  public void swim() {
    System.out.println("All ducks float");
  }
  
  public abstract void display();
  
  public void performFly() {
	  flyBehavior.fly();
  }
  
  public void performQuack() {
	  quackBehavior.quack();
  }
  
  public void setFlyBehavior(FlyBehavior fb) {
	  flyBehavior = fb;
  }
  
  public void setQuackBehavior(QuackBehavior qb) {
	  quackBehavior = qb;
  }
  
}
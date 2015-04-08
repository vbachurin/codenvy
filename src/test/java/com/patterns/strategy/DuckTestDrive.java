package com.patterns.strategy;

public class DuckTestDrive {
  
  public static void main(String[] args) {

    Duck mallard = new MallardDuck();
    mallard.performFly();
    mallard.performQuack();
    

    Duck model = new ModelDuck();
    model.performFly();
    model.performQuack();
    model.setFlyBehavior(new FlyRocketPowered());
    model.performFly();
    
    
}
}

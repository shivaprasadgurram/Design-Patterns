package com.shivaprasad.strategy;

public class GermanShepard extends Dog{

    public GermanShepard() {
        eatBehavior = new ProtienDiet();
        barkBehavior = new MuteBark();
    }

    public void display() {
        System.out.println("I'm a MuteBark GermanShepard");
    }
}

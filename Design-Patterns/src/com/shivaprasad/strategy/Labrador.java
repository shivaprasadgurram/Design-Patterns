package com.shivaprasad.strategy;

public class Labrador extends Dog{

    public Labrador() {
        eatBehavior = new NormalDiet();
        barkBehavior = new PlayFullBark();
    }

    public void display() {
        System.out.println("I'm a playful Labrador");
    }
}

package com.shivaprasad.strategy;

import com.shivaprasad.strategy.interfaces.EatBehavior;

public class ProtienDiet implements EatBehavior {


    @Override
    public void eat() {
        System.out.println("This is a protein diet");
    }
}

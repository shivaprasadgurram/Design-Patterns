package com.shivaprasad.strategy;

import com.shivaprasad.strategy.interfaces.EatBehavior;

public class NormalDiet implements EatBehavior {

    @Override
    public void eat() {
        System.out.println("This is a normal diet");
    }
}

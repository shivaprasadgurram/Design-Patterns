package com.shivaprasad.strategy;

import com.shivaprasad.strategy.interfaces.BarkBehavior;

public class Growl implements BarkBehavior {


    @Override
    public void bark() {
        System.out.println("This is a growl");
    }
}

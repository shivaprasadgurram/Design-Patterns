package com.shivaprasad.strategy;

import com.shivaprasad.strategy.interfaces.BarkBehavior;

public class PlayFullBark implements BarkBehavior {


    @Override
    public void bark() {
        System.out.println("Bark! Bark!");
    }
}

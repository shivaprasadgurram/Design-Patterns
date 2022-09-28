package com.shivaprasad.strategy;

import com.shivaprasad.strategy.interfaces.BarkBehavior;
import com.shivaprasad.strategy.interfaces.EatBehavior;

public class Dog {

    EatBehavior eatBehavior;
    BarkBehavior barkBehavior;

    public Dog() {}

    public void doBark() {
        barkBehavior.bark();
    }

    public void doEat() {
        eatBehavior.eat();
    }

    public void setEatBehavior(EatBehavior eatBehavior) {
        this.eatBehavior = eatBehavior;
    }

    public void setBarkBehavior(BarkBehavior barkBehavior) {
        this.barkBehavior = barkBehavior;
    }
}

package com.shivaprasad.strategy;

public class App {

    public static void main(String[] args) {

        Labrador dog = new Labrador();

        dog.doBark();
        dog.doEat();
        dog.display();


        System.out.println("After adding dynamic polymorphism");
        Labrador dog1 = new Labrador();

        dog1.doBark();
        dog1.doEat();;
        dog1.setEatBehavior(new ProtienDiet());
        dog1.doEat();
        dog1.display();

        System.out.println("GermanShepard");

        GermanShepard germanShepard = new GermanShepard();
        germanShepard.doBark();
        germanShepard.doEat();
        germanShepard.setBarkBehavior(new Growl());
        germanShepard.doBark();
        germanShepard.display();
    }
}

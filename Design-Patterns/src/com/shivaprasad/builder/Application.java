package com.shivaprasad.builder;

import com.shivaprasad.builder.cars.Car;
import com.shivaprasad.builder.cars.Manual;
import com.shivaprasad.builder.director.Director;

public class Application {
        public static void main(String[] args) {
                Director director = new Director();

                CarBuilder builder = new CarBuilder();
                director.constructSportsCar(builder);

                Car car = builder.getResult();
                System.out.println("Car built:\n" + car.getCarType());

                CarManualBuilder manualBuilder = new CarManualBuilder();

                // Director may know several building recipes.
                director.constructSportsCar(manualBuilder);
                Manual carManual = manualBuilder.getResult();
                System.out.println("\nCar manual built:\n" + carManual.print());
        }
}

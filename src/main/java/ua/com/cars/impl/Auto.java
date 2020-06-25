package ua.com.cars.impl;

import ua.com.cars.Car;
import ua.com.cars.Model;

public record Auto(Model model, String color, int speed) implements Car {
    public void start(int speed) {
        System.out.println("starts " + color + " " + model + " with speed " + speed + "km/h");
    }
    public void move() {
        System.out.println("move " + color + " " + model + " with speed " + speed() + "km/h");
    }
    public void stop(int speed) {
        System.out.println("stop " + color + " " + model + " with speed " + speed + "km/h");
    }
}

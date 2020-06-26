package ua.com.cars.impl;

import lombok.NoArgsConstructor;
import ua.com.cars.Car;
import ua.com.cars.Model;

@NoArgsConstructor
public class Auto implements Car {
    private Model model;
    private String color;

    public void setModel(Model model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void start(int speed) {
        System.out.println("starts " + color + " " + model + " with speed " + speed + "km/h");
    }

    public void move(int speed) {
        System.out.println("move " + color + " " + model + " with speed " + speed + "km/h");
    }

    public void stop(int speed) {
        System.out.println("stop " + color + " " + model + " with speed " + speed + "km/h");
    }
}

package ua.com;

import ua.com.cars.Menu;
import ua.com.figure.CounterClass;
import ua.com.figure.impl.Circle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Write radius for circle: ");
        double radius = Double.parseDouble(bufferedReader.readLine());
        Circle circle = new Circle(radius);
        System.out.println("Square circle: " + circle.getSquare());
        new CounterClass();
        new CounterClass();
        new CounterClass();
        System.out.println("Counter Class: " + CounterClass.getCounter());
        Menu menu = new Menu();
        menu.printMenu();
        menu.printMenuChoiceAction();
    }
}


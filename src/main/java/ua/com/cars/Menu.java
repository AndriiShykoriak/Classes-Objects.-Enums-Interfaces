package ua.com.cars;

import ua.com.cars.impl.Auto;

import java.util.Scanner;

public class Menu {
    Auto bmw = new Auto(Model.BMW, "black", 220);
    Auto bentley = new Auto(Model.BENTLEY, "white", 180);
    Auto audi = new Auto(Model.AUDI, "red", 199);
    Auto chevrolet = new Auto(Model.CHEVROLET, "green", 140);
    Auto dodge = new Auto(Model.DODGE, "blue", 280);
    Auto ford = new Auto(Model.FORD, "grey", 160);
    Auto lamborghini = new Auto(Model.LAMBORGHINI, "gold", 300);

    public void printMenu() {
        System.out.println();
        System.out.println("choose number car");
        System.out.println("1-BMW 2-BENTLEY 3-AUDI 4-CHEVROLET 5-DODGE 6-FORD 7-LAMBORGHINI 8-exit");
    }

    public void printMenuChoiceAction() {
        Scanner scanner = new Scanner(System.in);
        loop:
        while (scanner.hasNextInt()) {
            String numberMenu = scanner.nextLine();

            switch (numberMenu) {
                case "1", "2", "3", "4", "5", "6", "7" -> {
                    printMenuCaseCar(numberMenu);
                    System.out.println("switch on engine?");
                    printMenuCaseEngine();
                    loopBMW:
                    while (scanner.hasNext()) {
                        String s = scanner.nextLine();
                        switch (s) {
                            case "yes" -> printMenuCaseStart(numberMenu);
                            case "no", "1" -> printMenuCaseStop(numberMenu);
                            case "2" -> printMenuCaseMove(numberMenu);
                            case "3" -> {
                                printMenu();
                                break loopBMW;
                            }
                            default -> System.out.println("choose next action: 3-change car");
                        }
                    }
                }
                case "8" -> {
                    break loop;
                }
                default -> System.out.println("error, try again");
            }
        }
    }

    public void printMenuCaseEngine() {
        System.out.println("yes or no");
    }

    public void printMenuCaseCar(String numberMenu) {
        if (numberMenu.contains("1")) {
            System.out.println(Model.BMW);
        } else if (numberMenu.contains("2")) {
            System.out.println(Model.BENTLEY);
        } else if (numberMenu.contains("3")) {
            System.out.println(Model.AUDI);
        } else if (numberMenu.contains("4")) {
            System.out.println(Model.CHEVROLET);
        } else if (numberMenu.contains("5")) {
            System.out.println(Model.DODGE);
        } else if (numberMenu.contains("6")) {
            System.out.println(Model.FORD);
        } else if (numberMenu.contains("7")) {
            System.out.println(Model.LAMBORGHINI);
        }
    }

    public void printMenuCaseStart(String numberMenu) {
        if (numberMenu.contains("1")) {
            bmw.start(10);
        } else if (numberMenu.contains("2")) {
            bentley.start(12);
        } else if (numberMenu.contains("3")) {
            audi.start(7);
        } else if (numberMenu.contains("4")) {
            chevrolet.start(8);
        } else if (numberMenu.contains("5")) {
            dodge.start(20);
        } else if (numberMenu.contains("6")) {
            ford.start(11);
        } else if (numberMenu.contains("7")) {
            lamborghini.start(30);
        }
        System.out.println("choose next action: 1-stop 2-move 3-change car");
    }

    public void printMenuCaseStop(String numberMenu) {
        if (numberMenu.contains("1")) {
            bmw.stop(0);
        } else if (numberMenu.contains("2")) {
            bentley.stop(0);
        } else if (numberMenu.contains("3")) {
            audi.stop(0);
        } else if (numberMenu.contains("4")) {
            chevrolet.stop(0);
        } else if (numberMenu.contains("5")) {
            dodge.stop(0);
        } else if (numberMenu.contains("6")) {
            ford.stop(0);
        } else if (numberMenu.contains("7")) {
            lamborghini.stop(0);
        }
        System.out.println("choose next action: 1-stop 2-move 3-change car");
    }

    public void printMenuCaseMove(String numberMenu) {
        if (numberMenu.contains("1")) {
            bmw.move();
        } else if (numberMenu.contains("2")) {
            bentley.move();
        } else if (numberMenu.contains("3")) {
            audi.move();
        } else if (numberMenu.contains("4")) {
            chevrolet.move();
        } else if (numberMenu.contains("5")) {
            dodge.move();
        } else if (numberMenu.contains("6")) {
            ford.move();
        } else if (numberMenu.contains("7")) {
            lamborghini.move();
        }
        System.out.println("choose next action: 1-stop 2-move 3-change car");
    }
}

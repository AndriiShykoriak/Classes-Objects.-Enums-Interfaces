package ua.com.cars;

import ua.com.cars.impl.Auto;

import java.util.Scanner;

public class Menu {
    Auto auto = new Auto();
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
            auto.setColor("black");
            auto.setModel(Model.BMW);
        } else if (numberMenu.contains("2")) {
            System.out.println(Model.BENTLEY);
            auto.setColor("white");
            auto.setModel(Model.BENTLEY);
        } else if (numberMenu.contains("3")) {
            System.out.println(Model.AUDI);
            auto.setColor("red");
            auto.setModel(Model.AUDI);
        } else if (numberMenu.contains("4")) {
            System.out.println(Model.CHEVROLET);
            auto.setColor("blue");
            auto.setModel(Model.CHEVROLET);
        } else if (numberMenu.contains("5")) {
            System.out.println(Model.DODGE);
            auto.setColor("green");
            auto.setModel(Model.DODGE);
        } else if (numberMenu.contains("6")) {
            System.out.println(Model.FORD);
            auto.setColor("grey");
            auto.setModel(Model.FORD);
        } else if (numberMenu.contains("7")) {
            System.out.println(Model.LAMBORGHINI);
            auto.setColor("gold");
            auto.setModel(Model.LAMBORGHINI);
        }
    }

    public void printMenuCaseStart(String numberMenu) {
        if (numberMenu.contains("1")) {
            auto.start(10);
        } else if (numberMenu.contains("2")) {
            auto.start(12);
        } else if (numberMenu.contains("3")) {
            auto.start(7);
        } else if (numberMenu.contains("4")) {
            auto.start(8);
        } else if (numberMenu.contains("5")) {
            auto.start(20);
        } else if (numberMenu.contains("6")) {
            auto.start(11);
        } else if (numberMenu.contains("7")) {
            auto.start(30);
        }
        System.out.println("choose next action: 1-stop 2-move 3-change car");
    }

    public void printMenuCaseStop(String numberMenu) {
        if (numberMenu.contains("1")) {
            auto.stop(0);
        } else if (numberMenu.contains("2")) {
            auto.stop(0);
        } else if (numberMenu.contains("3")) {
            auto.stop(0);
        } else if (numberMenu.contains("4")) {
            auto.stop(0);
        } else if (numberMenu.contains("5")) {
            auto.stop(0);
        } else if (numberMenu.contains("6")) {
            auto.stop(0);
        } else if (numberMenu.contains("7")) {
            auto.stop(0);
        }
        System.out.println("choose next action: 1-stop 2-move 3-change car");
    }

    public void printMenuCaseMove(String numberMenu) {
        if (numberMenu.contains("1")) {
            auto.move(220);
        } else if (numberMenu.contains("2")) {
            auto.move(180);
        } else if (numberMenu.contains("3")) {
            auto.move(299);
        } else if (numberMenu.contains("4")) {
            auto.move(140);
        } else if (numberMenu.contains("5")) {
            auto.move(280);
        } else if (numberMenu.contains("6")) {
            auto.move(160);
        } else if (numberMenu.contains("7")) {
            auto.move(300);
        }
        System.out.println("choose next action: 1-stop 2-move 3-change car");
    }
}

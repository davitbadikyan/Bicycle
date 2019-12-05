package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your bike name: ");
        String name = scanner.nextLine();
        System.out.print("Input your bike type: ");
        String type = scanner.nextLine();
        System.out.print("Input your bike color: ");
        String color = scanner.nextLine();
        System.out.print("Input your bike size: ");
        int size = scanner.nextInt();

        Bicycle bicycle = new Bicycle(name, type, color, size);
        bicycle.setBreakType("Disc");
        bicycle.setWheelsCount(2);
        bicycle.setHasBreak(true);
        bicycle.start();

        for (int i = 0; i < 10; i++) {
            bicycle.accelerate();
        }
        bicycle.turnLeft();
        bicycle.turnLeft();
        for (int i = 0; i < 5; i++) {
            bicycle.pressBreak();
        }
        bicycle.turnRight();
        bicycle.turnRight();
        for (int i = 0; i < 5; i++) {
            bicycle.accelerate();
        }
        bicycle.turnLeft();
        bicycle.turnRight();
        bicycle.stop();
    }
}

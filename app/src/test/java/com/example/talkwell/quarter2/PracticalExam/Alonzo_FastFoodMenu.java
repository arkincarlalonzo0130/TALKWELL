package com.example.talkwell.quarter2.PracticalExam;

import java.util.Scanner;

public class Alonzo_FastFoodMenu {
    public void start(Scanner scanner) {

        boolean running = true;

        while (running) {

            System.out.println("=== FAST FOOD MENU===");
            System.out.println("1. Burger");
            System.out.println("2. Fries");
            System.out.println("3. I would not like to order");
            System.out.print("Welcome to Fast Food! What would you like to order?:");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    orderBurger(scanner);
                    break;

                case 2:
                    orderFries();
                    break;

                case 3:
                    System.out.println("Come again soon!");
                    running = false;
                    break;

                default:
                    System.out.println("It appears that isn't on the menu. Please choose again!");
            }
        }
    }

    private void orderBurger(Scanner scanner) {

        System.out.println("\n=== BURGER OPTIONS ===");
        System.out.println("1. Combo Meal");
        System.out.println("2. Solo Meal");

        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("You have ordered the Burger Combo Meal!");
        } else if (choice == 2) {
            System.out.println("You have ordered the Burger Solo Meal!");
        } else {
            System.out.println("INVALID OPTION");
        }
    }

    private void orderFries() {
        System.out.println("You have order Fries!");
    }
}

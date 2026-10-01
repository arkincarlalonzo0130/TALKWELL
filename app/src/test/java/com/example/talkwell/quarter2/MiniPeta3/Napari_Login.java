package com.example.sampleapplicationfordemo.quarter2.practicalexam;

import java.util.Scanner;

public class FastFoodMenu {

    public void start(Scanner scanner) {

        boolean running = true;

        while (running) {

            System.out.println("\n===== FAST FOOD MENU =====");
            System.out.println("1. Order Burger");
            System.out.println("2. Order Fries");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    orderBurger(scanner);
                    break;

                case 2:
                    orderFries();
                    break;

                case 3:
                    System.out.println("Thank you for ordering!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private void orderBurger(Scanner scanner) {

        System.out.println("\n===== BURGER OPTIONS =====");
        System.out.println("1. Combo");
        System.out.println("2. Solo");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("Burger Combo ordered.");
        } else if (choice == 2) {
            System.out.println("Burger Solo ordered.");
        } else {
            System.out.println("Invalid burger option.");
        }
    }

    private void orderFries() {
        System.out.println("Fries ordered.");
    }
}

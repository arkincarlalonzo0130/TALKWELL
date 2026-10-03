package com.example.talkwell.quarter2.PracticalExam;

import java.util.Scanner;

public class Napari_FastFoodMenu {

    public void start(Scanner scanner) {

        boolean running = true;

        while (running) {

            System.out.println("=== FAST FOOD MENU ===");
            System.out.println("1. Burger");
            System.out.println("2. Fries");
            System.out.println("3. I would not like to order");
            System.out.print("Welcome to Fast Food! What would you like to order?: ");

            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("You selected Burger.");
            } else if (choice == 2) {
                System.out.println("You selected Fries.");
            } else if (choice == 3) {
                System.out.println("Thank you! Have a nice day!");
                running = false;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}



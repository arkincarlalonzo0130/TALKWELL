package com.example.talkwell.quarter2;

import java.util.Scanner;

public class Rocha_CinemaTicketing {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variables
        int age = 0;
        String selectedMovie = "";
        double ticketPrice = 400.00; // Flat ticket price
        double seatPrice = 0.0;
        double walletBalance = 1800.00; // Default wallet balance
        boolean hasTicket = false;
        boolean running = true;

        System.out.println("=========================================");
        System.out.println("     ONLINE CINEMA TICKETING SYSTEM      ");
        System.out.println("=========================================");

        // Step 1: Age Input
        System.out.print("Enter your age: ");
        if (scanner.hasNextInt()) {
            age = scanner.nextInt();
        }

        // Age Check: Underage declined completely
        if (age < 18) {
            System.out.println("\n ACCESS DENIED: You must be at least 18 years old.");
            System.out.println("Exiting system...");
            scanner.close();
            return; // Stops the program completely
        }

        System.out.println(" Access Granted! Welcome to the cinema.");

        // Step 2: Main Menu Loop
        while (running) {
            System.out.println("\n---------------- MAIN MENU ----------------");
            System.out.println("1. Buy Ticket");
            System.out.println("2. Pay for Seat");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.println("-------------------------------------------");
            System.out.print("Choose an option (1-4): ");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Enter a number.");
                scanner.next();
                continue;
            }

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    if (hasTicket) {
                        System.out.println("You already bought a ticket!");
                    } else if (walletBalance < ticketPrice) {
                        System.out.println("Insufficient balance to buy a ticket.");
                    } else {
                        walletBalance -= ticketPrice;
                        hasTicket = true;
                        System.out.println("Ticket purchased successfully! Remaining balance: PHP " + walletBalance);
                    }
                    break;
                case 2:
                    if (!hasTicket) {
                        System.out.println("Please buy a ticket first before paying for a seat!");
                    } else {
                        System.out.println("Seat payment completed.");
                    }
                    break;
                case 3:
                    System.out.println("Current wallet balance: PHP " + walletBalance);
                    break;
                case 4:
                    System.out.println("Thank you for using the Online Cinema Ticketing System!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option! Please enter a number between 1 and 4.");
                    break;
            }
        }
        scanner.close();
    }
}


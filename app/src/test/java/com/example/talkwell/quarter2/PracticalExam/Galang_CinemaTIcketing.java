package com.example.talkwell.quarter2.PracticalExam;

import java.util.Scanner;

public class Galang_CinemaTIcketing {

    public void start(Scanner scanner) {
        runSystem(scanner);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        runSystem(scanner);
    }

    private static void runSystem(Scanner scanner) {
        int age = 0;
        boolean running = true;

        System.out.println("|||WELCOME TO THE CINEMA|||");

        while (running && scanner.hasNextInt()) {
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("enter your age");
                if (scanner.hasNextInt()) {
                    age = scanner.nextInt();
                }

                if (age < 18) {
                    System.out.println("ACCESS DENIED");
                    System.out.println("SYSTEM CLOSING...");
                    return;
                } else {
                    System.out.println("TICKET PRINTING....");
                }
            } else if (choice == 2) {
                System.out.println("Food Menu");
                System.out.println("choose your snacks");
                System.out.println("1. popcorn");
                System.out.println("2. fries");
                System.out.println("3. coke");
                System.out.println("4. water");

                if (scanner.hasNextInt()) {
                    int foodMenu = scanner.nextInt();
                }
                System.out.println("Thanks for ordering!");
                System.out.println("You can pick your snacks up on the counter");
            } else if (choice == 3) {
                System.out.println("THANK YOU");
                System.out.println("PLEASE PROCEED IN LINE...");
                System.out.println("SYSTEM CLOSING...");
                running = false;
            }
        }
    }
}

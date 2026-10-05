package com.example.talkwell.quarter2.PracticalExam;

import java.util.Scanner;

public class Galang_CinemaTIcketing {

}
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.println("|||WELCOME TO THE CINEMA|||")
        System.out.println("1. choose buy ticket")

        if (choice == 1) {
            System.out.println("enter your age");
            if (scanner.hasNextInt()) {
                age = scanner.nextInt();
            }

            if (age < 18){
                System.out.println("ACCESS DENIED")
                System.out.println("SYSTEM CLOSING...")
                scanner.close();
                return;
            } else {
                System.out.println("TICKET PRINTING....")
            }

            System.out.println("2. choose buy snacks")
            System.out.println("3. exit")

            if (choice == 3) {
                System.out.println("THANK YOU")
                System.out.println("PLEASE PROCEED IN LINE...")
                System.out.println("SYSTEM CLOSING...")
                scanner.close();
                return;
            }

            if (choice == 2) {
                int foodMenu;
                Scanner input = new Scanner(System.in);
                System.out.println("Food Menu");
                System.out.println("choose your snacks");
                System.out.println("1. popcorn");
                System.out.println("2. fries");
                System.out.println("3. coke");
                System.out.println("4. water");

                foodMenu = input.nextInt();
                System.out.println("Thanks for ordering!");
                System.out.println("You can pick your snacks up on the counter");
                return selection;
                scanner.close();
            }
        }
    }
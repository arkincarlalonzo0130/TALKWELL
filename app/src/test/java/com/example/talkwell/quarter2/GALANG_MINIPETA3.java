package com.example.talkwell.quarter2;

import java.util.Scanner;

public class GALANG_MINIPETA3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("===== STUDENT WELLNESS SURVEY =====");
        System.out.println("please answer honestly to the questions below");

        // Yes/No Questions
        System.out.print("1. Do you enjoy studying? (true/false): ");
        boolean q1 = input.nextBoolean();

        System.out.print("2. Do you get at least 8 hours of sleep? (true/false): ");
        boolean q2 = input.nextBoolean();

        System.out.print("3. Do you exercise regularly? (true/false): ");
        boolean q3 = input.nextBoolean();

        // Rating Questions (1-10)
        System.out.print("4. Rate your stress level (1-10): ");
        int stress = input.nextInt();

        System.out.print("5. Rate your happiness (1-10): ");
        int happiness = input.nextInt();
    }
}

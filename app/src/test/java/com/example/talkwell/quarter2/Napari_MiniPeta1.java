package com.example.talkwell.quarter2;

import org.junit.Test;

public class Napari_MiniPeta1 {
    @Test
    public void printMyProfile() {
        // --- 1. THE INPUT (Storing your personal details in variables) ---
        String myName = "Napari";
        String petName = "Pillow";
        String favFood = "Alfredo";
        int myAge = 16;

        // --- 2. THE OUTPUT (Printing to console) ---
        System.out.println("--- MY DIGITAL PROFILE ---");
        System.out.println("Hello, my name is " + myName + " and I am " + myAge + " years old.");
        System.out.println("I have a wondeful pet named " + petName + ".");
        System.out.println("If I could, I would eat " + favFood + " every single day!");
    }
}

package com.example.talkwell.quarter2;

import org.junit.Test;
public class Galang_MiniPeta1 {
    @Test
    public void printMyProfile() {
        String myName = "Julia" ;
        String petName = "dead" ;
        String favFood = "coffee jelly" ;
        int myAge = 16;

        System.out.println("---MY DIGITAL PROFILE---");
        System.out.println("Hello, my name is " + myName + " and Im " + myAge + " yrs old") ;
        System.out.println("I have a wonderful pet but unfortunately they're " + petName);
        System.out.println("If I could, I would eat " + favFood + " every single day");
    }
}
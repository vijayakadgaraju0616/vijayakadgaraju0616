package com.learningjava.Assignment1;

public class CheckNumber {
    public static void main(String[] args) {
        int number = 15; // input is hardcoded here

        if (number > 0) {
            System.out.println(number + " is positive");
        } else if (number < 0) {
            System.out.println(number + " is negative");
        } else {
            System.out.println(number + " is zero");
        }
    }
}


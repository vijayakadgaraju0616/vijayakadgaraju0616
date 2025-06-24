package com.learningjava.Assignment1;

public class table {
    public static void main(String[] args) {
        // Outer loop for tables from 1 to 5
        for (int table = 1; table <= 5; table++) {
            System.out.println("Multiplication Table for " + table + ":");

            // Inner loop for 1 to 10 multiplication
            for (int i = 1; i <= 10; i++) {
                System.out.println(table + " x " + i + " = " + (table * i));
            }

            System.out.println(); // Add a blank line between tables
        }
    }
}
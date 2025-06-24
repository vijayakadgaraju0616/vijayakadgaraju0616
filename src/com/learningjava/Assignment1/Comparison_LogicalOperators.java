package com.learningjava.Assignment1;

public class Comparison_LogicalOperators {
        public static void main(String[] args) {
            int a = 10;
            int b = 5;

            // Comparison Operators
            System.out.println("a == b: " + (a == b));     // false
            System.out.println("a != b: " + (a != b));     // true
            System.out.println("a < b: " + (a < b));       // false
            System.out.println("a > b: " + (a > b));       // true
            System.out.println("a <= b: " + (a <= b));     // false
            System.out.println("a >= b: " + (a >= b));     // true

            // Logical Operators
            System.out.println("Logical AND (a > 5 && b < 10): " + (a > 5 && b < 10)); // true
            System.out.println("Logical OR (a < 5 || b < 10): " + (a < 5 || b < 10));   // true
            System.out.println("Logical NOT !(a == b): " + !(a == b));                 // true
        }
    }



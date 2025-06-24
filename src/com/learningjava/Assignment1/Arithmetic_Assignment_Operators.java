package com.learningjava.Assignment1;

public class Arithmetic_Assignment_Operators {
    public static void main(String[] args) {
        // Initial values
        int a = 10;
        int b = 5;

        // Arithmetic Operators
        int addition = a + b;        // 10 + 5 = 15
        int subtraction = a - b;     // 10 - 5 = 5
        int multiplication = a * b;  // 10 * 5 = 50
        int division = a / b;        // 10 / 5 = 2
        int modulus = a % b;         // 10 % 5 = 0

        // Display arithmetic results
        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
        System.out.println("Modulus: " + modulus);

        // Assignment Operators
        int x = 10;
        System.out.println("\nInitial value of x: " + x);

        x += 5;  // x = x + 5
        System.out.println("After x += 5: " + x);

        x -= 3;  // x = x - 3
        System.out.println("After x -= 3: " + x);

        x *= 2;  // x = x * 2
        System.out.println("After x *= 2: " + x);

        x /= 4;  // x = x / 4
        System.out.println("After x /= 4: " + x);
    }
}



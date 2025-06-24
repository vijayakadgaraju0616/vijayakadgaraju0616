package com.learningjava.Assignment1;

public class StarPatten {
        public static void main(String[] args) {
            int size = 4; // Input size

            // Right Triangle Pattern
            System.out.println("Right Triangle Pattern:");
            for (int i = 1; i <= size; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

            // Pyramid Pattern
            System.out.println("\nPyramid Pattern:");
            for (int i = 1; i <= size; i++) {
                // Print spaces
                for (int j = 1; j <= size - i; j++) {
                    System.out.print("  "); // 2 spaces for alignment
                }
                // Print stars
                for (int k = 1; k <= 2 * i - 1; k++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }



package com.learningjava.Assignment1;
import java.util.Scanner;
public class LargestofThreeNumbers {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Read three integers from user
            System.out.print("Enter first number: ");
            int a = scanner.nextInt();
            System.out.print("Enter second number: ");
            int b = scanner.nextInt();
            System.out.print("Enter third number: ");
            int c = scanner.nextInt();

            // Determine the largest
            int largest;
            if (a >= b && a >= c) {
                largest = a;
            } else if (b >= a && b >= c) {
                largest = b;
            } else {
                largest = c;
            }

            // Output result
            System.out.println("Largest number is: " + largest);

            scanner.close();
        }
    }



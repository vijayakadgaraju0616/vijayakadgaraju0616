package com.learningjava.Assignment1;
import java.util.Scanner;
public class LeapYear {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Read year from user input
            System.out.print("Enter a year: ");
            int year = scanner.nextInt();

            // Check leap year using logical operators
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }

            scanner.close();
        }
    }



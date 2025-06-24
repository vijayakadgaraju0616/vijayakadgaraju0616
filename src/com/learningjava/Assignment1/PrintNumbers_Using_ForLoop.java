package com.learningjava.Assignment1;
import java.util.Scanner;
public class PrintNumbers_Using_ForLoop {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Read input from user
            System.out.print("Enter the value of N: ");
            int N = scanner.nextInt();

            // Print numbers from 1 to N
            for (int i = 1; i <= N; i++) {
                System.out.print(i + " ");
            }

            scanner.close();
        }
    }



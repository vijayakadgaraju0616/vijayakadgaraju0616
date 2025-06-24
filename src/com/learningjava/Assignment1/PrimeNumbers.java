package com.learningjava.Assignment1;

public class PrimeNumbers {
        public static void main(String[] args) {
            System.out.println("Prime numbers between 1 and 100:");

            for (int num = 2; num <= 100; num++) {
                boolean isPrime = true;

                // Only check up to √num for efficiency
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        isPrime = false; // num is divisible by i, so not prime
                        break;
                    }
                }

                if (isPrime) {
                    System.out.print(num + " ");
                }
            }
        }
    }


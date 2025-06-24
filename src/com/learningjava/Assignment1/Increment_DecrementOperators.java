package com.learningjava.Assignment1;

public class Increment_DecrementOperators {
        public static void main(String[] args) {
            int i = 5;

            System.out.println("Initial value: " + i);

            // Post-increment (i++)
            System.out.println("Post-increment (i++): " + i++); // prints 5, then i becomes 6
            System.out.println("Value after post-increment: " + i); // 6

            // Pre-increment (++i)
            System.out.println("Pre-increment (++i): " + ++i); // i becomes 7, then prints 7
            System.out.println("Value after pre-increment: " + i); // 7

            // Post-decrement (i--)
            System.out.println("Post-decrement (i--): " + i--); // prints 7, then i becomes 6
            System.out.println("Value after post-decrement: " + i); // 6

            // Pre-decrement (--i)
            System.out.println("Pre-decrement (--i): " + --i); // i becomes 5, then prints 5
            System.out.println("Value after pre-decrement: " + i); // 5
        }
    }



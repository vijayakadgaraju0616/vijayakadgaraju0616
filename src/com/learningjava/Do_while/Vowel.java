package com.learningjava.Do_while;

import java.util.Scanner;

public class Vowel {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a letter: ");
        char c = sc.next().toLowerCase().charAt(0);

        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            System.out.println(c + " is a vowel.");
        } else {
            System.out.println(c + " is not a vowel.");
                }
            }
        }



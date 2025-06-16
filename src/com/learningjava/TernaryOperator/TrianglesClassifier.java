package com.learningjava.TernaryOperator;
import java.util.Scanner;
public class TrianglesClassifier{
    //Write a program that classifies a triangle based on its side lengths.
    // Given three input values representing the lengths of the sides,
    // determine if the triangle is equilateral (all sides are equal),
    // isosceles (exactly two sides are equal), or scalene (no sides are equal).
    // Use an if-else statement to classify the triangle.

    public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);
        System.out.println("Enter length of first side: ");
        int side1 = scanner.nextInt();

        System.out.print("Enter length of second side: ");
        int side2 = scanner.nextInt();

        System.out.print("Enter length of third side: ");
        int side3 = scanner.nextInt();


        if (side1 == side2 && side2 == side3) {
            System.out.println("The triangle is Equilateral.");
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            System.out.println("The triangle is Isosceles.");
        } else {
            System.out.println("The triangle is Scalene.");
        }
    } }






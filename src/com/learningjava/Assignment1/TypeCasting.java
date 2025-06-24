package com.learningjava.Assignment1;

public class TypeCasting {
    public static void main(String[] args) {
        int x = 10;
        double y = 3.5;

        // Expression with operator precedence
        int result = x + (int)(y * 2 + 3); // y*2 = 7.0 + 3 = 10.0 → cast to 10 → 10 + 10 = 20
        result += 3; // Final result = 23

        System.out.println("Expression result: " + result);

        // Implicit casting (int + double → double)
        double implicit = x + y;
        System.out.println("Implicit casting: " + implicit);

        // Explicit casting (double → int)
        int explicit = (int)(x + y); // 10 + 3.5 = 13.5 → cast to 13
        System.out.println("Explicit casting: " + explicit);
    }
}



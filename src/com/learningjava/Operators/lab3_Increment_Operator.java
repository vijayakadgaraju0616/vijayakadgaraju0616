package com.learningjava.Operators;

public class lab3_Increment_Operator {
    public static void main(String[] args) {
        int i = 1;
        i = i++ + ++i; //  i= 1 + 3 --->now i value increments to 2 and then to 3, so final value of i is 4
        System.out.println(i);
    }
}

package com.learningjava.Operators;

public class Lab4_increment_Operator {
    public static void main(String[] args) {
        int x = 10;
        // 5+ 6 = 12 ----> because x++ increments value of x by 1 so it becomes 5 and then prefix operator again increments value by 1
        System.out.println(x++ + ++x);
    }
}

package com.learningjava.Operators;

public class Increment_operator {
    public static void main(String[] args){
       int a=5;
        int b=++a;//// prefix operator increments value of x by 1 before printing so x=11
        System.out.println(b);
        int c = 5;
        int d = a++; // value of a gets incremented after assignment to d , so final value of c is 6
        System.out.println("c:" +c + ", d : " +d );

        int i = 1;
        i = i++ + ++i; //  i= 1 + 3 --->now i value increments to 2 and then to 3, so final value of i is 4
        System.out.println(i);
        int x = 5;
       // 5+ 7 = 12 ----> because x++ increments value of x by 1 so it becomes 6 and then prefix operator again increments value by 1
        System.out.println(x++ + ++x);
        x = 5;
        System.out.println(++x); // prefix operator increments value of x by 1 before printing so x=6
        System.out.println(x++); // now the value of x is 6 and would be printed as 6 and after that it will be incremented to 7
        System.out.println(x);//now the value of x=7 so 7 would be printed
    }
}

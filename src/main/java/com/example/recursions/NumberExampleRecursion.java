package com.example.recursions;

public class NumberExampleRecursion {
    public static void main(String[] args) {
        //write a function that takes in a number and prints it
        print(1);

    }
    static void print(int n ){
        // Base condition in recursion is a condition where recursions stops
       // if you are calling a function again and again you can treat it as a seprate call
        // no base condition means , fx will keep on happeing , and hence memeory will be consumed
        // int the heap memory
        // one time comees when computer memory exceds the limit This gives STACK OVERFLOW ERROR .

        if (n == 5){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n+1);

    }
}

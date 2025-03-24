package com.example.recursions;

public class NumberExampleRecursion {
    public static void main(String[] args) {
        //write a function that takes in a number and prints it
        print(1);

    }
    static void print(int n ){
        // finction body here changes
        if (n == 5){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n+1);

    }
}

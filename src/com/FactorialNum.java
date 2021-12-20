package com;

public class FactorialNum {

    static int factorial(int n){
        if (n == 0 || n == 1) {
            return n;
        }
        else {
            return n * factorial(n-1);
        }
    }

    static int factorial_iterative(int n){
        if (n == 0 || n == 1){
            return n;
        }
        else{
            int fact = 1;
            for (int i = 1; i <= n; i++){

                fact *= i;
            }
            return fact;
        }
    }

    public static void main(String[] args) {
        System.out.println(factorial(7));
        System.out.println(factorial_iterative(7));



    }
}

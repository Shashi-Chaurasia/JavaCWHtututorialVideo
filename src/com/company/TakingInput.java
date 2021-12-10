package com.company;

import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        System.out.println("Enter first number");
        Scanner sc = new Scanner(System.in);
        /* int a = sc.nextInt();
        System.out.println("Enter Second Number");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println(sum);*/

        boolean b1 = sc.hasNextInt();
        System.out.println(b1);
    }
}




















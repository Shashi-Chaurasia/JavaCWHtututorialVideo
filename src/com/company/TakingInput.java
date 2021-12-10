package com.company;

import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        /*System.out.println("Enter first number");
        Scanner sc = new Scanner(System.in);
        /* int a = sc.nextInt();
        System.out.println("Enter Second Number");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println(sum);

        boolean b1 = sc.hasNextInt();
        System.out.println(b1);*/


        System.out.println("Enter your Subject Number : ");
        System.out.print("Maths:");
        Scanner sc = new Scanner(System.in);
        int math = sc.nextInt();
        System.out.print("English:");
        int eng = sc.nextInt();
        System.out.print("Hindi:");
        int hindi = sc.nextInt();
        System.out.print("Science:");
        int science = sc.nextInt();
        System.out.print("Social Science:");
        int ss = sc.nextInt();

        int sum = math + eng + hindi + ss + science;

        float stuPercent = sum/5;
        System.out.println("Percentage of student is : " + stuPercent);
    }
}






















package com.company;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class switchstat {
    public static void main(String[] args) {
        System.out.println("Please fill your age : ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        /*System.out.println("Your Filled age is :" + age);
        if (age >= 18 && age <= 45){
            System.out.println("You are eligible for application");
        }
        else if (age <= 18){
            System.out.println("You are not eligible ");
        }
        else if(age >= 45){
            System.out.println("plz fill senior citigions apllications");
        }*/

        switch (age){
            case 18:
                System.out.println("You are adult ! eligible");

        }


    }

}

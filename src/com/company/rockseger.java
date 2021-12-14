package com.company;

import java.util.Random;
import java.util.Scanner;

public class rockseger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        System.out.print("1 : Rock \n");
        System.out.print("2 : Seeger \n");
        System.out.print("3 : Paper \n");
        System.out.print("Plz enter your input : ");


        int computer = rnd.nextInt(1 , 4);
        int action = sc.nextInt();
        System.out.println("Computer Input : " + computer);

        if (action > 0 && action <4 ){

            if (action == computer){
                if (action == 1 && computer == 3){
                    if (action == 3 && computer ==1){
                        System.out.println("Match Tie ! ");
                    }
                }


            }
            else if (action == 1 && computer == 2 ){
                System.out.println("You win1");
            }
            else if (action == 2 && computer == 3){
                System.out.println("You Win !");
            }
            else{
                System.out.println("You Lose !");
            }

        }
        else {
            System.out.println("Input exceed requirement criteria");
        }



    }
}

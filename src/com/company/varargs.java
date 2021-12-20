package com.company;

public class varargs {
   // static int sum(int a, int b){
       // return a+b  ;
   // }

    static int sum(int ...arr){

        int result = 0;
        for (int a: arr
             ) {
            result += a;
        }
        return result;

    }


    public static void main(String[] args) {

        System.out.println(sum(2,3,4,5,8,6,9,87,89,54));
    }
}




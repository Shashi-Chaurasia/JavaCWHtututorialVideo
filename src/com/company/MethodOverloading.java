package com.company;

public class MethodOverloading {
    static void foo(){
        System.out.println("Good Morning Bro");
    }

    static void foo(String str, String str2){
        System.out.println("Good Morning " + str + " How are you " + str2);
    }
    static void foo(String str , String str2, String str3){
        System.out.println("Yoh, Hii " + str + "how are you " + str2 + "hii " + str3);
    }
    /*static void tellJokes(){
        System.out.println("Oru hotelil fud kaych kaynj avduthe wash basin" +
                " kazhukunnath kanda oraal:thaanenthinado wash basin kazhukunnath?Tin2:ntho " +
                " avde ezhuthi vechirikunnath kandile");
    }*/
    static void change1(int a){
        a = 98;
    }
    static void change2(int [] arr){
        arr[0] = 98;
    }

    static int sum(int ...arr){
        int result = 0;
        for (int a: arr){
            result += a;
        }
        return result;
    }

    public static void main(String[] args) {

        //tellJokes();

        //int [] marks = {35,33,23,54,65,63,67,39};
        //change2(marks);
        //System.out.println(marks[4]);

        // Methods Overloading

        foo();
        foo("Shashi" , "Vinita");
        foo("Shashi" , "Rahul" , "student");







    }
}



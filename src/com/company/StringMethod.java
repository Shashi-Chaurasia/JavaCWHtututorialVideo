package com.company;

import java.util.Locale;

public class StringMethod {
    public static void main(String[] args) {
       /* String str = "Hi I am Shashi";
        System.out.println(str);
        int value = str.length();
        String nesStr = str.toLowerCase();
        System.out.println(value);
        System.out.println(nesStr);

        String nonTrimString = "    Hello     ";
        System.out.println(nonTrimString.trim());*/

        String name = "Shashi";
        System.out.println(name.substring(1,3));
        System.out.println(name.replace("h" , "r"));
        System.out.println(name.indexOf("sh" ,2 ));

    }
}

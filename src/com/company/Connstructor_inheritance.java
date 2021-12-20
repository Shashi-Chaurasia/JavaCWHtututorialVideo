package com.company;

class Base{
    Base(){
        System.out.println("I am a constructors");
    }

    Base(int x){
        System.out.println("I am a base para constructors of value : " + x);

    }

}
class Base2 extends Base{
    Base2(){

        System.out.println("I am derived class constructors");
    }

    Base2(int x , int y){
        super(x);
        System.out.println("I am derived class constructor with parameter of value : " + x +" " + y);
    }
}

public class Connstructor_inheritance {
    public static void main(String[] args) {
        //Base parent = new Base(10);
        Base2 child = new Base2(20 , 30);




    }
}

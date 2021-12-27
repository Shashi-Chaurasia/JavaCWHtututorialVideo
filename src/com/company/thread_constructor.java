package com.company;

class MyThrer extends Thread{
    public MyThrer(String name) {
        super(name);
    }

    @Override
    public void run() {
        int i = 0;
        System.out.println("Taking thread  ");

    }
}

public class thread_constructor {
    public static void main(String[] args) {

        MyThrer obj1 = new MyThrer("Shashi");
        MyThrer obj2 = new MyThrer("Varun");
        obj1.start();
        obj2.start();

        System.out.println(obj1.getId());
        System.out.println(obj1.getName());
        System.out.println(obj2.getId());
        System.out.println(obj2.getName());



    }
}

package com.company;

class Mythread1 extends Thread{
    @Override
    public void run() {
        int i = 0;
        while (i < 5){
            System.out.println("My thread1 is running");
            System.out.println("I am Happy!");
            i++;

        }

    }
}


class Mythread2 extends Thread{
    @Override
    public void run() {
        int i = 0;
        while (i < 5){
            System.out.println("My thread2 is cooking");
            System.out.println("I am Sad!");
            i++;

        }

    }
}

public class threading {
    public static void main(String[] args) {
        Mythread1 obj = new Mythread1();
        Mythread2 obj2 = new Mythread2();
        obj.start();
        obj2.start();

    }
}

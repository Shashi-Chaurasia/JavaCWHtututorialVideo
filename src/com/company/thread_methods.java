package com.company;

class MyNewThrer1 extends Thread{
    public MyNewThrer1(String name) {
        super(name);
    }

    @Override
    public void run() {
        int i = 0;
        while (i < 34){
            System.out.println("Thank you ! " + getName());
            i++;

        }

    }
}
class MyNewThrer2 extends Thread{
    @Override
    public void run() {
        int j = 0;
        while (j< 87){
            System.out.println("Thank you !  Class 2");
            j++;
            try {
                Thread.sleep(4555);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

public class thread_methods {
    public static void main(String[] args) {
        MyNewThrer1 t1 = new MyNewThrer1("'Shashi1");
        MyNewThrer2 t2 = new MyNewThrer2();
        t1.start();

        try {
            t1.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        t2.start();
    }
}

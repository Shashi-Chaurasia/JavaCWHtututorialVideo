package com.company;
class MyThrer1 extends Thread{
    public MyThrer1(String name) {
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


public class thread_priorities {
    public static void main(String[] args) {
        MyThrer1 t1 = new MyThrer1("Shashi1");
        MyThrer1 t2 = new MyThrer1("Shashi2");
        MyThrer1 t3 = new MyThrer1("Shashi3");
        MyThrer1 t4 = new MyThrer1("Shashi4");
        MyThrer1 t5 = new MyThrer1("Shashi5 (most Important Thread");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);



    }
}

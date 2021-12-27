package com.company;


class MyRunnablethread1 implements Runnable{
    @Override
    public void run() {
        int i = 0;
        while (i < 200){
            System.out.println("This is thread one start thread1 ........");
            i++;
        }
    }
}

class MyRunnablethread2 implements Runnable{
    @Override
    public void run() {
        int i = 0;
        while (i < 200){
            System.out.println("This is thread2 start thread2 ........");
            i++;
        }
    }
}


public class runnable_thread {
    public static void main(String[] args) {
        MyRunnablethread1 bullet1 = new MyRunnablethread1();
        Thread gun1 = new Thread(bullet1);
        MyRunnablethread2 bullet2 = new MyRunnablethread2();
        Thread gun2 = new Thread(bullet2);
        gun1.start();
        gun2.start();

    }
}

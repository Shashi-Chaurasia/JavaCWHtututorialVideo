package com.company;

interface SampleInterface{
    void meth1();
    void meth2();
}

interface ChildInterface extends SampleInterface{
    void methd3();
    void methd4();

}

class MainInterface implements ChildInterface{
    @Override
    public void meth1() {
        System.out.println("Method 1 >>>>>>>>>>>>>>>.");
    }

    @Override
    public void meth2() {
        System.out.println("Method 2 >>>>>>>>>>>>>>>.");
    }

    @Override
    public void methd3() {
        System.out.println("Method 3 >>>>>>>>>>>>>>>.");
    }

    @Override
    public void methd4() {
        System.out.println("Method 4 >>>>>>>>>>>>>>>.");
    }
}

public class Inheritance_interface {
    public static void main(String[] args) {

        MainInterface obj = new MainInterface();
        obj.meth1();
        obj.meth2();
        obj.methd3();
        obj.methd4();

    }
}

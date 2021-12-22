package com.company;

abstract class ParentClass{
    public ParentClass(){
        System.out.println("Hii , I am Constructor");
    }

    public void sayHello(){
        System.out.println("Hello !");
    }
    abstract public void greet();

}

class ChildClass extends ParentClass{
    @Override
    public void greet() {
        System.out.println("Good morning!");
    }

    @Override
    public void sayHello() {
        super.sayHello();
    }
}

class ChildClass2 extends ChildClass{
    public void setPara(){
        System.out.println("Say!  Hello  ,   I am    ,");
    }


}

public class AbstractClass {

    public static void main(String[] args) {

        ChildClass2 cw = new ChildClass2();
        ChildClass sw = new ChildClass();



    }
}

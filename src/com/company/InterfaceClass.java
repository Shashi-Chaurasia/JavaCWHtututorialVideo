package com.company;

interface Bicycle{
    int a = 45;
    void applyBreak(int decrement);
    void speedUp(int increment);
}

interface HornBicycle{
    void hornPipo();
    void hornPoo();

}

class AvonCycle implements Bicycle , HornBicycle{
    void blowHorn(){
        System.out.println("Pee Poo Pee Poo");
    }
    @Override
    public void applyBreak(int decrement) {
        System.out.println("Speed Decrements .......");
    }

    @Override
    public void speedUp(int increment) {
        System.out.println("speed increments ........ ");
    }

    @Override
    public void hornPipo() {
        System.out.println("Horn ... pipo......");
    }

    @Override
    public void hornPoo() {
        System.out.println("Horn pooo...... ");
    }
}

public class InterfaceClass {
    public static void main(String[] args) {
        AvonCycle avn = new AvonCycle();
        avn.applyBreak(1);
        avn.speedUp(5);
        System.out.println(avn.a);
        avn.hornPipo();
        avn.hornPoo();

    }
}

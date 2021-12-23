package com.company;


interface MyCamera1{
    void snapShort();
    void recordVideo();
    default public void record4kVideo(){
        System.out.println("record video in 4k ......");
    }
}

interface MyWifi1{
    String[] getNetwork();

    default void connectToNetwork(String network) {

    }
}

class MyCellPhone1{

    void callNumber(int phoneNumber){
        System.out.println("Calling " + phoneNumber);

    }



}

class MySmartphone1 extends MyCellPhone1 implements MyCamera1 , MyWifi1{
    @Override
    public void snapShort() {
        System.out.println("Taking  snap ................");
    }

    @Override
    public void recordVideo() {
        System.out.println("Record video ...................");
    }

    @Override
    public String[] getNetwork() {
        System.out.println("Getting List Of Network ...");
        String[] networkList = {"Harry" , "Satish" , "Anjali"};
        return networkList;
    }

    @Override
    public void connectToNetwork(String network) {
        System.out.println("Connect to Network.." + network);
    }
}


public class polymorphism {
    public static void main(String[] args) {

        MyCamera1 obj = new MySmartphone1();
        obj.record4kVideo();

    }
}

package com.company;

interface MyCamera{
    void snapShort();
    void recordVideo();
    default public void record4kVideo(){
        System.out.println("record video in 4k ......");
    }
}

interface MyWifi{
    String[] getNetwork();
    void connectToNetwork(String network);
}

class MyCellPhone{

    void callNumber(int phoneNumber){
        System.out.println("Calling " + phoneNumber);

    }



}

class MySmartphone extends MyCellPhone implements MyCamera , MyWifi{
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

public class DefaultMulInher {
    public static void main(String[] args) {
        MySmartphone cell = new MySmartphone();
        cell.connectToNetwork("Jio");

    }
}

package com.company;


class CircleDimenstion{
    private float pie = 3.14f;
    private float rad;


    public void setRad(float rad){
        this.rad = rad;
    }

    public float getRad(){
        return pie*(rad*rad);
    }
    public float getPerimeter(){
        return 2*pie*rad;
    }

}

public class Circle {
    public static void main(String[] args) {

        CircleDimenstion area = new CircleDimenstion();
        area.setRad(2.5f);
        System.out.println(area.getRad());
        System.out.println(area.getPerimeter());

    }
}

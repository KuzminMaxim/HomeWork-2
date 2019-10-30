package com.netcracker.homework2;

public class Main {

    public static void main(String[] args) {
        MyPoint myPoint1 = new MyPoint(0,0);
        MyPoint myPoint2 = new MyPoint(0,3);
        MyPoint myPoint3 = new MyPoint(3,0);
        MyTriangle myTriangle = new MyTriangle(myPoint1, myPoint2, myPoint3);
        System.out.println(myTriangle.getPerimeter());
        System.out.println(myTriangle.getType());
        System.out.println(myTriangle.toString());
    }
}

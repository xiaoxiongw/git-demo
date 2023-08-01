package com.wss.pojo;

public class testMyrectangle {
    public static void main(String[] args) {
        MyRectangle myRectangle = new MyRectangle(1,2,5,6);
        myRectangle.gerW();
        myRectangle.getH();
        myRectangle.area();
        System.out.println(myRectangle.toString());
    }
}

package com.bek_qa.java_barancev;

/**
 * Created by Bek on 4/9/2017.
 */
public class Square {
    public double lengthFromSqureClass;

    public Square(double lengthParameter){
        this.lengthFromSqureClass = lengthParameter;
    }

    public double area() {
        return this.lengthFromSqureClass * this.lengthFromSqureClass;
    }
}

package com.bek_qa.java_barancev;

/**
 * Created by Bek on 4/9/2017.
 */
public class Rectangle {
    public double aFromRectClass;
    public double bFromRectClass;

    public Rectangle(double aParameter, double bParameter){
        aFromRectClass = aParameter;
        bFromRectClass = bParameter;
    }
    public double areaRectan(){
        return this.bFromRectClass * this.bFromRectClass;
    }
}

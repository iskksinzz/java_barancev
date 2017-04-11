package com.bek_qa.java_barancev;

/**
 * Created by Bek on 4/9/2017.
 */
public class Point {
    public double p1;
    public double p2;

    public Point(double p1, double p2){
        this.p1 = p1;
        this.p2 = p2;
    }
    public double distance(){
        return this.p2 - this.p1;
    }
}

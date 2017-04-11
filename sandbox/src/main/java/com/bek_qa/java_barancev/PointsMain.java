package com.bek_qa.java_barancev;

/**
 * Created by Bek on 4/9/2017.
 */
public class PointsMain {
    public static void main(String[] args) {

        Point p1 = new Point(3.5,12.5);
        Point p2 = new Point(5.6,18.4);
        System.out.println("The distance between two points: " + p1.distance(p2));
    }

}

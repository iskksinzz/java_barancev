package com.bek_qa.java_barancev;

/**
 * Created by Bek on 4/9/2017.
 */
public class PointsMain {
    public static void main(String[] args) {
        Point p1 = new Point(5, 6);
        Point p2 = new Point(7, 8.1);
        System.out.println("The distance between two points: " + p1.distance(p2));
    }

}

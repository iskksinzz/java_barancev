package com.bek_qa.java_barancev;

/**
 * Created by Bek on 4/9/2017.
 */
public class Point {
    public double x;
    public double y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    //Перегружаем метод. Он имеет 1 аргумент и его значение передаётся обеим точкам
//    public Point(double x) {
//        this.x = x;
//        this.y = y;
//    }
    public double distance(Point secondObject) {
        return Math.sqrt(Math.pow(x - secondObject.x, 2) + Math.pow(y - secondObject.y, 2) );
    }
}

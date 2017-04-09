package com.bek_qa.java_barancev;

public class MyFirstProgram {
  public static void main(String[] args) {
    hello();
    double len = 5;
    System.out.println("Area of a cube with a length of " + len + " is equal to " + area(len));
    double a = 3.2;
    double b = 7.4;
    System.out.println("The area of a rectangular is " + areaRectan(a, b));
  }

  public static void hello() {
    System.out.println("Hello, world!");
  }
  public static double area(double length){
    return length * length;
  }
  public static double areaRectan(double a, double b){
    return a * b;
  }
}

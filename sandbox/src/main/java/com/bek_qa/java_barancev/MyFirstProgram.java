package com.bek_qa.java_barancev;

public class MyFirstProgram {
  public static void main(String[] args) {
    Square squareVarInMain = new Square(5);
    //squareVarInMain.lengthFromSqureClass = 5; //We set length from Square class here
    System.out.println("Area of a cube with a length of " + squareVarInMain.lengthFromSqureClass +
                       " is equal to " + squareVarInMain.area());
    //Now we call this method through className.classMethod() principle

    Rectangle rectVarInMain = new Rectangle(3.2, 7.4);
    //rectVarInMain.aFromRectClass = 3.2; //We set a length from Rectangle class here
    //rectVarInMain.bFromRectClass = 7.4; //We set b length from Rectangle class here
    System.out.println("The area of a rectangular is " + rectVarInMain.areaRectan());
    //Now we change from areaRectan(rectVarMain) because we converted areaRectan() to method by moving it
    //to Rectangle class, removing static, removing parameters in function
    //Now we call this method through className.classMethod() principle
  }
}

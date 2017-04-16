package com.bek_qa.java_barancev;

import org.testng.Assert;
import org.testng.annotations.Test;


/**
 * Created by Bek on 4/16/2017.
 */
public class PointTest {

    @Test
    public void testDistance(){
        Point p1 = new Point(5, 6);
        Point p2 = new Point(7, 8.1);
        assert p1.distance(p2) == 2.9;
    }
    @Test
    public void testDistance2(){
        Point p3 = new Point(1.1, 2.1);
        Point p4 = new Point(3.2, 4.2);
        Assert.assertEquals(p3.distance(p4), 2.9698484809834995);
    }

    @Test
    public void testDistance3(){
        Point p5 = new Point(1, 2);
        Point p6 = new Point(3, 4);
        Assert.assertEquals(p5.distance(p6), 2.8284271247461903);
    }
}

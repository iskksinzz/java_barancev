package com.bek_qa.java_barancev;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Bek on 4/15/2017.
 */
public class SquareTest {
    @Test
    public void testArea(){
        Square s = new Square(5);
        Assert.assertEquals(s.area(), 25.0);
    }
}

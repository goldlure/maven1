package com.goldlure.maven1;

import org.junit.Assert;
import org.junit.Test;

public class CalcTest {
    @Test
    public void testAdd() throws Exception{
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 5);
        Assert.assertEquals(7, result);
    }
}
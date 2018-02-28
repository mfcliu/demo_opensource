package org.leo.demo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCompute {
    @Test
    public void testGetUser(){
        assertEquals("leo",(new Compute()).getUser());
    }
}

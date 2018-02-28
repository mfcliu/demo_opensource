package org.leo.demo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TestCompute {
    @Test
    public void testGetUser(){
        assertEquals("leo",(new Compute()).getUser());
    }

    @Test
    public void testMain(){
        App app = new App();
        assertNotNull(app);
        App.main(null);
    }
}

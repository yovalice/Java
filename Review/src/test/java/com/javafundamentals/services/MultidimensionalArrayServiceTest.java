package com.javafundamentals.services;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by yovaliceroman on 4/24/17.
 */
public class MultidimensionalArrayServiceTest {

    MultidimensionalArrayService multiArrayS = new MultidimensionalArrayService();

    @Test
    public void multiArray() throws Exception {
        assertEquals("Success", multiArrayS.multiArray());

    }

}
package com.javafundamentals.services;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by yovaliceroman on 4/20/17.
 */
public class ArrayReviewServiceTest {

    ArrayReviewService arrayRev = new ArrayReviewService();

    @Test
    public void array() throws Exception {

        assertEquals("Success: example array", arrayRev.array());

    }

}
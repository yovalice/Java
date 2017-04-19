package com.javafundamentals.services;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by yovaliceroman on 4/19/17.
 */
public class LoopsReviewServiceTest {

    LoopsReviewService loopsReviewService = new LoopsReviewService();

    @Test
    public void forLoop() throws Exception {
        assertEquals("For loop", loopsReviewService.forLoop());

    }

    @Test
    public void enhancedForLoop() throws Exception {
        assertEquals("Enhanced for loop", loopsReviewService.enhancedForLoop());

    }

    @Test
    public void whileLoop() throws Exception {
        assertEquals("While loop", loopsReviewService.whileLoop());

    }

    @Test
    public void doWhileLoop() throws Exception {
        assertEquals("Do-while loop", loopsReviewService.doWhileLoop());

    }

}
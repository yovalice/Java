package com.javafundamentals.services;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by yovaliceroman on 4/19/17.
 */

public class SwitchReviewServiceTest {

    SwitchReviewService switchReviewService = new SwitchReviewService();

    @Test
    public void switchStatement() throws Exception {

        assertEquals("Switch", switchReviewService.switchStatement());

    }

}
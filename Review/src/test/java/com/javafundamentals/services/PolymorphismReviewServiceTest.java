package com.javafundamentals.services;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by yovaliceroman on 4/19/17.
 */
public class PolymorphismReviewServiceTest {

    PolymorphismReviewService polymorphism = new PolymorphismReviewService();

    @Test
    public void polymorphismexample() throws Exception {
        assertEquals(polymorphism.car.costPerMile(), polymorphism.polymorphismexample(), polymorphism.car.costPerMile());

    }

}
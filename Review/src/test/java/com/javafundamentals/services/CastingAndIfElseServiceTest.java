package com.javafundamentals.services;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by yovaliceroman on 4/19/17.
 */
public class CastingAndIfElseServiceTest {

    CastingAndIfElseService castingAndIfElse = new CastingAndIfElseService(85, 85.0, 'B');

    @Test
    public void castingAndIfElse() throws Exception {

        assertEquals("The class grade is " + castingAndIfElse.classGrade + " with a score of " +
                castingAndIfElse.dClassScore, castingAndIfElse.castingAndIfElse());

    }

}
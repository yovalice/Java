package com.javafundamentals.services;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by yovaliceroman on 4/20/17.
 */
public class StaticVarMethod1ServiceTest {

    StaticVarMethod1Service statVarMeth = new StaticVarMethod1Service();

    @Test
    public void fMethod() throws Exception {

        assertEquals("Success", statVarMeth.fMethod());

    }
}
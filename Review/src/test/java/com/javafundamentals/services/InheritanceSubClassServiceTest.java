package com.javafundamentals.services;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by yovaliceroman on 4/19/17.
 */
public class InheritanceSubClassServiceTest {

    InheritanceSubClassService subClass = new InheritanceSubClassService();

    @Test
    public void subClassMessage() throws Exception {
        assertEquals("This is a method of the subclass", subClass.subClassMessage());

    }

    @Test
    public void superClassMessage() throws Exception {
        assertEquals(subClass.superClass(), subClass.superClassMessage());

    }

}
package com.javafundamentals.services;

import com.javafundamentals.services.InheritanceSubClassService;
import com.javafundamentals.services.InheritanceSuperClassService;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by yovaliceroman on 4/19/17.
 */
public class InheritanceSuperClassServiceTest {

    InheritanceSuperClassService superClass = new InheritanceSubClassService();

    @Test
    public void superClass() throws Exception {

        assertEquals("This is an example of the Super class", superClass.superClass());

    }

}
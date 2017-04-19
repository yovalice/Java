package com.javafundamentals.services;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by yovaliceroman on 4/19/17.
 */

public class FlowControlServiceTest {

    FlowControlService flowControlS = new FlowControlService();

    @Test
    public void flowControl() throws Exception {

        assertEquals("Flow control example", flowControlS.flowControl());
    }

}
package com.javafundamentals.resources;

import com.javafundamentals.services.ArrayReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yovaliceroman on 4/20/17.
 */

@RestController
public class ArrayReviewResource {

    @Autowired
    ArrayReviewService arrayR;

    @RequestMapping("/array")
    public String arrayEx(){
       return arrayR.array();
    }
}

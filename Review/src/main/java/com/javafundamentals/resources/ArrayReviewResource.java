package com.javafundamentals.resources;

import com.javafundamentals.services.ArrayReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yovaliceroman on 4/20/17.
 */

//resource class for the array example
@RestController
public class ArrayReviewResource {

    //Autowired to be able to use the class ArrayReviewService
    @Autowired
    ArrayReviewService arrayR;

    //method mapping and calling the array method
    //in the class ArrayReviewService
    @RequestMapping("/array")
    public String arrayEx(){
       return arrayR.array();
    }
}

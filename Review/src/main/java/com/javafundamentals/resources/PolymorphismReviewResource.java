package com.javafundamentals.resources;

import com.javafundamentals.services.PolymorphismReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yovaliceroman on 4/19/17.
 */

//resource class for the polymorphism example
@RestController
public class PolymorphismReviewResource {

    //Autowired to be able to use the class PolymorphismReviewService
    @Autowired
    PolymorphismReviewService polymorphismReviewService;

    //method mapping and calling the polymorphismexample method
    //in the class PolymorphismReviewService
    @RequestMapping("/polymorphism")
    public double polymorphism(){
        return polymorphismReviewService.polymorphismexample();
    }


}

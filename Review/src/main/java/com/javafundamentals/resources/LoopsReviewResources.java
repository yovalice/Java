package com.javafundamentals.resources;

import com.javafundamentals.services.LoopsReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yovaliceroman on 4/18/17.
 */

//resource class for the switch statement
@RestController
public class LoopsReviewResources {

    //Autowired to be able to use the class LoopsReviewService
    @Autowired
    LoopsReviewService loopsReviewService;

    //method mapping and calling the for loop method
    //in the class LoopsReviewService
    @RequestMapping("/forloop")
    public String forLoop(){

        return loopsReviewService.forLoop();
    }

    //method mapping and calling the enhanced for loop method
    //in the class LoopsReviewService
    @RequestMapping("/enhancedloop")
    public String enhancedLoop(){

        return loopsReviewService.enhancedForLoop();
    }

    //method mapping and calling the while loop method
    //in the class LoopsReviewService
    @RequestMapping("/whileloop")
    public String whileLoop(){

        return loopsReviewService.whileLoop();
    }

    //method mapping and calling the do-while loop method
    //in the class LoopsReviewService
    @RequestMapping("/dowhile")
    public String doWhileLoop(){

        return loopsReviewService.doWhileLoop();
    }
}

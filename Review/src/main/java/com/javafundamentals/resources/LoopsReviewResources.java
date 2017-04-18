package com.javafundamentals.resources;

import com.javafundamentals.services.LoopsReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yovaliceroman on 4/18/17.
 */

@RestController
public class LoopsReviewResources {

    @Autowired
    LoopsReviewService loopsReviewService;

    @RequestMapping("/forloop")
    public String forLoop(){
        return loopsReviewService.forLoop();
    }

    @RequestMapping("/enhancedloop")
    public String enhancedLoop(){
        return loopsReviewService.enhancedForLoop();
    }

    @RequestMapping("/whileloop")
    public String whileLoop(){
        return loopsReviewService.whileLoop();
    }

    @RequestMapping("/dowhile")
    public String doWhileLoop(){
        return loopsReviewService.doWhileLoop();
    }
}

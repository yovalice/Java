package com.javafundamentals.resources;

import com.javafundamentals.services.SwitchReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yovaliceroman on 4/18/17.
 */

//resource class for the switch statement
@RestController
public class SwitchReviewResource {

    //Autowired for the used of the class SwitchReviewService
    @Autowired
    SwitchReviewService switchReviewService;

    //method mapping and calling the switch statement
    //method in the class SwitchReviewService
    @RequestMapping("/switch")
    public String switchStatement(){

        return switchReviewService.switchStatement();
    }
}

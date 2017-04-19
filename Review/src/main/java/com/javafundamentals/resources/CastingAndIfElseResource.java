package com.javafundamentals.resources;

import com.javafundamentals.services.CastingAndIfElseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yovaliceroman on 4/19/17.
 */

//resource class for the casting and if else example
@RestController
public class CastingAndIfElseResource {

    //Autowired to be able to use the class CastingAndIfElseService
    @Autowired
    CastingAndIfElseService castingAndIfElse;

    //method mapping and calling the castingAndIfElse method
    //in the class CastingAndIfElseService
    @RequestMapping("/castIfElse")
    public String castIfElse(){
        return castingAndIfElse.castingAndIfElse();
    }
}

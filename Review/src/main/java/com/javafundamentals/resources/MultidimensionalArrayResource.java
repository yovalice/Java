package com.javafundamentals.resources;

import com.javafundamentals.services.MultidimensionalArrayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yovaliceroman on 4/24/17.
 */


//resource class for the multidimensional array example
@RestController
public class MultidimensionalArrayResource {

    //Autowired to be able to use the class MultidimensionalArrayService
    @Autowired
    MultidimensionalArrayService multiArrayR;

    //method mapping and calling the multiArray method
    //in the class MultidimensionalArrayService
    @RequestMapping("/multiarray")
    public String multiArrayEx(){
        return multiArrayR.multiArray();
    }
}

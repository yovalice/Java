package com.javafundamentals.resources;

import com.javafundamentals.services.StaticVarMethod1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yovaliceroman on 4/20/17.
 */

//resource class for the static example
@RestController
public class StaticVarMethod1Resource {

    //Autowired to be able to use the class StaticVarMethod1Service
    @Autowired
    StaticVarMethod1Service staticVarMeth;

    //method mapping and calling the fMethod method
    //in the class StaticVarMethod1Service
    @RequestMapping("/static")
    public String staticVarMeth(){
        return staticVarMeth.fMethod();
    }

}

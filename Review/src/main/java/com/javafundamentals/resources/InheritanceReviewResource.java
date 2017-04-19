package com.javafundamentals.resources;

import com.javafundamentals.services.InheritanceSubClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yovaliceroman on 4/19/17.
 */

//resource class for the inheritance example
@RestController
public class InheritanceReviewResource {

    //Autowired to be able to use the class InheritanceSubClassService
    @Autowired
    InheritanceSubClassService subClassService;

    //method mapping and calling the sub class method
    //in the class InheritanceSubClassService
    @RequestMapping("/sub")
    public String subClass(){
        return subClassService.subClassMessage() + "\n" + subClassService.superClassMessage();
    }

}

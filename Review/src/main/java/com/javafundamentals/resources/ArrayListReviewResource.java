package com.javafundamentals.resources;

import com.javafundamentals.services.ArrayListReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * Created by yovaliceroman on 4/20/17.
 */

//resource class for the array list example
@RestController
public class ArrayListReviewResource {

    //Autowired to be able to use the class ArrayListReviewService
    @Autowired
    ArrayListReviewService arrayL;

    //method mapping and calling the arrayList method
    //in the class ArrayListReviewService
    @RequestMapping("/arraylist")
    public ArrayList<String> arrayListR(){

        return arrayL.arrayList();
    }
}

package com.javafundamentals.services;

import org.springframework.stereotype.Service;

/**
 * Created by yovaliceroman on 4/18/17.
 */


//Class that demonstrate a Switch Statement
@Service
public class SwitchReviewService {

    //method that demonstrate the switch and returns a String
    public String switchStatement(){

        String knowledge = "High";

        switch(knowledge){

            case "High" :
                System.out.println("High knowledge");
                break;
            case "Regular" :
                System.out.println("Medium knowledge");
                break;
            case "Low" :
                System.out.println("Low knowledge");
                break;
            default :
                System.out.println("Not a valid answer");
        }
        return "Switch";
    }
}

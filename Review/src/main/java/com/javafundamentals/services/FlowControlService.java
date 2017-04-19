package com.javafundamentals.services;

import org.springframework.stereotype.Service;

/**
 * Created by yovaliceroman on 4/19/17.
 */

//class to demonstrate flow control with continue,
// break and returning a String
@Service
public class FlowControlService {
    public String flowControl(){

        for(int i = 2; i < 15; i++){
            if(i % 2 == 0){
                System.out.println(i + " is a even number");
                continue;
            }
            if(i % 2 != 0){
                System.out.println(i + " is a odd number");
                break;
            }
        }
        return "Flow control example";
    }
}

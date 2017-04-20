package com.javafundamentals.services;

import org.springframework.stereotype.Service;

/**
 * Created by yovaliceroman on 4/20/17.
 */

//class that demonstrate a array example
@Service
public class ArrayReviewService {

    public String array(){

        int arrayV[] = new int[15];
        int i;

        for (i = 5; i <= arrayV.length - 1; i++){
            if (i % 2 != 0)
                System.out.println(i);
        }

        return "Success: example array";
    }
}

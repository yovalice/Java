package com.javafundamentals.services;

import org.springframework.stereotype.Service;

/**
 * Created by yovaliceroman on 4/18/17.
 */

//class that demonstrate the different loops
@Service
public class LoopsReviewService {

    //method demonstrating the for loop
    public String forLoop() {

        int[] num = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        for (int i = 0; i < num.length; i++) {
            System.out.println("For loop: " + i);
        }
        return "For loop";
    }

    //method demonstrating the enhanced for loop
    public String enhancedForLoop() {

        int[] num = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        for (int i : num) {
            System.out.println("Enhanced for loop" + i);
        }
        return "Enhanced for loop";
    }

    //method demonstrating the while loop
    public String whileLoop() {

        int i = 8;

        while (i < 8) ;
        System.out.println(" i is = " + i);

        return "While loop";
    }


    //method demonstrating the do-while loop
    public String doWhileLoop(){

        int i = 8;

        do {
            System.out.println(i);
        }while (i < 8);

        return "Do-while loop";
    }
}

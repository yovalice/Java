package com.javafundamentals.services;

import org.springframework.stereotype.Service;

/**
 * Created by yovaliceroman on 4/19/17.
 */

//class to demonstrate casting and if else statement
@Service
public class CastingAndIfElseService {

    //demonstration of Implicit casting from int to double
    int classScore = 85;
    double dClassScore = classScore;
    char classGrade;
    
    // RYAN: i see implicit casting above, but I do not see any other casting in this file
    // so I added the constructor below just to demonstrate it:
    public CastingAndIfElseService(int classScore, int dClassScore, int classGrade){
        this.classScore = classScore;
        this.dClassScore = (int) dClassScore;
        this.classGrade = (int) classGrade;
        short test1 = (short) classScore;
        byte test2 = (byte) dClassScore;
    }

   //public constructor with parameters
    public CastingAndIfElseService(int classScore, double dClassScore, char classGrade){
        this.classScore = classScore;
        this.dClassScore = dClassScore;
        this.classGrade = classGrade;
    }

    public CastingAndIfElseService(){}

    //method with the example of nested if, if else
    public String castingAndIfElse(){

        if(dClassScore >= 90){
            classGrade = 'A';
        }else if (dClassScore >= 80){
            classGrade = 'B';
        }else if (dClassScore >= 70){
            classGrade = 'C';
        }else if (dClassScore >= 60){
            classGrade = 'D';
        }else {
            classGrade = 'F';
        }
        return "The class grade is " + classGrade + " with a score of " + dClassScore;
    }
}

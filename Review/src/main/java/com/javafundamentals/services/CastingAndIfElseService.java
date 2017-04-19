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

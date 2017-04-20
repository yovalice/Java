package com.javafundamentals.services;


import org.springframework.stereotype.Service;

/**
 * Created by yovaliceroman on 4/19/17.
 */

//class that create 3 instance of another class and has a static method
@Service
public class StaticVarMethod1Service {

    //method a returning a String
    public String fMethod(){

        //setting 3 instances of StaticVarMethod2
        StaticVarMethod2 fObj = new StaticVarMethod2(11, "Emma", 'F');
        StaticVarMethod2 sObj = new StaticVarMethod2(10, "Isabella", 'M');
        StaticVarMethod2 tObj = new StaticVarMethod2(12, "Alexandra", 'F');



        System.out.println("The age, name and gender of the first person is : " + fObj.age + ", " +
                fObj.name + ", " + fObj.getGender() + " and the second is: " + sObj.age + ", " +
                sObj.name + ", " + sObj.getGender() + " and the last one is " + tObj.age +
                ", " + tObj.name + ", " + tObj.getGender());


        //calling the static method stateMethod
        StaticVarMethod1Service.statMehtod();

        return "Success";
    }

    //static method
    public static void statMehtod(){

    }
}

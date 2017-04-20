package com.javafundamentals.services;

import org.springframework.stereotype.Service;

/**
 * Created by yovaliceroman on 4/20/17.
 */

//Class with a static instance variable
@Service
public class StaticVarMethod2 {
    //Instance variables
    int age;
    String name;
    static char gender;

    public StaticVarMethod2(){

    }

    //Constructor with parameters
    public StaticVarMethod2(int age, String name, char gender){
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    //Getter fot the static variable to get it from other class
    public static char getGender() {
        return gender;
    }
}

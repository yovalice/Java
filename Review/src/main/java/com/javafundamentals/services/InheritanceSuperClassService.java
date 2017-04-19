package com.javafundamentals.services;

import org.springframework.stereotype.Service;

/**
 * Created by yovaliceroman on 4/19/17.
 */

//super class demonstrating the inheritance
@Service
public class InheritanceSuperClassService {

    //super class method returning a String
    public String superClass(){

        return "This is an example of the Super class";
    }
}

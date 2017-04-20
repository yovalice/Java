package com.javafundamentals.services;

import org.springframework.stereotype.Service;

/**
 * Created by yovaliceroman on 4/19/17.
 */

//Sub class that extends the super class to demonstrate inheritance
@Service
public class InheritanceSubClassService extends InheritanceSuperClassService {

    //sub class method that returns a String
    public String subClassMessage(){
        return "This is a method of the subclass";
    }

    //sub class method that returns the super class method
    public String superClassMessage() {
        return superClass();
    }
}

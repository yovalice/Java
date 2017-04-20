package com.javafundamentals.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by yovaliceroman on 4/20/17.
 */

//class demonstrating a array list
@Service
public class ArrayListReviewService {

    //array list method returning the array list
    public ArrayList<String> arrayList(){

        //creating the array list
        ArrayList<String> arrLEx = new ArrayList<>();

        //adding objects in the array list
        arrLEx.add(0, "Successful");
        arrLEx.add(1, "Example");
        arrLEx.add(2, "of");
        arrLEx.add(3, "Array");
        arrLEx.add(4, "List");

        Iterator i = arrLEx.iterator();
        //Iterate over all elements in the list
        while (i.hasNext()){
            //get and print the next element from the list
            System.out.println(i.next());
        }

        return arrLEx;
    }
}
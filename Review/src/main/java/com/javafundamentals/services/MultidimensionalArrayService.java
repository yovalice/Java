package com.javafundamentals.services;

import org.springframework.stereotype.Service;

/**
 * Created by yovaliceroman on 4/24/17.
 */

//class demonstrating a multidimensional array
@Service
public class MultidimensionalArrayService {

    //multidimensional array method returning the a String
    public String multiArray(){

        //creating the multidimensional array
        String table[][] = new String[2][2];

        table[0][0]= "Yovalice";
        table[0][1]= "Roman";
        table[1][0]= "Liliana";
        table[1][1]= "Cruz";


        for (int t = 0; t < table.length; t++) {
            for (int i = 0; i < table.length; i++) {
                System.out.print(table[t][i] + " ");
            }
            System.out.println();
        }

        return "Success";
    }
}

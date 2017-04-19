package com.javafundamentals.services;

import com.javafundamentals.model.PolymorphismCarModel;
import org.springframework.stereotype.Service;

/**
 * Created by yovaliceroman on 4/19/17.
 */


@Service
public class PolymorphismReviewService {

    PolymorphismCarModel car = new PolymorphismCarModel(2011,2, "Honda", false, 0);

    //method that returns the cost per mile of the object car created
    public double polymorphismexample(){
       return car.costPerMile();
    }


}

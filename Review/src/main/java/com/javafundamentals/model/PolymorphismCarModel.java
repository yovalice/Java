package com.javafundamentals.model;

/**
 * Created by yovaliceroman on 4/19/17.
 */

//class that extends PolymorphismVehicleModel and override the method
//from the vehicleInterface. It shows constructor and method overloading
//and the use of super
public class PolymorphismCarModel extends PolymorphismVehicleModel {

    //private instance variables
    private boolean hasDoor;
    private int doorNum;

    //examples of constructor overloading
    //constructor with no parameter specify
    public PolymorphismCarModel(){

    }

    //constructor with parameters specify
    //use of super keyword
    public PolymorphismCarModel(int year, int wheels, String brand, boolean hasDoor, int doorNum){
        super(year, wheels, brand);
        this.hasDoor = hasDoor;
        this.doorNum = doorNum;
    }

    //Override method from PolymorphismVehicleModel
    @Override
    public double costPerMile() {
        double costPerMile;

        //use of super
        if (super.getWheels() < 3){
            costPerMile = 8.75;
            System.out.println("Cost per mile is 5.0");
        } else {
            costPerMile = 14.0;
            System.out.println("Cost per mile is 8.5");
        }

        return costPerMile;
    }

    //method overloading example
    //it takes an int as a parameter
    public double costPerMile(int costPerMileEx){
        costPerMileEx = 9;

        return costPerMileEx;
    }

}

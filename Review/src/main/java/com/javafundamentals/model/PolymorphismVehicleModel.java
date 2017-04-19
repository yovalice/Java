package com.javafundamentals.model;

/**
 * Created by yovaliceroman on 4/19/17.
 */

//class that implements vehicleInterface to demonstrate polymorphism with Override
public class PolymorphismVehicleModel implements VehicleInterface {

    //private instance variables
    private int year;
    private int wheels;
    private String brand;

    //constructor with no parameter specify
    public PolymorphismVehicleModel(){

    }

    //constructor with parameter specify
    public PolymorphismVehicleModel(int year, int wheels, String brand){
        this.year = year;
        this.wheels = wheels;
        this.brand = brand;

    }

    //getter and setter for the wheels variable
    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    //Override method from the implemented method from vehicleInterface
    @Override
    public double costPerMile() {
        double costPerMile;

        if (wheels < 2){
            costPerMile = 5.0;
            System.out.println("Cost per mile is 5.0");
        } else {
            costPerMile = 8.5;
            System.out.println("Cost per mile is 8.5");
        }

        return costPerMile;
    }
}

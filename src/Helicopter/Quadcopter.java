package Helicopter;

import airplane.Airplane;
import Helicopter.Helicopter;

// -----------------------------------------------------
// Part: 1
// Written by: Louis-Charles Marquis 40177137
// -----------------------------------------------------

public class Quadcopter extends Helicopter {
    
    //datafield
    protected int maxFlyingSpeed;

    //default constructor
    public Quadcopter(){
        
    }
    
    //parameterized constructor
    public Quadcopter(String brand, double price, int horsePower, int noOfCylinders, int creationYear, int passengerCapacity, int maxFlyingSpeed) {
        super(brand, price, horsePower, noOfCylinders, creationYear, passengerCapacity);
        this.maxFlyingSpeed = maxFlyingSpeed;
    }

    //copy constructor
    Quadcopter(Quadcopter q){
        brand=q.brand;
        price=q.price;
        horsePower=q.horsePower;
        noOfCylinders=q.noOfCylinders;
        creationYear=q.creationYear;
        passengerCapacity=q.passengerCapacity;
        maxFlyingSpeed=q.maxFlyingSpeed;
    }
    
    //set and get methods
    public int getMaxFlyingSpeed() {
        return maxFlyingSpeed;
    }

    public void setMaxFlyingSpeed(int maxFlyingSpeed) {
    this.maxFlyingSpeed = maxFlyingSpeed;
    }

    //toString method
    public String toString() {
         return "This Quadcopter is manufactured by " + brand + " and costs "+ price + "$ " +
                "it has horse power " + horsePower +", " + noOfCylinders + " cylinders, was created in " + 
                creationYear + " and has " + passengerCapacity + " passengers and a maximum flying speed of " 
                + maxFlyingSpeed; 
    }

    //equals method
    public boolean equals(Object obj) {
        // If the object is compared with itself then return true 
        if (this == obj) {
            return true;
        }

        //Check if obj is an instance of Quadcopter or not "null instanceof [type]" also returns false
        if (!(obj instanceof Quadcopter)) {
            return false;
        }

        Quadcopter other = (Quadcopter) obj;

        // Compare the data members and return accordingly
        if (brand != other.brand) {
            return false;
        }
        if (horsePower != other.horsePower) {
            return false;
        }
        if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price)) {
            return false;
        }
        if (creationYear != other.creationYear) {
            return false;
        }
        if (noOfCylinders != other.noOfCylinders) {
            return false;
        }
        if (passengerCapacity != other.passengerCapacity) {
            return false;
        }
        if (maxFlyingSpeed != other.maxFlyingSpeed) {
            return false;
        }
        
        return true;
    }
    
}


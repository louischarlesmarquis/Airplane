package Multirotor;

import airplane.Airplane;
import Helicopter.Helicopter;

// -----------------------------------------------------
// Part: 1
// Written by: Louis-Charles Marquis 40177137
// -----------------------------------------------------

public class Multirotor extends Helicopter {
    //datafield
    private int numOfRotors;

    //default constructor
    public Multirotor() {
    super();
    }

    //parameterized constructor
    public Multirotor(String brand, double price, int horsePower, int numOfRotors, int numCylinders, int creationYear, int capacity) {
        super(brand, price, horsePower, numCylinders, creationYear, capacity);
        this.numOfRotors = numOfRotors;
    }
    
    //copy constructor
    Multirotor(Multirotor m){
        brand=m.brand;
        price=m.price;
        horsePower=m.horsePower;
        noOfCylinders=m.noOfCylinders;
        creationYear=m.creationYear;
        passengerCapacity=m.passengerCapacity;
        numOfRotors=m.numOfRotors;
    }

    //set and get method
    public Integer getNumOfRotors() {
        return numOfRotors;
    }

    public void setNumOfRotors(Integer numOfRotors) {
        this.numOfRotors = numOfRotors;
    }

    //toString method
    public String toString() {
        return "This Multirotor is manufactured by " + brand + " and costs "+ price + "$ " +
               "it has horse power " + horsePower +", " + noOfCylinders + " cylinders, was created in " + 
               creationYear + " and has " + passengerCapacity + " passengers and has " + numOfRotors + " rotors.";
    }

    //equals method
    public boolean equals(Object obj) {
        // If the object is compared with itself then return true 
        if (obj == this) {
            return true;
        }
 
        //Check if obj is an instance of Multirotor or not "null instanceof [type]" also returns false 
        if (!(obj instanceof Multirotor)) {
            return false;
        }
        
        // typecast obj to Multirotor so that we can compare data members
        Multirotor other = (Multirotor) obj;

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
        if (numOfRotors != other.numOfRotors) {
            return false;
        }
        return true;
    }
      
}


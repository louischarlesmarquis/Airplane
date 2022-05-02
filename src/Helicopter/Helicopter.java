package Helicopter;

// -----------------------------------------------------
// Part: 1
// Written by: Louis-Charles Marquis 40177137
// -----------------------------------------------------

import airplane.Airplane;

public class Helicopter extends Airplane {

    //datafield
    protected int noOfCylinders;
    protected int creationYear;
    protected int passengerCapacity;

    //default constructor
    public Helicopter(){
        
    }

    //parameterized constructor
    public Helicopter(String brand, double price, int horsePower, int noOfCylinders, int creationYear, int passengerCapacity) {
        super(brand, price, horsePower);
        this.noOfCylinders = noOfCylinders;
        this.creationYear = creationYear;
        this.passengerCapacity = passengerCapacity;
    }

    //copy constructor
    Helicopter(Helicopter h){
        brand=h.brand;
        price=h.price;
        horsePower=h.horsePower;
        noOfCylinders=h.noOfCylinders;
        creationYear=h.creationYear;
        passengerCapacity=h.passengerCapacity;
    }
    
    //set and get methods
    public int getNoOfCylinders() {
        return noOfCylinders;
    }

    public void setNoOfCylinders(int noOfCylinders) {
        this.noOfCylinders = noOfCylinders;
    }

    public int getCreationYear() {
        return creationYear;
    }

    public void setCreationYear(int creationYear) {
        this.creationYear = creationYear;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    //toString method
    public String toString() {
        return "This Helicopter is manufactured by " + brand + " and costs "+ price + "$ " +
               "it has horse power " + horsePower +", " + noOfCylinders + " cylinders, was created in " + 
               creationYear + " and has " + passengerCapacity + " passengers";
    }

    //equals method
    public boolean equals(Object obj) {
        // If the object is compared with itself then return true
        if (this == obj) {
            return true;
        }

        //Check if obj is an instance of Helicopter or not "null instanceof [type]" also returns false
        if (!(obj instanceof Helicopter)) {
            return false;
        }

        // typecast obj to Helicopter so that we can compare data members
        Helicopter other = (Helicopter) obj;

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

        return true;
    }

}
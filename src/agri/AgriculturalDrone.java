package agri;

import UAV.UAV;

// -----------------------------------------------------
// Part: 1
// Written by: Louis-Charles Marquis 40177137
// -----------------------------------------------------

public class AgriculturalDrone extends UAV {
    
    //datafield
    private String brand;
    private int capacity;
    
    //default constructor
    public AgriculturalDrone(){
        
    }
    
    //parameterized constructor
    public AgriculturalDrone(String brand, int capacity, double weight, double price) {
        super(weight, price);
        this.brand = brand;
        this.capacity = capacity;
    }

    //copy constructor
    AgriculturalDrone(AgriculturalDrone a){
        weight=a.weight;
        price=a.price;
        brand=a.brand;
        capacity=a.capacity;
    }
    
    //set and get methods
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    //toString method
    public String toString() {
        return "This AgriculturalDrone is manufactured by " + brand + " it weights " + 
               weight + " pounds and costs "+ price + "$ " +
                "it can carry upto " + capacity ;
    } 

    //equals method
    public boolean equals(Object obj) {
        // If the object is compared with itself then return true
        if (this == obj) {
            return true;
        }

        //Check if obj is an instance of AgriculturalDrone or not "null instanceof [type]" also returns false
        if (!(obj instanceof AgriculturalDrone)) {
            return false;
        }

        // typecast obj to AgriculturalDrone so that we can compare data members
        AgriculturalDrone other = (AgriculturalDrone) obj;

        // Compare the data members and return accordingly
        if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price)) {
            return false;
        }
        if (weight != other.weight) {
            return false;
        }
        if (brand != other.brand) {
            return false;
        }
        if (capacity != other.capacity) {
            return false;
        }
        
        return true;
    }
}

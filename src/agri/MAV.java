package agri;

import UAV.UAV;

// -----------------------------------------------------
// Part: 1
// Written by: Louis-Charles Marquis 40177137
// -----------------------------------------------------

public class MAV extends UAV {
    //datafield
    private String model;
    private double size;

    //default constructor
    public MAV(){
        
    }
    
    //parameterized constructor
    public MAV(String model, double size,double weight, double price) {
        super(weight, price);
        this.model = model;
        this.size = size;
    }

    //copy constructor
    MAV(MAV a){
        weight=a.weight;
        price=a.price;
        model=a.model;
        size=a.size;
    }

    //set and get methods
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    //toString method
    public String toString() {
        return "The MAV weighs" + weight + "kg, costs " + price + "$, has a size of " + 
                size + " and its model is " + model;
    }
    
    //equals method
    public boolean equals(Object obj) {
        // If the object is compared with itself then return true
        if (this == obj) {
            return true;
        }

        //Check if obj is an instance of MAV or not "null instanceof [type]" also returns false
        if (!(obj instanceof MAV)) {
            return false;
        }

        // typecast obj to MAV so that we can compare data members
        MAV other = (MAV) obj;

        // Compare the data members and return accordingly
        if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price)) {
            return false;
        }
        if (weight != other.weight) {
            return false;
        }
        if (size != other.size) {
            return false;
        }
        if (model != other.model) {
            return false;
        }
        
        return true;
    }
}

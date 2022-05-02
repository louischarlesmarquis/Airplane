package UAV;

// -----------------------------------------------------
// Part: 1
// Written by: Louis-Charles Marquis 40177137
// -----------------------------------------------------

public class UAV {
    
    protected double weight;
    public double price;

    /**
    * @param weight
    * @param price
    */
    
    //default constructor
    public UAV(){
        
    }
    
    //parameterized constructor
    public UAV(double weight, double price) {
        super();
        this.weight = weight;
        this.price = price;
    }
    
    //copy constructor
    UAV(UAV a){
        weight=a.weight;
        price=a.price;
    }

    //set and get methods
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //toString method
    public String toString() {
        return "The UAV weighs" + weight + "kg and costs " + price + "$.";
    }
    
    //equals method
    public boolean equals(Object obj) {
        // If the object is compared with itself then return true
        if (this == obj) {
            return true;
        }

        //Check if obj is an instance of UAV or not "null instanceof [type]" also returns false
        if (!(obj instanceof UAV)) {
            return false;
        }

        // typecast obj to UAV so that we can compare data members
        UAV other = (UAV) obj;

        // Compare the data members and return accordingly
        if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price)) {
            return false;
        }
        if (weight != other.weight) {
            return false;
        }
        
        return true;
    }
}

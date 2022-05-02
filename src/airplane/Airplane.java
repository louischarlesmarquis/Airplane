package airplane;

// -----------------------------------------------------
// Part: 1
// Written by: Louis-Charles Marquis 40177137
// -----------------------------------------------------

public class Airplane {

    //datafield
    protected String brand;
    public double price;
    protected int horsePower;
    
    //default constructor
    public Airplane(){
        
    }
    //parameterized constructon
    public Airplane(String brand, double price, int horsePower) {
        this.brand = brand;
        this.price = price;
        this.horsePower = horsePower;
    }
    
    //copy constructor
    Airplane(Airplane a) {
        brand = a.brand;
        price = a.price;
        horsePower = a.horsePower;
    }

    //set and get methods
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
    
    //toString method
    public String toString() {
        return "This Airplane is manufactured by " + brand + " and costs "+ price + "$ " +
               "it has horse power " + horsePower ;
    }

    //equals method
    public boolean equals(Object obj) {
        // If the object is compared with itself then return true 
        if (this == obj) {
            return true;
        }
        //Check if obj is an instance of Airplane or not "null instanceof [type]" also returns false
        if (!(obj instanceof Airplane)) {
            return false;
        }
        
        // typecast obj to Airplane so that we can compare data members
        Airplane other = (Airplane) obj;
        
        // Compare the data members and return accordingly
        if (other.brand != null) {
            return false;
        }
        else if (!brand.equals(other.brand)) {
            return false;
        }
        if (horsePower != other.horsePower) {
            return false;
        }

        if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price)) {
            return false;
        }
        
        return true;
    }
}


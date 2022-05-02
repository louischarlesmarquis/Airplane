
package test01;

import Helicopter.Helicopter;
import Helicopter.Quadcopter;
import Multirotor.Multirotor;
import UAV.UAV;
import agri.AgriculturalDrone;
import agri.MAV;
import airplane.Airplane;

public class Driver01 {
    
    public static String findLeastAndMostExpensiveUAV(UAV[] arr){
        
        int count=0;
        //check if elements of the array are of UAV type
        for (int i = 0; i < arr.length; i++) { 
            if (!(arr[i] instanceof UAV)) { 
                count++;
            }
            if(count==arr.length){
                //if every object is not an instance of UAV, return the following message
                return "There are no UAVs in the array.";
            }
        }
        
        double max = arr[0].price;
        for (int i = 1; i < arr.length; i++){
            if(arr[i].price > max){
                  max = arr[i].price;
            }
        }
        
        double min = arr[0].price;
        for (int i = 1; i < arr.length; i++){
            if(arr[i].getPrice() < min){
                  min = arr[i].price;
            }
        }
        
        return "The most expensive UAV is at index "+max+
               " and the least expensive UAV is at index "+min+".";
    }

    public static void main(String[] args) {
    
        //create at least 15 objects from the 7 different classes
        Airplane a1 = new Airplane("Boeing", 1000000, 10000);
        Airplane a2 = new Airplane("Airbus", 900000, 1000);
        Airplane a3 = new Airplane("Bombardier", 9999999, 99999);

        Helicopter h1 = new Helicopter("Boeing", 1000000, 10000, 5, 2010, 4);
        Helicopter h2 = new Helicopter("Airbus", 100000, 1000, 10, 2015, 8);
        Helicopter h3 = new Helicopter("Bombardier", 9999999, 99999, 15, 2020, 12);

        Quadcopter q1 = new Quadcopter("Boeing", 1000000, 10000, 5, 2010, 4,1);
        Quadcopter q2 = new Quadcopter("Airbus", 6000, 1000, 10, 2015, 8,4);

        Multirotor m1 = new Multirotor("Boeing", 1000000, 10000, 5, 2010, 4,1);
        Multirotor m2 = new Multirotor("Airbus", 500000, 1000, 10, 2015, 8,2);
        Multirotor m3 = new Multirotor("Airbus", 600000, 1000, 10, 2015, 8,3);

        UAV u1 = new UAV(10, 10000);
        UAV u2 = new UAV(10, 10000);
        UAV u3 = new UAV(100, 100000);

        AgriculturalDrone d1 = new AgriculturalDrone("John Deere", 100000, 3423, 34);
        AgriculturalDrone d2 = new AgriculturalDrone("Cargill", 200000, 103, 43);
        AgriculturalDrone d3 = new AgriculturalDrone("Cargill", 200000, 103, 43);

        MAV mav1 = new MAV("AgriMarche", 100, 34,43);
        MAV mav2 = new MAV("Olymel", 300,34,43);
        MAV mav3 = new MAV("MultiCo", 1000,54,34);

        //put all the objects in an array
        Object[] x = new Object[20];
        x[0] = a1;
        x[1] = a2;
        x[2] = a3;
        x[3] = h1;
        x[4] = h2;
        x[5] = h3;
        x[6] = m1;
        x[7] = m2;
        x[8] = m3;
        x[9] = u1;
        x[10] = u2;
        x[11] = u3;
        x[12] = d1;
        x[13] = d2;
        x[14] = d3;
        x[15] = mav1;
        x[16] = mav2;
        x[17] = mav3;
        x[18] = q1;
        x[19] = q2;

        //prints every object's information using the toString method
        for(int i=0; i<x.length;i++){
            System.out.println(x[i].toString());
        }
        
        /*
           test the equality of two objects from different classes, 
           two objects from the same class with different values and 
           two objects with similar values.
        */
        //different classes: should print false
        System.out.println(a1.equals(h1));
        System.out.println(a2.equals(h2));
        
        //same class, different values: should print false
        System.out.println(q1.equals(q2));
        System.out.println(m1.equals(m2));
        
        //same values: should print true
        System.out.println(d2.equals(d3));
        System.out.println(u1.equals(u2));
        
        //The first array must include at least one object from each of
        //the classes; while the second array should not have any UAV objects. 
        
        //first array with all the classes
        UAV[] y = new UAV[7];
        
        Airplane a = new Airplane("Boeing", 1000000, 10000);
        Helicopter h = new Helicopter("Boeing", 1000000, 10000, 5, 2010, 4);
        Quadcopter q = new Quadcopter("Boeing", 1000000, 10000, 5, 2010, 4,1);
        Multirotor m = new Multirotor("Boeing", 1000000, 10000, 5, 2010, 4,1);
        AgriculturalDrone d = new AgriculturalDrone("John Deere", 100000, 3423, 34);
        MAV mav = new MAV("AgriMarche", 100, 34,43);
        UAV u = new UAV(10, 10000);
        UAV u02 = new UAV(100, 100000);
        
        x[0] = a;
        x[1] = h;
        x[2] = q;
        x[3] = m;
        x[4] = d;
        x[5] = mav;
        x[6] = u;
        x[7] = u02;
        
        UAV[] z = new UAV[6];
        
        Airplane a01 = new Airplane("Boeing", 1000000, 10000);
        Helicopter h01 = new Helicopter("Boeing", 1000000, 10000, 5, 2010, 4);
        Quadcopter q01 = new Quadcopter("Boeing", 1000000, 10000, 5, 2010, 4,1);
        Multirotor m01 = new Multirotor("Boeing", 1000000, 10000, 5, 2010, 4,1);
        AgriculturalDrone d01 = new AgriculturalDrone("John Deere", 100000, 3423, 34);
        MAV mav01 = new MAV("AgriMarche", 100, 34,43);
        
        x[0] = a01;
        x[1] = h01;
        x[2] = q01;
        x[3] = m01;
        x[4] = d01;
        x[5] = mav01;
        
        System.out.println(findLeastAndMostExpensiveUAV(y));
        System.out.println(findLeastAndMostExpensiveUAV(z));
    }
}

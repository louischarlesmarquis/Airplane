package test;

import airplane.Airplane;
import Helicopter.Helicopter;
import Helicopter.Quadcopter;
import Multirotor.Multirotor;
import UAV.UAV;
import agri.AgriculturalDrone;
import agri.MAV;

public class Driver {

    //This method will copy the inputed array into a new array and then print its contents
    public static Object[] copyFlyingObjects(Object[] a) {
        
        Object[] newArray = new Object[a.length];
        
        for (int i = 0; i < a.length; i++) {
            newArray[i] = a[i];
        }
        return newArray;
    }

    public static void main(String[] args) {

        //20 objects from the 7 different classes
        Airplane a1 = new Airplane("Boeing", 1000000, 10000);
        Airplane a2 = new Airplane("Airbus", 100000, 1000);
        Airplane a3 = new Airplane("Bombardier", 9999999, 99999);

        Helicopter h1 = new Helicopter("Boeing", 1000000, 10000, 5, 2010, 4);
        Helicopter h2 = new Helicopter("Airbus", 100000, 1000, 10, 2015, 8);
        Helicopter h3 = new Helicopter("Bombardier", 9999999, 99999, 15, 2020, 12);
        
        Quadcopter q1 = new Quadcopter("Boeing", 1000000, 10000, 5, 2010, 4,1);
        Quadcopter q2 = new Quadcopter("Airbus", 100000, 1000, 10, 2015, 8,4);
        
        Multirotor m1 = new Multirotor("Boeing", 1000000, 10000, 5, 2010, 4,1);
        Multirotor m2 = new Multirotor("Airbus", 100000, 1000, 10, 2015, 8,2);
        Multirotor m3 = new Multirotor("Airbus", 100000, 1000, 10, 2015, 8,3);
        
        UAV u1 = new UAV(10, 10000);
        UAV u2 = new UAV(50, 50000);
        UAV u3 = new UAV(100, 100000);
        
        AgriculturalDrone d1 = new AgriculturalDrone("John Deere", 100000, 3423, 34);
        AgriculturalDrone d2 = new AgriculturalDrone("Cargill", 200000, 103, 43);
        AgriculturalDrone d3 = new AgriculturalDrone("Cargill", 50000, 103, 43);
        
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
        
       copyFlyingObjects(x);
    }
}
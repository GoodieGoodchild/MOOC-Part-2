
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jonat
 */
public class VehicleRegistry {
 
    private HashMap<LicensePlate, String> car = new HashMap<>();
    
    public VehicleRegistry() {
        
    }
    
    public boolean add(LicensePlate licensePlate, String owner) {
        
        if (this.car.containsKey(licensePlate)){ //lp already exists!
            return false;
        }
       else { //lp doesn't exist! Add it!
            this.car.put(licensePlate, owner);
            return true;
        }
    }
    
    public String get (LicensePlate licencePlate) {
        //returns the owner of the car corresponding to the license plate received as a parameter. 
        //If the car isn't in the registry, the method returns null.
        if (car.containsKey(licencePlate)) {
            return this.car.get(licencePlate);
        } else {
            return null;
        }
    }
    
    public boolean remove(LicensePlate licencePlate) {
        // removes the license plate and attached data from the registry. The method returns 
        // true if removed successfully and false if the license plate wasn't in the registry.
        if (car.containsKey(licencePlate)) {
            car.remove(licencePlate);
            return true;
        }
        
        return false;
    }
    
    public void printLicensePlates() {
        car.keySet().iterator().forEachRemaining(System.out::println);
    }
    
    public void printOwners() {
    ArrayList<String> noDoubleOwners = new ArrayList<>();
        for (LicensePlate lp : this.car.keySet()) {
            String owner = this.car.get(lp);
            if (!(noDoubleOwners.contains(owner))) {
                noDoubleOwners.add(owner);
                System.out.println(owner);
            }
        }
    }
    
    
    
}

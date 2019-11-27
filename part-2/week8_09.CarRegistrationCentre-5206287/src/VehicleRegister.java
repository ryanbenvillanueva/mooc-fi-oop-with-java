/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ryan Ben
 */
import java.util.HashMap;
import java.util.ArrayList;


public class VehicleRegister {
    private HashMap<RegistrationPlate, String> owners;
    
    public VehicleRegister() {
        this.owners = new HashMap<RegistrationPlate, String>();
    }
    
    public boolean add(RegistrationPlate plate, String owner) {
        if (owners.containsKey(plate)) {
            return false;
        }
        
        owners.put(plate, owner);
        
        return true;
    }
    
    public String get(RegistrationPlate plate) {
        if (!owners.containsKey(plate)) {
            return null;
        }
        
        return owners.get(plate);
    }
    
    public boolean delete(RegistrationPlate plate) {
        if (!owners.containsKey(plate)) {
            return false;
        }
        
        owners.remove(plate);
        
        return true;
    }
    
    public void printRegistrationPlates() {
        for (RegistrationPlate plate : owners.keySet()) {
            System.out.println(plate);
        }
    }
    
    public void printOwners() {
        ArrayList<String> ownerList = new ArrayList<String>();
        
        for (RegistrationPlate plate : owners.keySet()) {
            String currentOwner = owners.get(plate);
            
            if (!ownerList.contains(currentOwner)) {
                ownerList.add(currentOwner);
                System.out.println(owners.get(plate));
                        
            }
        }
    }
}

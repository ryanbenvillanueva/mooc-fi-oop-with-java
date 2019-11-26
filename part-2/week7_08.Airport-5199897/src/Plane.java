/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ryan Ben
 */
public class Plane {
    private String planeID;
    private int capacity;
    
    public Plane(String planeID, int capacity) {
        this.planeID = planeID;
        this.capacity = capacity;
    }
    
    public String getPlaneID() {
        return this.planeID;
    }
    
    public int getCapacity() {
        return this.capacity;
    }
    
    public String toString() {
        return planeID + " (" + capacity + " ppl)";
    }
}

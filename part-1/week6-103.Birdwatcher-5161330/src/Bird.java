/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ryan Ben
 */
public class Bird {
    private String name;
    private String latinName;
    private int observationCount;
    
    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observationCount = 0;
    }
    
    public void increaseObservationCount() {
        observationCount++;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String toString() {
        return this.name + "(" + this.latinName + "): " + this.observationCount + " observations";
    }
}

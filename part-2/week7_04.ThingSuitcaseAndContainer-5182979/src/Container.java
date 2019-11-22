/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ryan Ben
 */
import java.util.ArrayList;

public class Container {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;
    private int totalWeight;
    
    public Container(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<Suitcase>();
        this.totalWeight = 0;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if(this.totalWeight + suitcase.totalWeight() <= maxWeight) {
            suitcases.add(suitcase);
            totalWeight += suitcase.totalWeight();
        }
    }
    
    public String toString() {
        return "" + this.suitcases.size() + " suitcases (" + this.totalWeight + " kg)";  
    }
    
    public void printThings() {
        for (Suitcase suitcase : suitcases) {
            suitcase.printThings();
        }
    }
}

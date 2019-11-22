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

public class Suitcase {

    private ArrayList<Thing> things;
    private int maxWeight;
    private int totalWeight;

    public Suitcase(int maxWeight) {
        this.things = new ArrayList<Thing>();
        this.maxWeight = maxWeight;
        this.totalWeight = 0;
    }

    public void addThing(Thing thing) {
        if ((this.totalWeight + thing.getWeight()) <= this.maxWeight) {
            this.things.add(thing);
            totalWeight += thing.getWeight();
        }
    }

    public String toString() {
        if (things.isEmpty()) {
            return "empty (0 kg)";
        }
        if (things.size() == 1) {
            return "1 thing (" + this.totalWeight + " kg)";
        } else {
            return "" + this.things.size() + " things (" + this.totalWeight + " kg)";
        }
    }
    
    public void printThings(){
        for (Thing thing: things) {
            System.out.println(thing);
        }
    }
    
    public int totalWeight() {
        return this.totalWeight;
    }
    
    public Thing heaviestThing() {
        if (things.isEmpty()) {
            return null;
        }
        int heaviest = things.get(0).getWeight();
        Thing heaviestThing = things.get(0);
        
        for (int i = 1; i < things.size(); i++) {
            if (things.get(i).getWeight() > heaviest ) {
                heaviest = things.get(i).getWeight();
                heaviestThing = things.get(i);
            }
        }
        return heaviestThing;
    }
}

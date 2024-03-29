/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ryan Ben
 */
public class Box implements Thing {

    private int maximumCapacity;
    private List<Thing> things;

    public Box(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
        this.things = new ArrayList<Thing>();
    }

    public boolean addThing(Thing thing) {
        if (thing.getVolume() + this.getVolume() > maximumCapacity) {
            return false;
        }
        
        things.add(thing);
        
        return true;
    }

    @Override
    public int getVolume() {
        int volume = 0;

        for (Thing thing : things) {
            volume += thing.getVolume();
        }
        
        return volume;
    }
}

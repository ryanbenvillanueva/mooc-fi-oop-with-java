/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movable;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ryan Ben
 */
public class Group implements Movable{

    private List<Movable> movables;
    
    public Group() {
        this.movables = new ArrayList<Movable>();
    }
    
    @Override
    public String toString() {
        
        String output = "";
        
        for (Movable movable : movables) {
            output += movable.toString() + "\n";
        }
        
        return output;
    }
    
    public void addToGroup(Movable movable) {
        movables.add(movable);
    }
    
    @Override
    public void move(int dx, int dy) {
        for (Movable organism : movables) {
            organism.move(dx, dy);
        }
    }
    
}

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

public class Database {

    private ArrayList<Bird> birds;

    public Database() {
        this.birds = new ArrayList<Bird>();
    }

    public void addBird(String name, String latinName) {
        Bird bird = new Bird(name, latinName);
        birds.add(bird);
    }
    
    public void addObservation(String name) {
        for (Bird bird : birds) {
            if (bird.getName().equalsIgnoreCase(name)) {
                bird.increaseObservationCount();
                break;
            }
        }
        System.out.println("Is not a bird!");
    }
    
    public void printAllBirds() {
        for (Bird bird : birds) {
            System.out.println(bird);
        }
    }
    
    public String printBird(String name) {
        for (Bird bird : birds) {
            if (bird.getName().equalsIgnoreCase(name)) {
                System.out.println(bird);
                break;
            }
        }
        return "Is not a bird!";
    }
}

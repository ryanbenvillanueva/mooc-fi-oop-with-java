/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author Ryan Ben
 */
public class Thermometer implements Sensor {

    private Random random;
    private boolean on;

    public Thermometer() {
        this.random = new Random();
        this.on = false;
    }

    @Override
    public boolean isOn() {
        return on;
    }

    @Override
    public void on() {
        on = true;
    }

    @Override
    public void off() {
        on = false;
    }

    @Override
    public int measure() {
        if (!on) {
            throw new IllegalStateException("Cannot measure, thermometer is off");
        }
        
        int temp = -30 + random.nextInt(60);
        
        return temp;
    }

}

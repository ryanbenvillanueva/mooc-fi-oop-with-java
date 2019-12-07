/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ryan Ben
 */
public class AverageSensor implements Sensor{
    private List<Sensor> sensors;
    private List<Integer> readings;
    
    
    public AverageSensor() {
        this.sensors = new ArrayList<Sensor>();
        this.readings = new ArrayList<Integer>();
    }
    
    public void addSensor(Sensor additional) {
        sensors.add(additional);
    }
    
    public List<Integer> readings() {
        return readings;
    }
    
    @Override
    public boolean isOn() {
        int sensorsCount = 0;
        
        for (Sensor s : sensors) {
            if (s.isOn()) {
                sensorsCount++;
            }
        }
        
        if (sensorsCount == sensors.size()) {
            return true;
        }
        
        return false;
    }

    @Override
    public void on() {
        for (Sensor s: sensors) {
            s.on();
        }
    }

    @Override
    public void off() {
        for (Sensor s: sensors) {
            s.off();
        }
    }

    @Override
    public int measure() {
        if(!isOn() || sensors.size() == 0) {
            throw new IllegalStateException();
        }
        
        int sumOfMeasures = 0;
        
        for (Sensor s : sensors) {
            sumOfMeasures += s.measure();
        }
        int average = sumOfMeasures / sensors.size();
        readings.add(average);
        
        return average;
    }
}

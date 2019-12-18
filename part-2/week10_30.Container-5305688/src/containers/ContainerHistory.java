/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Ryan Ben
 */
public class ContainerHistory {
    
    private List<Double> containerHistory;
    
    public ContainerHistory() {
        containerHistory = new ArrayList<Double>();
    }
    
    public void add(double situation) {
        containerHistory.add(situation);
    }
    
    public void reset() {
        containerHistory.clear();
    }
    
    @Override
    public String toString() {
        return containerHistory.toString();
    }
    
    public double maxValue() {
        double maxValue = 0.0;
        
        if (containerHistory.isEmpty()) {
            return 0;
        }
        
        return Collections.max(containerHistory);
    }
    
    public double minValue() {
        double minValue = 0.0;
        
        if (containerHistory.isEmpty()) {
            return 0;
        }
        
        return Collections.min(containerHistory);
    }
    
    public double average() {
        double sum = 0;
        
        if (containerHistory.isEmpty()) {
            return 0;
        }
        
        for (double value : containerHistory) {
            sum += value;
        }
        
        return sum / containerHistory.size();
    }
    
    public double greatestFluctuation() {
        if (containerHistory.isEmpty() || containerHistory.size() == 1) {
            return 0;
        }
        
        double greatestFluctuation = 0;
        
        for (int i = 1; i < containerHistory.size(); i++) {
            double difference = Math.abs(containerHistory.get(i) - containerHistory.get(i - 1));
            
            if (difference > greatestFluctuation) {
                greatestFluctuation = difference;
            }
        }
        
        return greatestFluctuation;
    }
    
    public double variance() {
        if (containerHistory.isEmpty() || containerHistory.size() == 1) {
            return 0;
        }
        
        double average = average();
        double variance = 0;
        
        for (double value : containerHistory) {
            variance += Math.pow((value - average), 2);
        }
        
        variance /= (containerHistory.size() - 1);
        
        return variance;
    }
}

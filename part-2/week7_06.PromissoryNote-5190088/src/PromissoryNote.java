/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ryan Ben
 */
import java.util.HashMap;

public class PromissoryNote {
    private HashMap<String, Double> debts;
    
    public PromissoryNote() {
        this.debts = new HashMap<String, Double>();
    }
    
    public void setLoan(String toWhom, double value) {
        debts.put(toWhom, value);
    }
    
    public double howMuchIsTheDebt(String whose) {
        if(debts.containsKey(whose)) {
            return debts.get(whose);
        }
        
        return 0;
    }
}

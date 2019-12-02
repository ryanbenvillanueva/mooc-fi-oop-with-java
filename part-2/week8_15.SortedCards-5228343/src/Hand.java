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
import java.util.Collections;

public class Hand implements Comparable<Hand>{
    private ArrayList<Card> hand;
    
    public Hand() {
        this.hand = new ArrayList<Card>();
    }
    
    public  void add(Card card) {
        hand.add(card);
    }
    
    public void print() {
        for (Card card : hand) {
            System.out.println(card);
        }
    }
    
    public void sort() {
        Collections.sort(hand);
    }
    
    public int compareTo(Hand hand) {
        int thisTotalValue = 0;
        int handTotalValue = 0;
        
        for (Card card : this.hand) {
            thisTotalValue += card.getValue();
        }
        
        for (Card card : hand.hand) {
            handTotalValue += card.getValue();
        }
        
        return thisTotalValue - handTotalValue;
    }
    
    public void sortAgainstSuit() {
        Collections.sort(this.hand, new SortAgainstSuitAndValue());
    }
}

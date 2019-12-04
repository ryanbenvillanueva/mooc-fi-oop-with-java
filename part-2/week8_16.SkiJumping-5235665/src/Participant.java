/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ryan Ben
 */
import java.util.Map;
import java.util.HashMap;

public class Participant implements Comparable<Participant> {
    private String name;
    private Map<Integer, JumpPoints> roundPoints;
    public Participant(String name) {
        this.name = name;
        this.roundPoints = new HashMap<Integer, JumpPoints>();
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setRoundPoints(int roundNumber) {
        roundPoints.put(roundNumber, new JumpPoints());
    }
    
    public int getTotalPoints() {
        int totalPoints = 0;
        
        for (JumpPoints j : roundPoints.values()) {
            totalPoints += j.getTotalJumpPoints();
        }
        
        return totalPoints;
    }
    
    public void printJumpLengths() {
        for (int i = 1; i <= roundPoints.size(); i++) {
            JumpPoints jumpPoint = roundPoints.get(i);
            
            if (i < roundPoints.size()) {
                System.out.print(jumpPoint.getLength() + " m, ");
            } else {
                System.out.println(jumpPoint.getLength() + " m");
            }
        }
    }
    
    public void printJumpResults(int roundNumber) {
        JumpPoints jumpPoint = roundPoints.get(roundNumber);
        
        System.out.println("  " + getName());
        System.out.println("    length: " + jumpPoint.getLength());
        System.out.print("    judge votes: ");
        jumpPoint.printJudgeVotes();
        System.out.println();
    }
 
    public int compareTo(Participant participant) {
        return this.getTotalPoints() - participant.getTotalPoints();
    }
}

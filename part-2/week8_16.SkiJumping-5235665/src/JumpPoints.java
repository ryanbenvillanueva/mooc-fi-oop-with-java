/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ryan Ben
 */
import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class JumpPoints {
    
    private Random random;
    private int length;
    private ArrayList<Integer> judgeVotes;
    
    public JumpPoints() {
        this.random = new Random();
        this.length = random.nextInt(120-60) + 60;
        this.judgeVotes = new ArrayList<Integer>();
        generateJudgeVotes();
    }
    
    public int getLength() {
        return this.length;
    }
    
    public void generateJudgeVotes() {
        for (int i = 0; i < 5; i++) {
            judgeVotes.add(random.nextInt(20-10) + 10);
        }
    }
    
    public void printJudgeVotes() {
        System.out.print("[");
        for(int i = 0; i < 4; i++) {
            System.out.print(judgeVotes.get(i) + ", ");
        }
        System.out.print(judgeVotes.get(4) + "]");
    }
    
    public int getTotalJumpPoints() {
        int totalJudgeVotePoints = 0;
        
        Collections.sort(judgeVotes);
        for (int i = 1; i < judgeVotes.size() - 1; i++) {
            totalJudgeVotePoints += judgeVotes.get(i);
        } 
        
        int totalJumpPoints = totalJudgeVotePoints + length;
        
        return totalJumpPoints;
    }
}

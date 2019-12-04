/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ryan Ben
 */
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class SkiJumping {
    private Scanner reader;
    private List<Participant> participants;
    private int roundNumber;
    

    public SkiJumping() {
        this.reader = new Scanner(System.in);
        this.participants = new ArrayList<Participant>();
        this.roundNumber = 1;
    }

    public void start() {
        addParticipants();
        startTournament();
        endTournament();
    }
    
    public void addParticipants() {
        System.out.println("Kumpula ski jumping week\n");
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
        
        while (true) {
            System.out.print("  Participant name: ");
            String name = reader.nextLine();
            
            if (name.isEmpty()) {
                break;
            }
            
            participants.add(new Participant(name));
        }
    }
    
    public void startTournament() {
        System.out.println("\nThe tournament begins!");
        
        while (true) {
            System.out.println("\nWrite \"jump\" to jump; otherwise you quit: ");
            String input = reader.nextLine();
            
            if (!input.equals("jump")) {
                break;
            }
            
            playRound();
        }
    }
    
    public void playRound() {
        System.out.println("\nRound " + roundNumber + "\n");
        printJumpOrder();
        
        for (Participant p : participants) {
            p.setRoundPoints(roundNumber);
        }
        
        printRoundResults();
        roundNumber++;
    }
    
    public void printJumpOrder() {
        
        System.out.println("Jumping order:");
        Collections.sort(participants);
        
        int i = 1;
        for (Participant p : participants) {
            System.out.println("  " + i + ". " + p.getName() + " (" + p.getTotalPoints() + " points)");
            i++;
        }
    }
    
    public void printRoundResults() {
        System.out.println("\nResults of round " + roundNumber);
        
        for (Participant p : participants) {
            p.printJumpResults(roundNumber);
        }
    }
    
    public void endTournament() {
        System.out.println("\nThanks!\n");
        System.out.println("Tournament results:");
        
        Collections.sort(participants);
        Collections.reverse(participants);
        
        System.out.println("Position    Name");
        
        for (int i = 0; i < participants.size(); i++) {
            Participant p = participants.get(i);
            
            System.out.println((i + 1) + "           " + p.getName() + " (" + p.getTotalPoints() + " points)");
            System.out.print("            jump lengths: ");
            p.printJumpLengths();
        }
    }
}

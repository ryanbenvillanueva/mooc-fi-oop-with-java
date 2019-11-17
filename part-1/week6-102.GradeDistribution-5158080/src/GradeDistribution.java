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
import java.util.ArrayList;

public class GradeDistribution {

    private Scanner scanner;
    private ArrayList<Integer> scores;
    private int[]grades;
    private int acceptCount;
    
    public GradeDistribution() {
        this.scanner = new Scanner(System.in);
        this.scores = new ArrayList<Integer>();
        this.grades = new int[6];
        this.acceptCount = 0;
    }
    
    public void getScores() {
        System.out.println("Type exam scores, -1 completes:");
        while (true) {    
            int score = Integer.parseInt(scanner.nextLine());
            if (score == -1) {
                break;
            }
            if (score >= 0 && score <= 60) {
                scores.add(score);
            }
        }
    }
    
    public void formGradeDistribution() {
        for (int score : scores) {
            if (score >= 0 && score <= 29) {
                this.grades[0]++;
            } else if (score >= 30 && score <= 34) {
                this.grades[1]++;
            } else if (score >= 35 && score <= 39) {
                this.grades[2]++;
            } else if (score >= 40 && score <= 44) {
                this.grades[3]++;
            } else if (score >= 45 && score <= 49) {
                this.grades[4]++;
            } else if (score >= 50 && score <= 60) {
                this.grades[5]++;
            }
        }
        
        acceptCount = this.grades[1] + this.grades[2] + this.grades[3] + this.grades[4] + this.grades[5];
    }
    
    public void printGradeDistribution() {
        System.out.println("Grade distribution:");
        for (int grade = 5; grade >= 0; grade--) {
            System.out.print(grade + ": ");
            printStars(grades[grade]);
            System.out.println("");
        }
        System.out.println("Acceptance percentage: " + acceptancePercentage());
    }
    
    public void printStars(int count) {
        for(int i = 0; i < count; i++) {
            System.out.print("*");
        }
    }
    
    public double acceptancePercentage() {
        double acceptancePercentage = 0;
        if (scores.size() > 0) {
            acceptancePercentage = 100.0 * acceptCount / scores.size();
            return acceptancePercentage;
        }
        return acceptancePercentage;
    }
}

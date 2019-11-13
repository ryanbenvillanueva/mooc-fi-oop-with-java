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

public class Team {

    private String name;
    private ArrayList<Player> players = new ArrayList<Player>();
    private int maxSize = 16;

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void addPlayer(Player player) {
        if (players.size() < this.maxSize) {
            this.players.add(player);
        }
    }

    public void printPlayers() {
        for (Player player : players) {
            System.out.println(player);
        }
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int size() {
        return this.players.size();
    }

    public int goals() {
        int totalGoals = 0;
        for (Player player : this.players) {
            totalGoals += player.goals();
        }
        return totalGoals;
    }
}

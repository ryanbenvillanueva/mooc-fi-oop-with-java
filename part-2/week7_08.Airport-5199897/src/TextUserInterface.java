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

public class TextUserInterface {
    private Scanner reader;
    private Airport airport;
    
    public TextUserInterface(Scanner reader, Airport airport) {
        this.reader = reader;
        this.airport = airport;
    }
    
    public void showAirportPanel() {
        System.out.println("Airport panel");
        System.out.println("--------------------");
        System.out.println("");
        
        while (true) {
            System.out.println("Choose operation:");
            System.out.println("[1] Add airplane");
            System.out.println("[2] Add flight");
            System.out.println("[x] Exit");
            System.out.print("> ");
            
            String choice = reader.nextLine();
            
            if (choice.equals("1")) {
                airport.addPlane();
            } else if (choice.equals("2")) {
                airport.addFlight();
            } else if (choice.equals("x")) {
                break;
            }
        }
    }
    
    public void showFlightService() {
        System.out.println("Flight service");
        System.out.println("------------");
        System.out.println("");
        
        while (true) {
            System.out.println("Choose operation:");
            System.out.println("[1] Print planes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print plane info");
            System.out.println("[x] Quit");
            System.out.print("> ");
            
            String choice = reader.nextLine();
            
            if (choice.equals("1")) {
                airport.printPlanes();
            } else if (choice.equals("2")) {
                airport.printFlights();
            } else if (choice.equals("3")) {
                airport.printPlaneInfo();
            } else if (choice.equals("x")) {
                break;
            }
        }
    }
    
    public void start() {
        showAirportPanel();
        showFlightService();
    }
}

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
import java.util.HashMap;
import java.util.Scanner;

public class Airport {
    private ArrayList<Plane> planes;
    private HashMap<Plane, Flight> flights;
    private Scanner reader;
    
    public Airport(Scanner reader) {
        this.planes = new ArrayList<Plane>();
        this.flights = new HashMap<Plane, Flight>();
        this.reader = reader;
    }
    
     public void addPlane() {
        System.out.print("Give plane ID: ");
        String planeID = reader.nextLine();
        System.out.print("Give plane capacity: ");
        int capacity = Integer.parseInt(reader.nextLine());
        
        Plane newPlane = new Plane(planeID, capacity);
        planes.add(newPlane);
    }
    
    public void addFlight() {
        System.out.print("Give plane ID: ");
        String planeID = reader.nextLine();
        System.out.print("Give departure airport code: ");
        String departureAirportCode = reader.nextLine();
        System.out.println("Give destination airport code: ");
        String destinationAirportCode = reader.nextLine();
        
        Flight newFlight = new Flight(departureAirportCode, destinationAirportCode);
        
        for(Plane plane : planes) {
            if (plane.getPlaneID().equals(planeID)) {
                Plane newPlane = new Plane(plane.getPlaneID(), plane.getCapacity());
                flights.put(newPlane, newFlight);
                break;
            }
        }
        
    }
    
    public void printPlanes() {
        for (Plane plane : planes) {
            System.out.println(plane);
        }
    }
    
    public void printFlights() {
        for (Plane plane : flights.keySet()) {
            System.out.println(plane + " " + flights.get(plane));
        }
    }
    
    public void printPlaneInfo() {
        System.out.print("Give plane ID: ");
        String planeID = reader.nextLine();
        
        for (Plane plane : planes) {
            if (plane.getPlaneID().equals(planeID)) {
                System.out.println(plane);
            }
        }
    }
}

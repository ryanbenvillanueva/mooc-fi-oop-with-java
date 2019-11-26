/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ryan Ben
 */
public class Flight {
    private String departureAirportCode;
    private String destinationAirportCode;
    
    public Flight(String departureAirportCode, String destinationAirportCode) {
        this.departureAirportCode = departureAirportCode;
        this.destinationAirportCode = destinationAirportCode;
    }
    
    public String toString() {
        return "(" + departureAirportCode + "-" + destinationAirportCode + ")";
    }
    
}

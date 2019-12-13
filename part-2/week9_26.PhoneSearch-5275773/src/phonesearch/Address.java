package phonesearch;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ryan Ben
 */
public class Address {
    
    private String street;
    private String city;
    
    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }
    
    public String getStreet() {
        return this.street;
    }
    
    public String getCity() {
        return this.city;
    }
    
    public boolean isKeywordInAddress(String keyword) {
        if (street.contains(keyword) || city.contains(keyword)) {
            return true;
        }
        
        return false;
    }
    
    @Override
    public String toString() {
        return this.street + " " + this.city;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

/**
 *
 * @author Ryan Ben
 */
public class ProductContainer extends Container{
    
    private String productName;
    
    public ProductContainer(String productName, double capacity) {
        super(capacity);
        this.productName = productName;
    }
    
    public String getName() {
        return productName;
    }
    
    public void setName(String newName) {
        productName = newName;
    }
    
    @Override
    public String toString() {
        return getName() + ": " + super.toString();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ryan Ben
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Storehouse {

    private Map<String, Integer> productPrices;
    private Map<String, Integer> productStock;

    public Storehouse() {
        
        this.productPrices = new HashMap<String, Integer>();
        this.productStock = new HashMap<String, Integer>();
    }

    public void addProduct(String product, int price, int stock) {
        
        productPrices.put(product, price);
        productStock.put(product, stock);
    }

    public int price(String product) {
        
        if (!productPrices.containsKey(product)) {
            return -99;
        }
        
        return productPrices.get(product);
    }
    
    public int stock(String product) {
        
        if (productStock.containsKey(product) && productStock.get(product) > 0) {
            return productStock.get(product);
        }
        
        return 0;
    }
    
    public boolean take(String product) {
        
        if (productStock.containsKey(product) && stock(product) > 0) {
            productStock.put(product, productStock.get(product) - 1);
            return true;
        }
        
        return false;
    }
    
    public Set<String> products() {
        
        Set<String> productNames = productPrices.keySet();
        
        return productNames;
    }
}

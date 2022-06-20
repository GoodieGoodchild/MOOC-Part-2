

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jonat
 */
public class Warehouse {

    private Map<String, Integer> prices;
    private Map<String, Integer> stockBalanceMap;
    
    public Warehouse() {
        this.prices = new HashMap<>();
        this.stockBalanceMap = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        //public void addProduct(String product, int price, int stock), which adds a product to the warehouse with the price and stock balance given as parameters.
        prices.put(product, price);
        stockBalanceMap.put(product, stock);
    }
    
    public int price(String product) {
        // returns the price of the product it received as a parameter. 
        //If the product hasn't been added to the warehouse, the method must return -99.
        return this.prices.getOrDefault(product, -99);
    }

    public int stock(String product) {
        return stockBalanceMap.getOrDefault(product, 0);
    }
    
    public boolean take(String product) {
        if (this.stock(product)>0) {
            stockBalanceMap.put(product, stockBalanceMap.get(product) - 1);
            return true;
        }
        return false;
    }
    
    public Set<String> products() {
        Set<String> productSet = new HashSet<>();
        for (String key : prices.keySet()) {
            productSet.add(key);
        }
        return productSet;
    }
    
}


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jonat
 */
public class ShoppingCart {

    private Map<String, Item> shoppingCart;
    
    public ShoppingCart() {
        this.shoppingCart = new HashMap<>();
    }
    
    public void add(String product, int price) {
        if (!shoppingCart.containsKey(product)) {
            this.shoppingCart.put(product, new Item(product,1,price));
        } else {
            shoppingCart.get(product).increaseQuantity();
        }
    }
    
    public int price() {
        int totalPrice = 0;
        for (String i : shoppingCart.keySet()) {
            totalPrice = totalPrice + shoppingCart.get(i).price();
        }
        return totalPrice;
    }
    
    public void print() {
        for (String i : shoppingCart.keySet()) {
            System.out.println(shoppingCart.get(i).toString());
        }
    }
    
}

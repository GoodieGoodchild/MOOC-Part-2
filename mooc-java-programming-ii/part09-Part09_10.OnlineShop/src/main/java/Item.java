/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jonat
 */
public class Item {

    private String productKey;
    private int qty;
    private int unitPrice;
    
    public Item(String productKey, int qty, int unitPrice) {
        this.productKey = productKey;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public int price() {
        return this.qty * this.unitPrice;
    }

    public void increaseQuantity() {
        this.qty = this.qty +  1;
    }
    
    public String toString() {
        return this.productKey + ": " + this.qty;
    }
    
}

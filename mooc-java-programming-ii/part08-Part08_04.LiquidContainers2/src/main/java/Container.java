/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jonat
 */
public class Container {
    
    private int amount;
    
    
    public Container() {
        
        this.amount = 0;
    }
    
    public int contains() {
        return this.amount;
    }
    
    public void setAmount(int amount) {
        this.amount = amount;
    }
    
    public void add(int amountToAdd) {
        if (amountToAdd <= 0) {
            //nothing to add.
        } else if (this.amount + amountToAdd < 100) {
            this.amount = this.amount + amountToAdd;
        } else {
            this.amount = 100;
        }
    }
    
    public void remove(int amountToRemove) {
        if (amount - amountToRemove <= 0) {
            this.amount = 0;
        } else {
            amount = amount - amountToRemove;
        }
    }
    
    public void move() {
    
    
          
    }
    
    @Override
    public String toString() {
        return "" + this.amount + "/100";
    }
    
}

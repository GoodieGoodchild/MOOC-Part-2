/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jonat
 */
public class ProductWarehouseWithHistory extends ProductWarehouse  {
    //creates a product warehouse. The product name, capacity, and initial balance are provided as parameters. 
    //Set the initial balance as the initial balance of the warehouse, as well as the first value of the change history.
    private ChangeHistory ch = new ChangeHistory();
    
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        super.addToWarehouse(initialBalance);
        ch.add(initialBalance);
    }
    
    public String history() {
        return ch.toString();
    }
    
    public void addToWarehouse(double amount) {
        //works just like the method in the Warehouse class, but we also record the changed state to the history. 
        //NB: the value recorded in the history should be the warehouse's balance after adding, not the amount add
        double changed = super.getBalance() + amount;
        super.addToWarehouse(amount);
        ch.add(changed);
    }
    
    public double takeFromWarehouse(double amount){

        double result = (double) super.getBalance() - amount;
        //the difference is added not just the amount
        ch.add(result);
        
        return super.takeFromWarehouse(amount);
    }
    
    public void printAnalysis() {
        System.out.println("Product: " + super.toString() + 
                "\nHistory: " + ch.toString() + 
                "\nLargest amount of product: " + ch.maxValue() + 
                "\nSmallest amount of product: " + ch.minValue() + 
                "\nAverage: " + ch.average());
    }
    
}

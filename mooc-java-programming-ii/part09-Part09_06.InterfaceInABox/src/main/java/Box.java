
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jonat
 */
public class Box implements Packable{

    private ArrayList<Packable> items;
    private double maxCapacity;
        
    public Box(double maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.items = new ArrayList<>();
    }
    
    public void add(Packable itemPacked) {
        if (this.weight() + itemPacked.weight() <= maxCapacity) {
            items.add(itemPacked);
        }
        //check if the item is does not make box exceed maximum capacity when it is  added
    }
    
    @Override
    public double weight() {
        double sum = 0;
        for (Packable p : items) {
            sum += p.weight();
        }
        return (double)sum;
    }
    
    @Override
    public String toString() {
        return "Box: " + items.size() + " items, total weight " + this.weight() + " kg";
    }
    
}

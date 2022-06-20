
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
public class BoxWithMaxWeight extends Box{
    
    private int capacity;
    private ArrayList<Item> itemsInBox;
    
    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.itemsInBox = new ArrayList<>();
    }
    
    public int currentAmount() {
        int sum = 0;
        
        for (Item item : itemsInBox) {
            sum += item.getWeight();
        }
        return sum;
    }

    @Override
    public void add(Item item) {
        if (currentAmount() + item.getWeight() <= this.capacity) {
            itemsInBox.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return itemsInBox.contains(item);
    }
}

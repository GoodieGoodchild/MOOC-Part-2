
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
public class Herd implements Movable {

    private ArrayList<Movable> herd;
    
    public Herd() {
        this.herd = new ArrayList<>();
    }
    
   @Override
    public String toString() {
        String newString = "";
        for (Movable mov : herd) {
            newString += mov.toString().trim() + "\n";
        }
        return newString;
    }
    
    public void addToHerd(Movable moveable) {
        herd.add(moveable);
    }
    
    @Override
    public void move(int dx, int dy) {
        for (Movable m : herd) {
            m.move(dx, dy);
        }
    }
}

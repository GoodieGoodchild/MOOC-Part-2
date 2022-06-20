
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
public class TodoList {
    
    private ArrayList<String> list = new ArrayList<>();
    
    public TodoList() {
        
        this.list = new ArrayList<>();
        
    }
    
    public void add(String task) {
        this.list.add(task);
    }
    
    public void print() {
        
        for (int i = 0; i < list.size(); i++) {
            int number = i + 1;
            System.out.println(number + ": " + list.get(i));
        }
    } 

    public void remove(int number) {
        int num = number - 1;
        this.list.remove(num);
        
    }
    
}

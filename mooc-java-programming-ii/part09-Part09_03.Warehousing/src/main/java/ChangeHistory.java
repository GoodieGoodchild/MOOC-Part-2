
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
public class ChangeHistory {
    
    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }
    
    public void add(double status) {
        history.add(status);
    }
    
    public void clear() {
        history.clear();
    }
    
    public double maxValue() {
        double maxValue = 0;
        if (!history.isEmpty()) {
            for (Double value : history) {
                if (value > maxValue) {
                    maxValue = value;
                }
            }
        }
        return maxValue;
    }
    
    public double minValue() {
        double minValue = 99.0;
        if (!history.isEmpty()) {
            for (Double value : history) {
                    if (value < minValue) {
                        minValue = value;
                    }
                }
            }
        return minValue;
    }
    
    public double average() {
        double total = 0;
        int count = 0;
        if (!history.isEmpty()){
            for (int i = 0; i < history.size(); i++) {
                total = total + history.get(i);
                count++;
            }
            return total / count*1.0;
        }
        return 0;
    }

    public String toString() {
        return history.toString();
    }
}

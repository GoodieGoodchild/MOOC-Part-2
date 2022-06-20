
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
 
        Container first = new Container();
        Container second = new Container();
 
        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);
 
            String input = scan.nextLine();
 
            if (input.equals("quit")) {
                break;
            }
 
            String[] parts = input.split(" ");
            String command = parts[0];
            int value = Integer.valueOf(parts[1]);
 
            if (value <= 0) {
                continue;
            }
 
            if (command.equals("add")) {
                first.add(value);
            }
            if (command.equals("move")) {
                if (first.contains() <= 0) {
               // do nothing
           } else if (first.contains() - value > 0 && first.contains() + second.contains() < 100) {
               int dif = value - first.contains();
               first.remove(value);
               second.add(value);
           } else if (first.contains() - value < 0) { // && first.contains() + second.contains() > 100
               int dif = value - first.contains();
               second.setAmount(first.contains());
               first.setAmount(0);
           } else if (first.contains() >= value && second.contains() + value <= 100) {
               first.add(value);
               second.add(value);
           } else if (first.contains() >= value && second.contains() + value > 100) {
               int difference = 100 - second.contains();
               first.remove(difference);
               second.add(difference);
           }  
        }
            
            if (command.contains("remove")) {
                if (second.contains() == 0) {
                    //do nothing
                } else if (second.contains() - value <= 0) {
                    second.setAmount(0);
                } else if (second.contains() - value >= 0) {
                    second.remove(value);
                }
            }
 
        }
    }

}

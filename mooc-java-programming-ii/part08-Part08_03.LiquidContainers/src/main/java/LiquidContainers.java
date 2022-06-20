import java.util.Scanner;
 
public class LiquidContainers {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
 
        int firstContainer = 0;
        int secondContainer = 0;
 
        while (true) {
            System.out.println("First: " + firstContainer + "/100");
            System.out.println("Second: " + secondContainer + "/100");
 
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
                if (firstContainer + value > 100) {
                    firstContainer = 100;
                } else {
                    firstContainer += value;
                }
            }
 
            if (command.equals("move")) {
                if (firstContainer <= 0) {
                    // do nothing
                } else if (firstContainer - value <= 0 && firstContainer + secondContainer <= 100) {
                    int first = firstContainer;
                    firstContainer = 0;
                    secondContainer += first;
                } else if (firstContainer - value <= 0 && firstContainer + secondContainer > 100) {
                    firstContainer = 0;
                    secondContainer = 100;                    
                } else if (firstContainer >= value && secondContainer + value <= 100) {
                    firstContainer -= value;
                    secondContainer += value;
                } else if (firstContainer >= value && secondContainer + value > 100) {
                    int difference = 100 - secondContainer;
                    firstContainer -= difference;
                    secondContainer += difference;
                } 
            }
            
            if (command.contains("remove")) {
                if (secondContainer == 0) {
                    //do nothing
                } else if (secondContainer - value <= 0) {
                    secondContainer = 0;
                } else if (secondContainer - value >= 0) {
                    secondContainer -= value;
                }
            }
 
        }
    }
 
}
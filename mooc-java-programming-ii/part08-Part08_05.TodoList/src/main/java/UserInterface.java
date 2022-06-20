
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jonat
 */
public class UserInterface {

    private TodoList list;
    private Scanner scanner;
    
    public UserInterface(TodoList list, Scanner scanner) {
        
        this.list = list;
        this.scanner = scanner;
        
    }
    
    public void start() {
        
        while (true) {

            System.out.println("Command:");
            String command = scanner.nextLine();
            
            if (command.equals("stop")) {
                break;
            }

            executeCommands(command);
            
        }
        
    }
    
    public void executeCommands(String command) {
        
        if (command.equals("add")) {
                System.out.println("To add:");
                String task = scanner.nextLine();
                this.list.add(task);
            }
            
            if (command.equals("remove")) {
                System.out.println("Which one is removed?");
                int index = Integer.valueOf(scanner.nextLine());
                this.list.remove(index);
            }
            
            if (command.equals("list")) {
                this.list.print();
            }
        
    }
}

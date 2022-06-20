
import java.util.HashMap;

public class Program {
    
    public static void printValues(HashMap<String, Book> hashmap) {
        for (String i : hashmap.keySet()) {
            System.out.println("Name: " + hashmap.get(i).getName() + " (" + hashmap.get(i).getPublicationYear() + ")");
            System.out.println("Contents: " + hashmap.get(i).getContents());
            
        }
    }
    
    public static void printValueIfNameContains(HashMap<String, Book> hashmap, String text) {
        //which prints only the Books in the given hashmap which name contains the given string. You can find out the name of a Book with the method getName.\
        for (String i : hashmap.keySet()) {
            if (hashmap.get(i).getName().contains(text)) {
                System.out.println("Name: " + hashmap.get(i).getName() + " (" + hashmap.get(i).getPublicationYear() + ")");
                System.out.println("Contents: " + hashmap.get(i).getContents());
            }
        }
        
    }

    public static void main(String[] args) {
        // Test your program here!
        
        HashMap<String, Book> hashmap = new HashMap<>();
        hashmap.put("sense", new Book("Sense and Sensibility", 1811, "..."));
        hashmap.put("prejudice", new Book("Pride and prejudice", 1813, "...."));

        printValues(hashmap);
        System.out.println("---");
        printValueIfNameContains(hashmap, "prejud");
        
    }
    
}

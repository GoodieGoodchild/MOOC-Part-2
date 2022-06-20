
import java.util.HashMap;
import java.util.Map;



public class MainProgram {

    public static void main(String[] args) {
        // test your method here
        Map<String, String> maps = new HashMap<>();
        maps.put("ganbatte", "good luck");
        maps.put("hai", "yes");

        for (String key : maps.keySet()) {
            System.out.println(key + ": " + maps.get(key));
        }
    }

    // Implement here a method returnSize, which takes a Map-object as a parameter 
    // and returns the size of the map object
    public static int returnSize(Map<String,String> maps) {
        return maps.size();
    }
    
}

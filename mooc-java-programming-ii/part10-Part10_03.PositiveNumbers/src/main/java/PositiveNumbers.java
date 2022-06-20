
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {
    
    List<Integer> posInts;
    
    public static List<Integer> positive(List<Integer> numbers) {
        // implement the class method public static List<Integer> positive(List<Integer> numbers)
        // which receives an ArrayList of integers, and returns the positive integers from the list.
        List<Integer> posInts = numbers.stream()
                .filter(s -> s > 0)
                .map(s -> s)
                .collect(Collectors.toCollection(ArrayList::new));
        return posInts;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here

    }

}

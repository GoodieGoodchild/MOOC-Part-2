
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        System.out.println("Input numbers, type \"end\" to stop.");
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            numbers.add(Integer.valueOf(input));
        }
        
        double positiveAverage = numbers.stream()
                .mapToDouble(s -> Double.valueOf(s))
                .filter(s -> s > 0)
                .average()
                .getAsDouble();
        
        double negativeAverage = numbers.stream()
                .mapToDouble(s -> Double.valueOf(s))
                .filter(s -> s < 0)
                .average()
                .getAsDouble();
        
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String inputTwo = scanner.nextLine();
        
        if (inputTwo.endsWith("n")) {
            System.out.println(negativeAverage);
        } else {
            System.out.println(positiveAverage);
        }
        
    }
}

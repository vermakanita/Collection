import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        // Create a HashSet of integers
        HashSet<Integer> numbers = new HashSet<>();

        // Add 5 numbers to the HashSet
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Number to check
        int checkNumber = 30;

        // Check if the number exists in the HashSet
        if (numbers.contains(checkNumber)) {
            System.out.println(checkNumber + " is found in the HashSet.");
        } else {
            System.out.println(checkNumber + " is not found in the HashSet.");
        }
    }
}

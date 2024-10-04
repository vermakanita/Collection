import java.util.ArrayList;
import java.util.HashSet;

public class HashSetToArrayList {
    public static void main(String[] args) {
        // Create a HashSet to store names
        HashSet<String> names = new HashSet<>();

        // Add 5 names to the HashSet
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");
        names.add("Eve");

        // Convert the HashSet to an ArrayList
        ArrayList<String> namesList = new ArrayList<>(names);

        // Print the resulting ArrayList
        System.out.println(namesList);
    }
}
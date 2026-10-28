import java.util.ArrayList;

public class Asn5 {

    public static void main(String[] args) {

        // Create two ArrayLists
        ArrayList<String> fruits = new ArrayList<String>();
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        // Add four items to each list
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grape");

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        // Display the String ArrayList
        System.out.println("Fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Display the Integer ArrayList
        System.out.println("\nNumbers:");
        for (Integer number : numbers) {
            System.out.println(number);
        }

        // Additional ArrayList operation #1
        System.out.println("\nContains Banana? "
                + fruits.contains("Banana"));

        // Additional ArrayList operation #2
        fruits.remove("Banana");
        numbers.remove(Integer.valueOf(20));

        // Display lists again after modifications
        System.out.println("\nUpdated Fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("\nUpdated Numbers:");
        for (Integer number : numbers) {
            System.out.println(number);
        }

        // Display sizes of the lists
        System.out.println("\nFruit list size: " + fruits.size());
        System.out.println("Number list size: " + numbers.size());
    }
}
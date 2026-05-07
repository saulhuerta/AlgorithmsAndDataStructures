import java.util.HashSet;

class ExampleHashSet {
    public static void main(String args[]) {
        // Instantiate a HashSet
        HashSet<String> set = new HashSet<String>();

        // Add elements to HashSet
        set.add("David");
        set.add("Alice");
        set.add("Bob");
        set.add("Alice");

        System.out.println(set); // prints [Bob, Alice, David]
        System.out.println(set.size()); // prints 3
    }
}
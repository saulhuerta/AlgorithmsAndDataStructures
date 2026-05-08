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

        // ************************************************
        // Performance test for HashSet
        // The time to add, find, and remove all elements from the HashSet remains
        // constant, regardless of the size of the HashSet. This showcases the
        // efficiency of HashSet operations.

        HashSet<String> numbersSet = new HashSet<String>();

        // Add elements to HashSet
        for (int i = 0; i < 1000; i++) {
            numbersSet.add("element_" + i);
        }

        // Find elements in HashSet
        for (int i = 0; i < 1000; i++) {
            numbersSet.contains("element_" + i);
        }

        // Remove elements from HashSet
        for (int i = 0; i < 1000; i++) {
            numbersSet.remove("element_" + i);
        }

    }
}
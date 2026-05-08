import java.util.ArrayList;
import java.util.Arrays;
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

        example1(); // Anagram Matcher
        example2(); // Find First Duplicate ID

    }

    // ================ Exercice 1 - Anagram Matcher ================
    static void example1() {
        String[] array1 = { "listen", "silent", "enlist", "inlets", "google" };
        String[] array2 = { "silent", "enlist", "inlets", "google", "glooge" };

        HashSet<String> sortedWordsInArray2 = new HashSet<>();
        for (String word : array2) {
            sortedWordsInArray2.add(sortCharacters(word));
        }

        HashSet<String> anagramsMatched = new HashSet<>();
        ArrayList<String> result = new ArrayList<>();
        for (String word : array1) {
            if (sortedWordsInArray2.contains(sortCharacters(word))) {
                if (!anagramsMatched.contains(word)) {
                    result.add(word);
                    anagramsMatched.add(word);
                }
            }
        }

        System.out.println(result); // prints [listen, silent, enlist, inlets]
    }

    private static String sortCharacters(String input) {
        char[] chars = input.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    // ==============================================================

    // ================ Exercice 1 - Anagram Matcher ================
    static void example2() {
        String[] ids1 = { "X123", "A456", "X123", "B789", "A456", "C111" };
        String[] ids2 = { "Z999", "Y888", "Z999", "Y888" };
        String[] ids3 = { "E100", "B200", "C300", "E100", "D400", "C300" };

        System.out.println(findFirstDuplicateID(ids1)); // Expected "X123"
        System.out.println(findFirstDuplicateID(ids2)); // Expected "Z999"
        System.out.println(findFirstDuplicateID(ids3)); // Expected "E100"
    }

    public static String findFirstDuplicateID(String[] ids) {
        HashSet<String> idSet = new HashSet<>();
        for (String id : ids) {
            if (!idSet.contains(id)) {
                idSet.add(id);
            } else {
                return id;
            }
        }

        // Return an empty string if no duplicate ids are found
        return "";
    }
    // ==============================================================
}
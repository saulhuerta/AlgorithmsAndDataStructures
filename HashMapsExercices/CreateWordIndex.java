package HashMapsExercices;

import java.util.HashMap;

public class CreateWordIndex {
    public static HashMap<String, Integer> createWordIndex(String sentence) {
        HashMap<String, Integer> index = new HashMap<>();

        String[] words = sentence.split("\\s+");
        // implement this
        for (String word : words) {
            if (!word.isEmpty()) {
                index.put(word.toLowerCase(), index.getOrDefault(word.toLowerCase(), 0) + 1);
            }
        }

        return index;
    }

    public static void main(String[] args) {
        String sentence1 = "Hello Hello world world world";
        HashMap<String, Integer> index1 = createWordIndex(sentence1);
        index1.forEach((k, v) -> System.out.println("(" + k + " -> " + v + ")")); // Should print: (hello -> 2), (world
                                                                                  // -> 3)
        System.out.println("----");

        String sentence2 = "";
        HashMap<String, Integer> index2 = createWordIndex(sentence2);
        index2.forEach((k, v) -> System.out.println("(" + k + " -> " + v + ")")); // Should print nothing as the
                                                                                  // sentence is empty.
        System.out.println("----");

        String sentence3 = "Quick Quick brown fox jumps over the lazy dog";
        HashMap<String, Integer> index3 = createWordIndex(sentence3);
        index3.forEach((k, v) -> System.out.println("(" + k + " -> " + v + ")"));
        // Should print: (over -> 1), (the -> 1), (quick -> 2), (lazy -> 1), (jumps ->
        // 1), (brown -> 1), (dog -> 1), (fox -> 1)
        System.out.println("----");
    }
}

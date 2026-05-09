package HashMapsExercices;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MajorityElementFinderd {

    public static void main(String[] args) {
        String[] docs = {
                "the cat in the hat",
                "the cat sat on the mat",
                "the dog sat on the log"
        };

        HashMap<String, List<Integer>> index = metodo(docs);
        System.out.println(index);
    }

    static HashMap<String, List<Integer>> metodo(String[] docs) {
        HashMap<String, List<Integer>> index = new HashMap<>();

        for (int i = 0; i < docs.length; i++) {
            String[] words = docs[i].split(" ");
            for (String word : words) {
                if (!word.isEmpty()) {
                    List<Integer> docIndices = index.getOrDefault(word, new ArrayList<>());
                    docIndices.add(i);
                    index.put(word, docIndices);
                }
            }
        }

        return index;
    }

}

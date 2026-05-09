package HashMapsExercices;

import java.util.HashMap;

public class CountWords {
    public static void main(String[] args) {
        String text = "Cosmo,is,an,incredible,technical,companion,with,very,strong,skills,in,Algorithms,and,Data,Structures,and,a,great,teacher,for,technical,interviews.";
        // TODO: initialize the counter hashmap
        String[] words = text.split(",");

        // TODO: count words
        HashMap<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println(wordCount);
    }
}

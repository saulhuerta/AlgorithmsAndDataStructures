package HashMapsExercices;

import java.util.HashMap;

public class FrequentVisitor {
    public static void main(String[] args) {
        FrequentVisitor solution = new FrequentVisitor();

        int[] visits1 = { 1, 2, 3, 1, 2, 3, 1, 2, 3, 1 };
        int frequentUser1 = solution.frequentUser(visits1);
        System.out.println("Frequent User: " + frequentUser1); // Expected output: 1

        int[] visits2 = { 5, 0, 5, 0, 5, 0, 5, 0, 1, 1, 1, 1, 1 };
        int frequentUser2 = solution.frequentUser(visits2);
        System.out.println("Frequent User: " + frequentUser2); // Expected output: 5

        int[] visits3 = { 3, 2, 2, 1, 3, 2, 3, 0, 0, 1, 4, 1 };
        int frequentUser3 = solution.frequentUser(visits3);
        System.out.println("Frequent User: " + frequentUser3); // Expected output: -1
    }

    public int frequentUser(int[] visits) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        int frequentVisitThreshold = visits.length / 4;

        for (int visit : visits) {
            countMap.put(visit, countMap.getOrDefault(visit, 0) + 1);
        }

        System.out.println("==================");
        System.out.println("Count: " + countMap + " Frequent Visit Threshold: " + frequentVisitThreshold);

        int maxVal = 0;
        int maxId = -1;
        for (Integer key : countMap.keySet()) {
            if (key != 0 && countMap.get(key) > frequentVisitThreshold && countMap.get(key) > maxVal) {
                maxId = key;
                maxVal = countMap.get(key);
            }
        }

        System.out.println("==================");
        // implement this
        return maxId;
    }
}

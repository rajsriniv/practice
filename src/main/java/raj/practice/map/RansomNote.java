package raj.practice.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RansomNote {

    /**
     * routine to determine if a note can be prepared by cutting out words from magazine
     * @param magazine - list of words in the magazine
     * @param note - list of words in the note
     */
    public static void checkMagazine(List<String> magazine, List<String> note) {

        Map<String, Integer> wordCountMap = new HashMap<>();
        for (String word: magazine) {
            if (wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                wordCountMap.put(word, 1);
            }
        }
        for (String word : note) {
            if (!wordCountMap.containsKey(word) || wordCountMap.get(word) == 0) {
                System.out.println("No");
                return;
            } else {
                wordCountMap.put(word, wordCountMap.get(word) - 1);
            }
        }
        System.out.println("Yes");

    }

    public static void main(String[] args) {
        checkMagazine(Arrays.asList("Two", "three", "times", "is", "not", "four", "two"), Arrays.asList("two", "times", "two", "is", "four"));
    }
}

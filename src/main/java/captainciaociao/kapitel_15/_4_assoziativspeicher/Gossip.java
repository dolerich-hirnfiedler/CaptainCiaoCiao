package captainciaociao.kapitel_15._4_assoziativspeicher;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.function.ToIntFunction;

public class Gossip {

    public static final int LIMIT = 5;

    public static List<String> importantGossip(String... words) {
        List<String> results = new ArrayList<>(LIMIT);
        Map<String, Integer> wordOccurrences = new HashMap<>(words.length);
        for (String word : words) {
            wordOccurrences.merge(word, 1, Integer::sum);
        }
        Comparator<Map.Entry<String, Integer>> compareByWordOccurence = Comparator
                .comparingInt((ToIntFunction<Map.Entry<String, Integer>>) Map.Entry::getValue)
                .reversed().thenComparing(Map.Entry::getKey);
        SortedSet<Map.Entry<String, Integer>> sortedSet = new TreeSet<>(compareByWordOccurence);
        sortedSet.addAll(wordOccurrences.entrySet());
        for (Entry<String, Integer> element : sortedSet) {
            results.add(element.getKey());
            if (results.size() >= LIMIT) {
                break;
            }
        }

        return results;
    }


    public static void main(String[] args) {
        String[] words = {"Baby Shark", "Corona", "Baby Yoda", "Corona", "Tiger King", "Baby Yoda",
                "David Bowie", "Corona", "Kylie Jenner", "Kardashian", "Love Island",
                "Bachelorette", "Billie Eilish", "Corona"};

        System.out.println(importantGossip(words).toString());
    }
}

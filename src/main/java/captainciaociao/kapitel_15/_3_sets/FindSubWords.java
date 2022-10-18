package captainciaociao.kapitel_15._3_sets;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import java.util.Collection;
import java.util.HashSet;
import java.util.Scanner;

public class FindSubWords {
    private static final String WORD_LIST_URL_GERMAN = "https://raw.githubusercontent.com/creativecouple/all-the-german-words/master/corpus/de.txt";
    private static final String WORD_LIST_URL_ENGLISH = "https://raw.githubusercontent.com/dwyl/english-words/master/words_alpha.txt";

    public static Collection<String> readWords() throws IOException {
        URL url = new URL(WORD_LIST_URL_ENGLISH);
        Collection<String> words = new HashSet<>(500_000);
        try (InputStream is = url.openStream();
                Scanner sc = new Scanner(is)) {
            sc.forEachRemaining(s -> words.add(s.toLowerCase()));
            sc.close();
        }
        return words;
    }

    public static Collection<String> wordList(String string, Collection<String> words) {
        int n = string.length() - 1;
        Collection<String> possibleSubwords = new HashSet<>(n * (n + 1) / 2);
        for (int i = 0; i < n; i++) {
            for (int j = i + 2; j < n + 1; j++) {
                possibleSubwords.add(string.substring(i, j));
            }
        }
        possibleSubwords.retainAll(words);

        return possibleSubwords;
    }

    public static void main(String[] args) {
        try {
            System.out.printf("%s%n", wordList("bibliophobia", readWords()).toString());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}

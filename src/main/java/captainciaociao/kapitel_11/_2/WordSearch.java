package captainciaociao.kapitel_11._2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordSearch {
    public static void main(String[] args) {
        int occurences = 0;
        String exampleString = new String(
                "Make me a baby #CaptainCiaoCiao\n" + "Hey @CaptainCiaoCiao, where is the recruitment test+\n"
                        + "What is a hacker's favorite pop song? The Black IP's\n");
        Pattern pattern = Pattern.compile("[@#]CaptainCiaoCiao");
        Matcher matcher = pattern.matcher(exampleString);

        while (matcher.find()) {
            occurences++;
        }
        System.out.printf("%d%n", occurences);

    }
}

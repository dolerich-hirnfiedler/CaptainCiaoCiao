package captainciaociao.kapitel_11._2;

public class SilentShoutingWords {
    public static String silentShoutingWords(String input) {
        String[] words = input.strip().split(" +");
        String returnValue = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 2) {
                if (words[i].matches("[A-Z]+?\\p{Punct}")) {
                    returnValue += words[i].toLowerCase() + " ";
                } else {
                    returnValue += words[i] + " ";
                }
            } else {
                returnValue += words[i] + " ";
            }
        }
        return returnValue;
    }

    public static void main(String[] args) {
        String example = "AY Captain! Smutje MUSS WEG!";
        System.out.println(example);
        System.out.printf("%s%n", silentShoutingWords(example));

    }
}

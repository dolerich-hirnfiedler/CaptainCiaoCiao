package captainciaociao.kapitel_11._3;

public class SwitchWords {
    public static String switchWords(String input) {
        String[] words = input.split(" |,|.|;|\\!|\\?");
        for (int i = 0; i < words.length; i++) {
            words[i] = WordSwitcher.revertWord(words[i]);
        }
        String output = "";
        for (int j = 0; j < words.length; j++) {
            output += words[j] + " ";
        }
        return output;
    }

    public static void main(String[] args) {
        String sentence = "erehW did eht etarip esahcrup sih kooh? tA eht dnah-dnoces pohs!";
        System.out.printf("%s%n", switchWords(sentence));
        System.out.printf("%s%n", "Hey you");


    }

    public class WordSwitcher {
        public static String revertWord(String input) {
            StringBuilder inputBuilder = new StringBuilder(input);
            return inputBuilder.reverse().toString();
        }
    }
}

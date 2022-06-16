package captainciaociao.kapitel_5._2_dynamische_strings.aufgabe_9;

public class Ceasar {
    public static String caesar(String s, int rotation) {
        char[] array = s.toCharArray();
        String returnValue = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.substring(i, i + 1).matches("[A-Z]")) {
                array[i] = (char) ((((array[i] - 'A') + rotation) % 26) + 'A');
            } else if (s.substring(i, i + 1).matches("[a-z]")) {
                array[i] = (char) ((((array[i] - 'a') + rotation) % 26) + 'a');
            }
        }
        for (char c : array) {
            returnValue += c;
        }
        return returnValue;
    }

    public static String decaesar(String s, int rotation) {
        char[] array = s.toCharArray();
        String returnValue = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.substring(i, i + 1).matches("[A-Z]")) {
                array[i] = (((array[i] - 'A') - rotation) < 0) ? (char) (((array[i] - 'A' - rotation) % 26) + 'A' + 26)
                        : (char) (((array[i] - 'A' - rotation) % 26) + 'A');
            } else if (s.substring(i, i + 1).matches("[a-z]")) {
                array[i] = (((array[i] - 'a') - rotation) < 0) ? (char) ((array[i] - 'a' - rotation) % 26 + 'a' + 26)
                        : (char) (((array[i] - 'a' - rotation) % 26) + 'a');
            }
        }
        for (char c : array) {
            returnValue += c;
        }

        return returnValue;
    }

    public static void main(String[] args) {
        String string = "abxyz. ABXYZ!";
        String encoded = caesar(string, 13);
        String decoded = decaesar(encoded, 13);
        System.out.printf("%s => %s%n %s => %s%n", string, encoded, encoded, decoded);

    }
}

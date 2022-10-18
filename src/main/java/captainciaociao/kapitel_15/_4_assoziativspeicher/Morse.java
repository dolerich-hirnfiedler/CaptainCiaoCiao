package captainciaociao.kapitel_15._4_assoziativspeicher;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.StringJoiner;

public class Morse {
    // A .-
    // B -...
    // C -.-.
    // D-..
    // E .
    // F ..-.
    // G --.
    // H ....
    // I ..
    // J .---
    // K -.-
    // L .-..
    // M --
    // N -.
    // O ---
    // P .--.
    // Q --.-
    // R .-.
    // S ...
    // T -
    // U ..-
    // V ...-
    // W .--
    // X -..-
    // Y -.--
    // Z --..
    // 0 -----
    // 1 .----
    // 2 ..---
    // 3 ...--
    // 4 ....-
    // 5 .....
    // 6 -....
    // 7 --...
    // 8 ---..
    // 9 ----.

    private Map<Character, String> charToMorse = new HashMap<>();
    private Map<String, Character> morseToChar = new HashMap<>();

    public Morse() {
        charToMorse.put('A', ".-");
        charToMorse.put('B', "-...");
        charToMorse.put('C', "-.-.");
        charToMorse.put('D', "..");
        charToMorse.put('E', ".");
        charToMorse.put('F', "..-.");
        charToMorse.put('G', "--.");
        charToMorse.put('H', "....");
        charToMorse.put('I', "..");
        charToMorse.put('J', ".---");
        charToMorse.put('K', "-.-");
        charToMorse.put('L', ".-..");
        charToMorse.put('M', "--");
        charToMorse.put('N', "-.");
        charToMorse.put('O', "---");
        charToMorse.put('P', ".--.");
        charToMorse.put('Q', "--.-");
        charToMorse.put('R', ".-.");
        charToMorse.put('S', "...");
        charToMorse.put('T', "-");
        charToMorse.put('U', "..-");
        charToMorse.put('V', "...-");
        charToMorse.put('W', ".--");
        charToMorse.put('X', "-..-");
        charToMorse.put('Y', "-.--");
        charToMorse.put('Z', "--..");
        charToMorse.put('0', "-----");
        charToMorse.put('1', ".----");
        charToMorse.put('2', "..---");
        charToMorse.put('3', "...--");
        charToMorse.put('4', "....-");
        charToMorse.put('5', ".....");
        charToMorse.put('6', "-....");
        charToMorse.put('7', "--...");
        charToMorse.put('8', "---..");
        charToMorse.put('9', "----.");
        charToMorse.forEach((character, string) -> morseToChar.put(string, character));

    }

    public String encode(String string) {
        StringJoiner result = new StringJoiner(" ");
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (c == ' ') {
                result.add("");
            } else {
                String maybeMorse = charToMorse.get(Character.toUpperCase(c));
                if (maybeMorse != null) {
                    result.add(maybeMorse);
                }
            }
        }
        return result.toString();
    }

    public String decode(String string) {
        StringBuilder result = new StringBuilder(string.length() / 4);
        for (String word : string.split(" {2}")) {
            for (Scanner scanner = new Scanner(word); scanner.hasNext();) {
                Optional.of(scanner.next()).map(morseToChar::get).ifPresent(result::append);
                scanner.close();
                result.append(' ');
            }
        }
        return result.toString();
    }

}

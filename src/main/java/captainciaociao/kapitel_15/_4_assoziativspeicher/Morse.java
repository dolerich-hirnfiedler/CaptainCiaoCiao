package captainciaociao.kapitel_15._4_assoziativspeicher;

import java.util.Map;
import java.util.TreeMap;

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

    private Map<Character, String> charToMorse = new TreeMap<>();
    private Map<String, Character> morseToChar = new TreeMap<>();

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

}

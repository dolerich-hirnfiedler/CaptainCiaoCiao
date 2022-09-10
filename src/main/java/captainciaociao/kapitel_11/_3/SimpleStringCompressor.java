package captainciaociao.kapitel_11._3;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimpleStringCompressor {
  public static String advancedCompress(String input) {
    String output = "";
    Pattern numbers = Pattern.compile("[0-9]");
    Matcher numberMatcher = numbers.matcher(input);
    int counter = 1;
    if (!numberMatcher.find()) {
      // System.out.printf("%d%n", input.length());
      for (int i = 1; i < input.length(); i++) {
        if (input.charAt(i) == input.charAt(i - 1)) {
          counter++;
        } else {
          if (counter != 1) {
            output += input.substring(i - 1, i);
            output += counter;
          } else {
            output += input.substring(i - 1, i);
          }
          counter = 1;
        }
      }
      output += input.substring(input.length() - 1, input.length());
    } else {

      return output;
    }

    return output;
  }

  public static String compress(String input) {
    String output = "";
    boolean isDotFirst = input.charAt(0) == '.';

    String[] dots = input.split("-+");
    ArrayList<String> dotsCleaned = new ArrayList<>();
    for (int i = 0; i < dots.length; i++) {
      if (!dots[i].matches("")) {
        dotsCleaned.add(dots[i]);
      }
    }
    String[] lines = input.split("\\.+");
    ArrayList<String> linesCleaned = new ArrayList<>();
    for (int i = 0; i < lines.length; i++) {
      if (!lines[i].matches("")) {
        linesCleaned.add(lines[i]);
      }
    }

    for (int i = 0; i < dotsCleaned.size() + linesCleaned.size(); i++) {
      if (isDotFirst) {
        if (i % 2 == 0) {
          output += String.format("%d.", dotsCleaned.get((int) i / 2).length());
        } else {
          output += String.format("%d-", linesCleaned.get((int) i / 2).length());
        }
      } else {
        if (i % 2 == 0) {
          output += String.format("%d-", linesCleaned.get((int) i / 2).length());
        } else {
          output += String.format("%d.", dotsCleaned.get((int) i / 2).length());
        }
      }
    }

    return output;
  }

  public static String decompress(String input) {
    String output = "";

    Pattern numbers = Pattern.compile("[0-9]");
    Matcher numberMatcher = numbers.matcher(input);

    return output;
  }

  public static void main(String[] args) {
    String test = "--....--------..--";
    String secodTest = "sakjdfhassdsssswoehegkjaökssssssdfddffffffeeeeewpwwwwwj";
    String thirdTest = "9sakjdfhassdsssswoehegkjaökssssssdfddffffffeeeeewpwwwwwj";
    System.out.printf("%s%n", compress(test));
    System.out.printf("%s%n", advancedCompress(test));
    System.out.printf("%s%n", advancedCompress(secodTest));
    System.out.printf("%s%n", advancedCompress(thirdTest));
  }
}

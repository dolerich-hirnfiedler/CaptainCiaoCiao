package captainciaociao.kapitel_11._3;

import java.util.ArrayList;

public class SimpleStringCompressor {
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

    // First ide have a better one now
    // int counter = 1;
    // if (input.matches("[.-]+")) {
    // for (int i = 1; i < input.length(); i++) {
    // if (input.charAt(i) == input.charAt(i - 1)) {
    // counter++;
    // } else {
    // if (counter != 1) {
    // output += input.substring(i - 1, i);
    // output += counter;
    // } else {
    // output += input.substring(i - 1, i);
    // }
    // counter = 1;
    // }
    // }

    // }
    return output;
  }

  public static String decompress(String input) {
    return "";
  }

  public static void main(String[] args) {
    String test = "--....--------..--";
    System.out.printf("%s%n", compress(test));
  }
}

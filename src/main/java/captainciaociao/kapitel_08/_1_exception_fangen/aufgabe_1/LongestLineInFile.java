package captainciaociao.kapitel_08._1_exception_fangen.aufgabe_1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class LongestLineInFile {
  public static void main(String[] args) {
    String filename = "/Users/dolerich_hirnfielder/CaptainCiaoCiao/src/main/java/captainciaociao/kapitel_08/_1_exception_fangen/family-names.txt";
    try {
      List<String> lines = Files.readAllLines(Paths.get(filename));
      String longestName = "";
      String secondLongestName = "";
      for (String name : lines) {
        if (name.length() > longestName.length()) {
          longestName = name;
        } else if (name.length() > secondLongestName.length()) {
          secondLongestName = name;
        }
      }
      System.out.printf("Longest Name: %s%n Second longest Name: %s%n",
          longestName, secondLongestName);

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

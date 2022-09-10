package captainciaociao.kapitel_11._3;

import java.io.File;
// import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class CoordinateParser {
  public static void main(String[] args) {
    File csvFile =
        new File("src/main/java/captainciaociao/kapitel_11/_3/Coordinates.csv");
    File htmlWithSvg = new File(
        "src/main/java/captainciaociao/kapitel_11/_3/Coordinates.html");
    try {
      FileWriter writer = new FileWriter(htmlWithSvg);
      // FileInputStream csvInputSream = new FileInputStream(csvFile);
      FileReader csvFileReader = new FileReader(csvFile);
      Scanner csvScanner;
      csvScanner = new Scanner(csvFile);
      csvScanner.useLocale(Locale.ENGLISH);
      htmlWithSvg.createNewFile();
      writer.write("""
          "<!DOCTYPE html>"
          "<html>"
           "<title>SVG Polygon</title>"
          "</head>"
          "<body>"
          """);
      writer.write("<svg height=\"210\" width=\"500\">\n");
      String coordinates = "";
      while (csvScanner.hasNextLine()) {
        coordinates += csvScanner.nextLine() + " ";
      }
      String coordinatesString = String.format(
          "<polygon points=\"%s\" style=\"fill:lime;stroke;purple;stroke-width:1\" />\n",
          coordinates);
      writer.write(coordinatesString);
      writer.write("""
          "</svg>"
          "</body>"
          "</html>"
          """);
      writer.close();
      csvScanner.close();
      csvFileReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("File not found " + csvFile);
      e.printStackTrace();
    } catch (IOException e) {
      System.out.println("Something went wrong");
      e.printStackTrace();
    }
  }
}

package captainciaociao.kapitel_11._3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CoordinateParser {
    public static void main(String[] args) {
        File csvFile = new File("src/main/java/captainciaociao/kapitel_11/_3/Coordinates.csv");
        File htmlWithSvg = new File("src/main/java/captainciaociao/kapitel_11/_3/Coordinates.html");
        try {
            FileWriter writer = new FileWriter(htmlWithSvg);
            htmlWithSvg.createNewFile();
            writer.write("");
            writer.close();
            Scanner csvScanner;
            csvScanner = new Scanner(csvFile);
            csvScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found " + csvFile.toString());
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

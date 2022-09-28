package captainciaociao.kapitel_13._2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class KaraokeTime {
    public static void main(String[] args) {
        File data = new File("TimeString.txt");
        try (Scanner dataReader = new Scanner(data)) {
            ArrayList<String> stringList = new ArrayList<>();
            while (dataReader.hasNext()) {
                stringList.add(dataReader.nextLine());
            }
            for (String var : stringList) {
                System.out.printf("%n");
            }

            dataReader.close();
        } catch (FileNotFoundException e) {
            System.out.printf("FIle not found: %s%n", data.getPath());
            e.printStackTrace();
        }
    }
}

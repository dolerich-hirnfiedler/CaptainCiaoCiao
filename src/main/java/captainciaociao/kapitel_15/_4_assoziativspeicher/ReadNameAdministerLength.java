package captainciaociao.kapitel_15._4_assoziativspeicher;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

public class ReadNameAdministerLength {
    // 15.4.5 Name einlesen und Längen verwalten

    private final static String namesURL = "https://tutego.de/download/family-names.txt";

    private final static String filePath = "./family-names.txt";


    public static void main(String[] args) {
        try {
            SortedMap<Integer, List<String>> sortedbyLength = new TreeMap<>();
            URL url = new URL(namesURL);
            InputStream donwloadStream = url.openStream();
            Files.copy(donwloadStream, Paths.get(filePath), StandardCopyOption.REPLACE_EXISTING);
            Path namesPath = Paths.get(filePath);
            List<String> allNames = Files.readAllLines(namesPath);
            for (String name : allNames) {
                sortedbyLength.computeIfAbsent(name.length(), __ -> new ArrayList<>()).add(name);
            }


            sortedbyLength.forEach((len, names) -> System.out.println(len + ": " + names));

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

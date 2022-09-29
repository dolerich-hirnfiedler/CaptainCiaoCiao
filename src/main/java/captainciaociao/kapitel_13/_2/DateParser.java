package captainciaociao.kapitel_13._2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DateParser {
    public static void main(String[] args) {
        File data = new File("dates.txt");
        if (!data.exists()) {
            try {
                data.createNewFile();
                String string = "2020-10-10\n" + "2020-12-2\n" + "1/3/1976\n" + "1/3/2020\n"
                        + "tomorrow\n" + "today\n" + "yesterday\n" + "1 day ago\n";
                FileWriter dataWriter = new FileWriter(data);
                dataWriter.write(string);
                dataWriter.close();
            } catch (IOException e) {
                System.out.printf("Something went wrong%n");
                e.printStackTrace();
            }
        }

    }
}

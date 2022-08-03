package captainciaociao.kapitel_08._4_try_mit_ressourcen.aufgabe_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class TimeWriter {
  public static void main(String[] args) {
    File writeFile = new File(
        "src/main/java/captainciaociao/kapitel_08/_4_try_mit_ressourcen/aufgabe_1/output.txt");
    try (PrintWriter fileWriter = new PrintWriter(writeFile)) {
      fileWriter.write(LocalDateTime.now().toString());
    } catch (FileNotFoundException e) {
      System.out.printf("File not found...%n Supposed file path: %s",
                        writeFile.getAbsoluteFile());
      e.printStackTrace();
    }
  }
}

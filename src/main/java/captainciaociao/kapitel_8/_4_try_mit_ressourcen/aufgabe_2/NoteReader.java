package captainciaociao.kapitel_8._4_try_mit_ressourcen.aufgabe_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NoteReader {
    public static boolean contains(String[] array, String string) {
        for (int i = 0; i < array.length; i++) {
            if (string.matches(array[i])) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String[] NOTES = { "C,", "D,", "E,", "F,", "G,", "A,", "B,", "C", "D", "E", "F", "G", "A", "B", "c", "d", "e",
                "f", "g", "a", "b", "c'", "d'", "e'", "f'", "g'", "a'", "b'" };
        File notesSource = new File("src/main/java/captainciaociao/kapitel_8/_4_try_mit_ressourcen/aufgabe_2/file.txt");
        File outputFile = new File(
                "src/main/java/captainciaociao/kapitel_8/_4_try_mit_ressourcen/aufgabe_2/output.txt");
        try {
            Scanner noteScanner = new Scanner(notesSource);
            FileWriter noteWriter = new FileWriter(outputFile);
            while (noteScanner.hasNextLine()) {
                String input = noteScanner.nextLine();
                if (!input.isEmpty() && contains(NOTES, input)) {
                    System.out.printf("%s ", input);
                    noteWriter.write(input + " ");
                }
            }
            noteScanner.close();
            noteWriter.close();
        } catch (FileNotFoundException e) {
            System.out.printf("No such file found %n" + "Supposed to be at: %s", notesSource.getAbsoluteFile());
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

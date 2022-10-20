package captainciaociao.kapitel_16._1_regular_streams_with_termianle_and_inter_ops;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class FilterRareEarth {
    // 16.1.6 Doppelte Inseln mit Metallen der Seltenen Erden entfernen (Java 9) ***


    private static Pattern pattern = Pattern.compile("(^.*$\n){2}", Pattern.MULTILINE);

    public static String removeDoubles(String lines) {
        String result = "";
        Scanner scanner = new Scanner(lines);
        result = scanner.findAll(pattern).map(MatchResult::group).distinct()
                .collect(Collectors.joining());
        scanner.close();

        return result;
    }

    public static String removeDoubles(File file) throws FileNotFoundException {
        String result = "";
        Scanner scanner = new Scanner(file);
        result = scanner.findAll(pattern).map(MatchResult::group).distinct()
                .collect(Collectors.joining());
        scanner.close();

        return result;
    }

    public static String removeDoubles(InputStream lines) {
        String result = "";
        Scanner scanner = new Scanner(lines);
        result = scanner.findAll(pattern).map(MatchResult::group).distinct()
                .collect(Collectors.joining());
        scanner.close();

        return result;
    }

    public static String removeDoubles(Path lines) throws IOException {
        String result = "";
        Scanner scanner = new Scanner(lines);
        result = scanner.findAll(pattern).map(MatchResult::group).distinct()
                .collect(Collectors.joining());
        scanner.close();

        return result;
    }

    public static void main(String[] args) {
        String lines = "Balancar" + "\n" + "Erbium" + "\n" + "Beneca" + "\n" + "Yttrium" + "\n"
                + "Luria" + "\n" + "Thulium" + "\n" + "Kelvar" + "\n" + "Neodym" + "\n" + "Mudd"
                + "\n" + "Europium" + "\n" + "Tamaal" + "\n" + "Erbium" + "\n" + "Varala" + "\n"
                + "Gadolinium" + "\n" + "Luria" + "\n" + "Thulium" + "\n";

        System.out.println(removeDoubles(lines));
    }


}

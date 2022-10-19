package captainciaociao.kapitel_15._4_assoziativspeicher;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public class ColorNames {
    // 15.4.4 Farben einlesen und vorlesen lassen

    private static final String COLORS_CSV = "colors.csv";
    private HashMap<Integer, Color> colorMap;

    /**
     *
     */
    public ColorNames() {
        try {

            List<String> parsedCSV = Files.readAllLines(Paths.get(COLORS_CSV));
            for (String line : parsedCSV) {
                String[] words = line.split(",");
                if (words[3].length() == 4) {
                    String rrggbb = words[3].substring(0, 1) + words[3].substring(1, 2).repeat(2)
                            + words[3].substring(2, 3).repeat(2) + words[3].substring(3).repeat(2);
                    words[3] = rrggbb;
                }
                Color color = new Color(words[1], Integer.decode(words[3]));
                colorMap.put(color.getRgb(), color);
            }

        } catch (IOException e) {
            System.out.printf("Please ensure that %s%n", COLORS_CSV);
            e.printStackTrace();
        }
    }

    /**
     * @return the colorMap
     */
    public HashMap<Integer, Color> getColorMap() {
        return colorMap;
    }

    public Optional<Color> decode(int rgb) {
        return Optional.ofNullable(colorMap.get(rgb));
    }

}

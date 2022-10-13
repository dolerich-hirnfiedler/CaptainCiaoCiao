package captainciaociao.kapitel_15._2_listen;

import java.util.ArrayList;
import java.util.List;

public class ReduceComment {
    public static void reduceToComment(List<String> lines) {
        int size = lines.size();
        List<String> list = new ArrayList<>();
        if (!(size % 4 == 0)) {
            throw new ReducePlayerException(
                    String.format("Illegal size %s of list is not divisible by 4", size));
        }
        for (int i = 0; i < size; i++) {
            if (i % 4 == 0) {
                list.add(lines.get(i));
            }
        }
        lines = list;
    }

    public static void main(String[] args) {
        List<String> log = List.of("A1", "A2", "A3", "A4", "B1", "B2", "B3", "B4",
                "C1", "C2", "C3", "C4");

        for (String string : log) {
            System.out.printf("%s%n", string);
        }
        reduceToComment(log);
        for (String string : log) {
            System.out.printf("%s%n", string);
        }
    }
}

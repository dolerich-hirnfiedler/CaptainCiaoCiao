package captainciaociao.kapitel_15._2_listen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MusicalChairs {
    List<String> names = new ArrayList<>();

    MusicalChairs(String... names) {
        this.names.addAll(Arrays.asList(names));
    }

    @Override
    public String toString() {
        String returnString = "";
        for (String name : names) {
            returnString += ", " + name;
        }
        return returnString;
    }

    void rotate(int distance) {
        List<String> sublistOne = this.names.subList(names.size() - distance, names.size());
        List<String> sublistTwo = this.names.subList(0, names.size() - distance);
        this.names.clear();
        names.addAll(sublistTwo);
        names.addAll(sublistOne);
    }

    void rotateAndRemoveLast(int distance) {
        this.rotate(distance);
        names.remove(names.size() - 1);
    }

    String play() {
        Random random = new Random();
        while (this.names.size() > 1) {
            this.rotateAndRemoveLast(random.nextInt(names.size()));
        }
        return names.get(0);
    }
}

package captainciaociao.kapitel_15._3_sets;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class FindIntersection {
    public static void main(String[] args) {
        Set<String> me = new HashSet<>();
        Collections.addAll(me, "Candy making", "Billiards", "Fishkeeping", "Eating", "Action figures", "Birdwatching",
                "Axe throwing");
        Set<String> she = new HashSet<>();
        Collections.addAll(she, "Axe throwing", "Candy making", "Action figures", "Casemodding", "Skiing",
                "Satelite watching");
        me.retainAll(she);
        System.out.println(me);

    }
}

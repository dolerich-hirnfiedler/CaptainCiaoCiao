package captainciaociao.kapitel_16._1_regular_streams_with_termianle_and_inter_ops;

import captainciaociao.kapitel_10._2_comperator_comparable.aufgabe_2.Heroes;
import captainciaociao.kapitel_10._2_comperator_comparable.aufgabe_2.Heroes.Hero.Sex;

public class StreamingHeroes {
    // 16.1.1 Heldenepos: Stream-API kennen lernen



    public static void main(String[] args) {
        Heroes.ALL.stream()
                .forEach(h -> System.out.printf("%s,%s,%s%n", h.name, h.sex, h.yearFirstApperance));
        System.out.println(Heroes.ALL.stream().allMatch(h -> h.yearFirstApperance >= 1900));
        System.out.println(Heroes.ALL.stream()
                .anyMatch(h -> h.sex.equals(Sex.FEMALE) && h.yearFirstApperance >= 1950));
    }
}

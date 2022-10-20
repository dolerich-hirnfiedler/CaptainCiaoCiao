package captainciaociao.kapitel_16._1_regular_streams_with_termianle_and_inter_ops;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import captainciaociao.kapitel_10._2_comperator_comparable.aufgabe_2.Heroes;
import captainciaociao.kapitel_10._2_comperator_comparable.aufgabe_2.Heroes.Hero;
import captainciaociao.kapitel_10._2_comperator_comparable.aufgabe_2.Heroes.Hero.Sex;

public class StreamingHeroes {
    // 16.1.1 Heldenepos: Stream-API kennen lernen



    public static void main(String[] args) {
        // Terminale Operationen:

        Heroes.ALL.stream()
                .forEach(h -> System.out.printf("%s,%s,%s%n", h.name, h.sex, h.yearFirstApperance));
        System.out.println(Heroes.ALL.stream().allMatch(h -> h.yearFirstApperance >= 1900));
        System.out.println(Heroes.ALL.stream()
                .anyMatch(h -> h.sex.equals(Sex.FEMALE) && h.yearFirstApperance >= 1950));

        System.out.printf("This Hero was first: %s%n", Heroes.ALL.stream()
                .min((h1, h2) -> Integer.compare(h1.yearFirstApperance, h2.yearFirstApperance)));
        System.out.printf("This Hero is closesd to 1960: %s%n",
                Heroes.ALL.stream()
                        .min((h1, h2) -> Integer.compare(Math.abs(h1.yearFirstApperance - 1960),
                                Math.abs(h2.yearFirstApperance - 1960))));

        StringBuilder years = Heroes.ALL.stream().collect(StringBuilder::new,
                (sb, hero) -> sb.append(sb.isEmpty() ? "" : ",").append(hero.yearFirstApperance),
                (sb1, sb2) -> sb1.append(sb1.isEmpty() ? "" : "," + sb2));
        System.out.println(years);

        Map<Sex, List<Hero>> sexListMap =
                Heroes.ALL.stream().collect(Collectors.groupingBy(hero -> hero.sex));

        System.out.println(sexListMap);
        Map<Boolean, List<Hero>> beforeAndAfter1970 = Heroes.ALL.stream()
                .collect(Collectors.partitioningBy(h -> h.yearFirstApperance >= 1970));
        System.out.println(beforeAndAfter1970);

        // Intermediäre Operationen

        System.out.println(Heroes.ALL.stream().filter(h -> h.sex == Sex.FEMALE).count());

        Heroes.ALL.stream()
                .sorted((h1, h2) -> Integer.compare(h1.yearFirstApperance, h2.yearFirstApperance))
                .forEach(System.out::println);

        String femaleNames = Heroes.ALL.stream().filter(h -> h.sex == Sex.FEMALE).map(h -> h.name)
                .collect(Collectors.joining(","));
        System.out.println(femaleNames);



    }
}

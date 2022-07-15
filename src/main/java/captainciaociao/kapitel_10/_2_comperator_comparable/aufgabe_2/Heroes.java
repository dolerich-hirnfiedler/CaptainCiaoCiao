package captainciaociao.kapitel_10._2_comperator_comparable.aufgabe_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Heroes {
    private Heroes() {
    }

    public static class Hero {
        public enum Sex {
            MALE, FEMALE
        }

        public final String name;
        public final Sex sex;
        public final int yearFirstApperance;

        public Hero(String name, Sex sex, int yearFirstApperance) {
            this.name = Objects.requireNonNull(name);
            this.sex = Objects.requireNonNull(sex);
            this.yearFirstApperance = Objects.requireNonNull(yearFirstApperance);
        }

        @Override
        public String toString() {
            return "Hero [name=" + name + ", sex=" + sex + ", yearFirstApperance=" + yearFirstApperance + "]";
        }

    }

    public static class Universe {
        private final String name;
        private final List<Hero> heroes;

        public Universe(String name, List<Hero> heroes) {
            this.name = Objects.requireNonNull(name);
            this.heroes = Objects.requireNonNull(heroes);
        }

        public String name() {
            return name;
        }

        public Stream<Hero> heroes() {
            return heroes.stream();
        }
    }

    private static final Hero DEADPOOL = new Hero("Deadpool (Wade Wilson)", Hero.Sex.MALE, 1991);
    private static final Hero LANA_LANG = new Hero("Lana Lang", Hero.Sex.FEMALE, 1950);
    private static final Hero THOR = new Hero("Thor (Thor Odinson)", Hero.Sex.MALE, 1950);
    private static final Hero IRON_MAN = new Hero("Iron Man (Anthony 'Tony' Stark)", Hero.Sex.MALE, 1963);
    private static final Hero SPIDERMAN = new Hero("Spider-Man (Peter Parker)", Hero.Sex.MALE, 1962);
    private static final Hero WONDER_WOMAN = new Hero("Wonder Woman (Diana Prince)", Hero.Sex.FEMALE, 1941);
    private static final Hero CAPTAIN_AMERICA = new Hero("Caaptain America (Steve Rogers)", Hero.Sex.MALE, 1941);
    private static final Hero SUPERMAN = new Hero("Superman (Clark Kent)", Hero.Sex.MALE, 1938);
    private static final Hero BATMAN = new Hero("Batman (Bruce Wayne)", Hero.Sex.MALE, 1939);

    public static final List<Hero> DC = Collections
            .unmodifiableList(Arrays.asList(SUPERMAN, LANA_LANG, WONDER_WOMAN, BATMAN));

    public static final List<Hero> MARVEL = Collections
            .unmodifiableList(Arrays.asList(DEADPOOL, CAPTAIN_AMERICA, THOR, IRON_MAN, SPIDERMAN));

    public static final List<Hero> ALL = Collections
            .unmodifiableList(Stream.concat(DC.stream(), MARVEL.stream()).collect(Collectors.toList()));

    public static final List<Universe> UNIVERSES = Collections
            .unmodifiableList(Arrays.asList(new Universe("DC", DC), new Universe("Marvel", MARVEL)));

    List<Hero> allHeroes = new ArrayList<>(Heroes.ALL);

    class yearFirstApperanceComparator implements Comparator<Heroes.Hero> {

        @Override
        public int compare(Hero o1, Hero o2) {
            return Integer.compare(o1.yearFirstApperance, o2.yearFirstApperance);
        }

    }
}

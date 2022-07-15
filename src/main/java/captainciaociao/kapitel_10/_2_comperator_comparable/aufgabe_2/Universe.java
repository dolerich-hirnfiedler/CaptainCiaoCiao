package captainciaociao.kapitel_10._2_comperator_comparable.aufgabe_2;

import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

import captainciaociao.kapitel_10._2_comperator_comparable.aufgabe_2.Heroes.Hero;

public class Universe {
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

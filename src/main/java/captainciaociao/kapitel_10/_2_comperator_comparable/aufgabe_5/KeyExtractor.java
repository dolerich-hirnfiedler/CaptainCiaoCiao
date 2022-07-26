package captainciaociao.kapitel_10._2_comperator_comparable.aufgabe_5;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;

public class KeyExtractor {
    public static <T, U extends Comparable<? super U>> Comparator<T> comparing(
            Function<? super T, ? extends U> keyExtractor) {
        Objects.requireNonNull(keyExtractor);
        return (Comparator<T> & Serializable) (c1, c2)->keyExtractor.apply(c1).compareTo(keyExtractor.apply(c2));
    }
}

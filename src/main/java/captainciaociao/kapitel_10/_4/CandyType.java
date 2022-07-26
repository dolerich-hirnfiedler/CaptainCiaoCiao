package captainciaociao.kapitel_10._4;

import java.util.Optional;

public enum CandyType {
    CARAMELS, CHOCOLATE, GUMMIES, LICORICE, LOLLIPOPS, CHEWING_GUMS, COTTON_CANDY;

    static Optional<CandyType> fromName(String input) {
        try {
            input = input.trim().toUpperCase().replaceAll(" ", "_");
            return Optional.of(valueOf(input));
        } catch (IllegalArgumentException e) {
            return Optional.empty();
        }
    }
}

package captainciaociao.kapitel_08._3_eigene_ausnahmeklassen_schreiben.aufgabe_1;

public class IllegalWattException extends RuntimeException {
    public IllegalWattException() {
    }

    public IllegalWattException(String format, Object... args) {
        super(String.format(format, args));
    }
}

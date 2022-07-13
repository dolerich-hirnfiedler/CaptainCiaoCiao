package captainciaociao.kapitel_9._1_lambda_ausdruecke.quiz_1;

/**
 * Dieses Interface ist funktional, da es genau eine abstrakte Methode besitzt.
 *
 */
@FunctionalInterface
public interface Distance {
    abstract public int distance(int a, int b);
}

/**
 * Dieses Interface wäre nicht funktional, da es durch vererbung mehr als eine
 * abstrakte Methode besitzt.
 *
 */
// @FunctionalInterface
// interface MoreDistance extends Distance {
// double distance(double a, double b);
// }
//

/**
 * Dieses Interface wiederum ist funktional, da es über vererbung eine bstrakte
 * Methode aufruft, welche von dem Super Interface vorgegeben wird.
 *
 */
@FunctionalInterface
interface MoreDistance2 extends Distance {
    default double distance(double a, double b) {
        return distance((int) a, (int) b);
    }
}

/**
 * Diese Interface wäre nicht funktional, da es keine abstrakte Methode
 * nthält, den durch das default keyword wird eine implemetierung mitgegeben.
 *
 */
// @FunctionalInterface
// interface DistanceImpl {
// default int distance(int a, int b) {
// return a + b;
// }
// }

/**
 * Dieses Interface ist wiederum funktional, da die zweite abstrakte Methode ein
 * Sonderfall ist. Es gibt einige Methoden, für den Pbjekttyp, die immer
 * vorhanden sind, diese kann man in ein funktionals Interface einfügen, wenn
 * man gesonderte Dokumentation schreiben will.
 *
 */
@FunctionalInterface
interface DistanceEquals {
    int distance(int a, int b);

    boolean equals(Object other);
}

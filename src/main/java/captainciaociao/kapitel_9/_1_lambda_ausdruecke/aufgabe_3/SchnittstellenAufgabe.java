package captainciaociao.kapitel_9._1_lambda_ausdruecke.aufgabe_3;

import java.awt.event.ActionListener;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class SchnittstellenAufgabe {
    /**
     * interface Runnable { void run(); }
     *
     */
    Runnable runnable = () -> System.out.printf("%n");
    ActionListener listener = e -> System.out.printf("%n");
    Supplier<String> supplier = () -> "";
    Consumer<Point> consumer = point -> {
    };
    Comparator<Rectangle> comparator = (o1, o2) -> 2;

}

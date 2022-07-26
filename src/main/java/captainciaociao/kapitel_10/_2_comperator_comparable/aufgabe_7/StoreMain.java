package captainciaociao.kapitel_10._2_comperator_comparable.aufgabe_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.awt.Point;

public class StoreMain {

    static List<Store> findStoresAround(Collection<Store> stores, Point center) {
        List<Store> result = new ArrayList<>(stores);
        Comparator<Store> storetoCenterComparator = new Comparator<Store>() {
            @Override
            public int compare(Store o1, Store o2) {
                return Integer.compare((int) o1.getLocation().distance(center),
                        (int) o2.getLocation().distance(center));
            }
        };
        result.sort(storetoCenterComparator);
        return result;
    }

    public static void main(String[] args) {
        Store s1 = new Store(10, 20, "Aldi");
        Store s2 = new Store(50, 30, "Lidl");
        Store s3 = new Store(40, 70, "REWE");
        List<Store> stores = Arrays.asList(s1, s2, s3);
        List<Store> results = findStoresAround(stores, new Point(35, 40));
        System.out.printf("%s%n", results.toString());

    }
}

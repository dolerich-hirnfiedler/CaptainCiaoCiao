package captainciaociao.kapitel_15._3_sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.DoubleStream;

public class RemoveDoubles {
    static double[] unique(double... values) {

        Set<Double> filterDoubles = new HashSet<>(DoubleStream.of(values).boxed().toList());
        Iterator<Double> filterIterator = filterDoubles.iterator();
        double[] returnValues = new double[filterDoubles.size()];
        int index = 0;
        while (filterIterator.hasNext()) {
            returnValues[index] = filterIterator.next();
            index++;
        }
        return returnValues;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(unique(1, 1)));
    }
}

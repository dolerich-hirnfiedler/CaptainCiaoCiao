package captainciaociao.kapitel_15._3_sets;

import java.math.BigDecimal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortingNumberStrings {
    public static final String[] EXAMPLE_STRINGS = { "-13.123", "0", "0", "10101010", "10101010.0", "0.0", "-0.0" };

    static Comparator<String> comp = Comparator.comparing((String s) -> new BigDecimal(s))
            .thenComparing(Comparator.naturalOrder());

    public static Collection<String> sort(List<String> numbers) {
        Set<String> filteredNumbers = new TreeSet<>(comp);
        filteredNumbers.addAll(numbers);
        return filteredNumbers;
    }

    public static void main(String[] args) {
        System.out.println(sort(new ArrayList<>(Arrays.asList(EXAMPLE_STRINGS))));

    }
}

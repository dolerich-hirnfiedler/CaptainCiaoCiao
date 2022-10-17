package captainciaociao.kapitel_15._2_listen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SameCircle {
    public static boolean isSameCircle(List<String> firstList, List<String> secondList) {
        // Elements of Lists can't have the same order if Lists don't have the same size

        if (firstList.size() != secondList.size()) {
            return false;
        }

        int offset = 0;

        for (int i = 0; i < secondList.size(); i++) {
            if (firstList.get(0).matches(secondList.get(i))) {
                offset = i;
                break;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        List<String> namesOne = new ArrayList<>(Arrays.asList("Alexandre", "Charles", "Anne", "Henry"));
        List<String> namesTwo = new ArrayList<>(Arrays.asList("Anne", "Henry", "Alexandre", "Charles"));
        List<String> namesThree = new ArrayList<>(Arrays.asList("Alexandre", "Charles", "Henry", "Anne"));
        List<String> namesFour = new ArrayList<>(Arrays.asList("Alexandre", "William", "Anne", "Henry"));
    }
}

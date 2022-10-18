package captainciaociao.kapitel_15._4_assoziativspeicher;

import java.util.HashMap;
import java.util.Map;

public class ConvertToMap {
    public static Map<String, String> convertToMap(String[][] array) {
        Map<String, String> returnMap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            returnMap.put(array[i][0], array[i][1]);
        }
        return returnMap;
    }

    public static void main(String[] args) {
        String[][] array = { { "red", "#FF0000" }, { "green", "#00FF00" }, { "blue", "#0000FF" } };
        System.out.println(convertToMap(array));
    }
}

package captainciaociao.kapitel_11._3;

import java.util.ArrayList;
import java.util.Arrays;

public class RelationChecker {
    private static boolean check(Integer first, Integer second, String relation) {
        if (relation.matches("<")) {
            return Math.abs(first) - Math.abs(second) < 0;
        }
        if (relation.matches(">")) {
            return Math.abs(first) - Math.abs(second) > 0;
        }
        if (relation.matches("=")) {
            return Math.abs(first) - Math.abs(second) == 0;
        }
        System.out.printf("Invalid relation%n");
        return false;
    }

    public static boolean checkRelation(String input) {
        String[] numbers = input.split("<|>|=");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i].trim();
        }
        ArrayList<String> numbersCleaned = new ArrayList<String>();
        for (int i = 0; i < numbers.length; i++) {
            if (!numbers[i].matches("")) {
                numbersCleaned.add(numbers[i]);
            }
        }
        String[] relations = input.split("[0-9]+");
        for (int i = 0; i < relations.length; i++) {
            relations[i] = relations[i].trim();
        }
        ArrayList<String> relationsCleaned = new ArrayList<>();
        for (int i = 0; i < relations.length; i++) {
            if (!relations[i].matches("")) {
                relationsCleaned.add(relations[i]);
            }
        }


        if (numbersCleaned.size() <= relationsCleaned.size()) {
            return false;
        }
        boolean isValid = true;
        for (int i = 0; i < numbersCleaned.size() - 1; i++) {
            if (!check(Integer.parseInt(numbersCleaned.get(i)),
                    Integer.parseInt(numbersCleaned.get(i + 1)), relationsCleaned.get(i))) {
                isValid = false;
            }
        }
        return isValid;
    }

    public static void main(String[] args) {
        String firstString = "1 < 2 > 1 < 10 = 10 > 2";
        String secondString = "1 < 1";
        String thirdString = "1 < ";
        String fourthString = "1";

        System.out.printf("%s --> %b%n", firstString, checkRelation(firstString));
        System.out.printf("%s --> %b%n", secondString, checkRelation(secondString));
        System.out.printf("%s --> %b%n", thirdString, checkRelation(thirdString));
        System.out.printf("%s --> %b%n", fourthString, checkRelation(fourthString));
    }
}

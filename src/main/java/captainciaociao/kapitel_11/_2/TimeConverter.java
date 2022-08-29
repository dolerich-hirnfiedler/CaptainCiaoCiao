package captainciaociao.kapitel_11._2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TimeConverter {
    private static final Pattern timeRegexAM =
            Pattern.compile("([0-9]{1,2}:[0-9]{2})(? )((am)|(AM)|(a.m.))");
    private static final Pattern timeRegexPM =
            Pattern.compile("([0-9]{1,2}:[0-9]{2})(? )((pm)|(PM)|(p.m.))");

    // First try:
    //
    //
    // public static String convertToMilitary(String input) {
    // String[] inputArray = input.split(" ");
    // for (int i = 0; i < inputArray.length; i++) {
    // if (inputArray[i].matches("([0-9]{1,2}:[0-9]{2}")
    // && inputArray[i + 1].matches("(pm)|(PM)|(p.m.)")) {
    // String numbers = "";
    // for (int j = 0; j < inputArray[i].length(); j++) {
    // if (inputArray[i].substring(j, j + 1).matches("[0-9]"))
    // ;
    // {
    // numbers += inputArray[i].substring(j, j + 1);
    // }
    // Integer number = Integer.getInteger(numbers);

    // }
    // }
    // }
    // return "";
    // }


    // Second try:
    public static String convertToMilitary(String input) {
        StringBuilder workingString = new StringBuilder(input);

        return null;
    }
}

package captainciaociao.kapitel_11._2;

import java.lang.reflect.Method;

public class NumbersToStringsConverter {
    private static String[] oneDigits =
            {"Zero", "One", "Two", "Three", "Four", "Fife", "Six", "Seven", "Eight", "Nine"};
    private static String[] doubleDigitIrreduzible = {"Ten", "Eleven", "Twelfe", "Thirteen",
            "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private static String[] tens =
            {"Twenty", "Thirty", "Fourty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    private static String[] potencies = {"Hundret", "Thousand", "Million", "Milliard"};


    private static String stringMatcher(String input) {
        for (int i = 0; i < 10; i++) {
            if (input.matches(Integer.toString(i))) {
                return oneDigits[i];
            }
        }
        for (int i = 10; i < 20; i++) {
            if (input.matches(Integer.toString(i))) {
                return doubleDigitIrreduzible[i - doubleDigitIrreduzible.length];
            }
        }
        for (int i = 20; i < 100; i += 10) {
            if (input.matches(Integer.toString(i))) {
                return doubleDigitIrreduzible[i - doubleDigitIrreduzible.length];
            }
        }
        return input;
    }

    private boolean isNumber(String input) {
        return input.matches("[0-9]+");
    }

    private static String convertNumberToWord(String input) {
        String outputString = "";
        String[] inputAsStringArray = new String[input.length()];
        for (int i = 0; i < input.length(); i++) {
            inputAsStringArray[i] = input.substring(i, i + 1);
        }
        for (int i = 0; i < inputAsStringArray.length; i++) {

        }
        return outputString;
    }

    public static String convertNumbersToWords(String input) {
        String[] arrayInput = input.split("[0-9]+");
        return "";
    }



    public static void main(String[] args) {
        StringBuffer example =
                new StringBuffer("99 bottles of beer make CaptainCiaoCiao happy for 10 years");
        String[] exampleArray = example.toString().split("[0-9]+");
        for (String paString : exampleArray) {
            System.out.printf("%s ", paString);
        }
        System.out.printf("%n");

        System.out.printf("%s", example);
    }
}

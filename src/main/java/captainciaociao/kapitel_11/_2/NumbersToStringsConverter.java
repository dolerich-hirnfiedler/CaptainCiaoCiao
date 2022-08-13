package captainciaociao.kapitel_11._2;

import java.util.regex.Pattern;

public class NumbersToStringsConverter {
  private static String[] oneDigits = { "Zero", "One", "Two", "Three", "Four", "Fife", "Six", "Seven", "Eight",
      "Nine" };
  private static String[] doubleDigitIrreduzible = { "Ten", "Eleven", "Twelfe", "Thirteen", "Fourteen", "Fifteen",
      "Sixteen",
      "Seventeen", "Eighteen", "Nineteen" };
  private static String[] tens = { "Twenty", "Thirty", "Fourty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };
  private static String[] potencies = { "Hundret", "Thousand", "Million", "Milliard" };

  private final static Pattern numberpattern = Pattern.compile("[0-9]+");
  private final static Matcher numbermatcher = n

  private static String replacenumbersWithText(StringBuffer input) {

    return "";
  }

  public static void main(String[] args) {
    StringBuffer example = new StringBuffer("99 bottles of beer make CaptainCiaoCiao happy for 10 years");
    System.out.printf("%s", example);
  }
}

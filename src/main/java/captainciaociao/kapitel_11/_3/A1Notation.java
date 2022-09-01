package captainciaociao.kapitel_11._3;

public class A1Notation {
    public static String printResult(int[] res) {
        String result = "[";
        for (int i = 0; i < res.length; i++) {
            result += " " + res[i] + ",";
        }
        result += "]";
        return result;
    }

    private static int parseLetters(String input) {
        int returnValue = 0;
        if (input.matches("Z+")) {
            returnValue = (int) Math.pow((double) 26, (double) input.length());
        } else {
            returnValue = input.charAt(input.length() - 1) - 64;
            for (int i = 0; i < input.length() - 1; i++) {
                returnValue += (input.charAt(i) - 64) * Math.pow(26, input.length() - i - 1);
            }
        }
        return returnValue;

    }

    public static int[] parseA1Notation(String input) {
        int[] returnValue = { 0, 0 };
        if (input.matches("[A-Z]+[0-9]+")) {
            String column = input.replaceAll("[A-Z]+", "").trim();
            String row = input.replaceAll("[0-9]+", "");
            returnValue[0] = parseLetters(row);
            returnValue[1] = Integer.parseInt(column);
        }
        return returnValue;

    }

    public static void main(String[] args) {
        System.out.println(printResult(parseA1Notation("A1")));
        System.out.println(printResult(parseA1Notation("Z2")));
        System.out.println(printResult(parseA1Notation("AA34")));
        System.out.println(printResult(parseA1Notation("BZ")));
        System.out.println(printResult(parseA1Notation("34")));
        System.out.println(printResult(parseA1Notation(" ")));
        System.out.println(printResult(parseA1Notation("")));
    }
}

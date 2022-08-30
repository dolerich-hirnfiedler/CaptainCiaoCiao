package captainciaociao.kapitel_11._3;

public class A1Notation {
    private static int parseLetters(String input) {

    }

    public static int[] parseA1Notation(String input) {
        int[] returnValue = {0, 0};
        if (input.matches("[A-Z]+[0-9]+")) {
            String column = input.replaceAll("[A-Z]+", "").trim();
            String row = input.replaceAll("[0-9]+", "");
            returnValue[0] = parseLetters(row);
            returnValue[1] = Integer.parseInt(column);
        }
        return returnValue;

    }

    public static void main(String[] args) {

    }
}

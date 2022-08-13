package captainciaociao.kapitel_11._2;

public class ScannedValuesRecognizer {
    private static String getFirstLine(String input) {
        String firstLine = input.substring(0, input.indexOf("\n"));
        return firstLine;
    }

    private static String reduceString(String input) {
        String reducedString = input.replaceAll("[ ]+", "").replaceAll("000", "0")
                .replaceAll("11", "1").replaceAll("22", "2").replaceAll("333", "3")
                .replaceAll("44", "4").replaceAll("5555", "5").replaceAll("77777", "7")
                .replaceAll("888", "8").replaceAll("9999", "9");
        return reducedString;
    }

    public static void main(String[] args) {
        String ocr = "4  4 77777  11   11  4  4  22 \n" + "4  4    7  111  111  4  4 2  2\n"
                + "4444   7    11   11  4444   2 \n" + "   4   7    11   11     4  2  \n"
                + "   4   7   11l1 11l1    4 2222\n";
        String ocrFirstLine = getFirstLine(ocr);
        System.out.println(ocr);
        System.out.println(ocrFirstLine);
        System.out.println(reduceString(ocrFirstLine));

    }
}

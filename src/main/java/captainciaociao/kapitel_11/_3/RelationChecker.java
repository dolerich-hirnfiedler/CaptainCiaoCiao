package captainciaociao.kapitel_11._3;

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
        String[] relations = input.split("[0-9]+");
        if (numbers.length <= relations.length) {
            return false;
        }
        boolean isValid = true;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (!check(Integer.getInteger(numbers[i]), Integer.getInteger(numbers[i + 1]),
                    relations[i])) {
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

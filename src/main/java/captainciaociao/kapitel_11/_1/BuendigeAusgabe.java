package captainciaociao.kapitel_11._1;

public class BuendigeAusgabe {
    public static void printList(String[] names, boolean[] paid) throws NullPointerException {

        if (names.length != paid.length) {
            throw new IllegalArgumentException(
                    "Number of names and paid entries are not the same, but " + names.length + " and " + paid.length);
        }

        int longestNameLength = 0;
        for (String name : names) {
            if (name.length() > longestNameLength) {
                longestNameLength = name.length();
            }
        }
        for (int i = 0; i < names.length; i++) {
            System.out.printf("%-" + longestNameLength + "s    %s%n", names[i],
                    paid[i] == true ? "paid" : "not paid");
        }

    }

    public static void main(String[] args) {
        String[] names = { "Dory Dab", "Bob Banjo", "Cod Buri", "Bugsy" };
        boolean[] paid = { true, true, true, false };
        printList(names, paid);
    }
}

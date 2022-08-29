package captainciaociao.kapitel_11._3;

public class AdressUtils {
    public static Adress parseStringForAdress(String input) {
        String[] parts = input.split("\\n|\\r|\\r\\n|\\n\\r");
        if (parts.length == 3) {
            Adress adress = new Adress(parts[0], parts[1], parts[2]);
            return adress;
        } else if (parts.length == 4) {
            Adress adress = new Adress(parts[0], parts[1], parts[2], parts[3]);
            return adress;
        }
        System.out.printf("Something went wrong%n");
        return null;
    }

    public static void main(String[] args) {
        String firstString = "Boots and Bootles\n21 Pickle Street\n424242 Douglas \nArendelle";
        String secondString = "Doofenshmirtz Evil Inc. \nStrudelkuschel 4427\nDanville";
        parseStringForAdress(firstString).printAsCSV();
        parseStringForAdress(secondString).printAsCSV();
    }
}

package captainciaociao.kapitel_4._5_variable_argumentelisten.aufgabe_2;

public class AllTrue {
    public static boolean allTrue(boolean first, boolean... second) {
        for (boolean b : second) {
            if (b == false)
                return false;
        }

        return first;
    }

    public static void main(String[] args) {

    }
}

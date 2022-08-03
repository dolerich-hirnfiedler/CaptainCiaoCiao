package captainciaociao.kapitel_04._2_eindimensionale_arrays.aufgabe_6;

public class Main {
    private static int getSum(int[] values) {
        int summ = 0;
        for (int i = 0; i < values.length; i++) {
            summ += values[i];
        }
        return summ;
    }

    private static int findSplitPoint(int[] args) {
        int sum = 0;
        int lowwerBound = (int) ((getSum(args) / 2) * 0.9);
        int upperBound = (int) ((getSum(args) / 2) * 1.1);
        for (int i = 0; i < args.length; i++) {
            sum += args[i];
            if (sum >= lowwerBound && sum <= upperBound)
                return i + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] values = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
        System.out.printf("%d%n", findSplitPoint(values));
    }
}

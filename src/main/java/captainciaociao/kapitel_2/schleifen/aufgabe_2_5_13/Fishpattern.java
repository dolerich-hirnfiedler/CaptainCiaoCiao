package captainciaociao.kapitel_2.schleifen.aufgabe_2_5_13;

public class Fishpattern {
    private final String patternLeft = "><> ";
    private final String patternRight = "<>< ";
    private int repetitions;

    public Fishpattern(int repetitions) {
        this.repetitions = repetitions;
    }

    public void print() {
        for (int i = 0; i < repetitions; i++) {
            System.out.printf("%s%s%n", patternLeft.repeat(this.repetitions), patternRight.repeat(this.repetitions));
        }
    }
}

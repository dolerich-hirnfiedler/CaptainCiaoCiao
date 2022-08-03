package captainciaociao.kapitel_02.variablenunddatentypen.aufgabe2_3_3;

public enum Value {
    ZERO(0), ONE(1), TWO(2), THREE(3), FOUR(4), FIFE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9);

    private int value;

    private Value(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

package captainciaociao.kapitel02.variablenunddatentypen.aufgabe2_3_4;

public enum Coins {
    TWO_EURO(200), ONE_EURO(100), FIFTY_CENT(50), TWENTY_CENT(20), TEN_CENT(10), FIFE_CENT(5), TWO_CENT(2), ONE_CENT(1);

    private int value;

    private Coins(int value) {
        this.setValue(value);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

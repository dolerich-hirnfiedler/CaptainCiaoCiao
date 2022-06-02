package captainciaociao.kapitel02.variablenunddatentypen.aufgabe2_3_3;

public class Field {
    private Value value;

    public Field(Value value) {
        this.setValue(value);
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }
}

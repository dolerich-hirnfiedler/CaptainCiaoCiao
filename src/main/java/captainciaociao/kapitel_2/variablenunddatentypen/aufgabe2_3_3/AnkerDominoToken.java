package captainciaociao.kapitel_2.variablenunddatentypen.aufgabe2_3_3;

import java.rmi.NoSuchObjectException;

public class AnkerDominoToken {
    private Field[] fields = new Field[2];

    public AnkerDominoToken(int valueOne, int valueTwo) {
        try {
            this.fields[0] = new Field(AnkerDominoInput.getValue(valueOne));
        } catch (NoSuchObjectException e) {
            e.printStackTrace();
        }
        try {
            this.fields[1] = new Field(AnkerDominoInput.getValue(valueTwo));
        } catch (NoSuchObjectException e) {
            e.printStackTrace();
        }
    }

    public boolean matches(AnkerDominoToken token) {
        for (int i = 0; i < this.fields.length; i++) {
            for (int j = 0; j < this.fields.length; j++) {
                if (this.fields[i].getValue().equals(token.fields[j].getValue())) {
                    return true;
                }

            }

        }
        return false;
    }
}

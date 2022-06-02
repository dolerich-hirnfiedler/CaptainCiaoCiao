package captainciaociao.kapitel02.variablenunddatentypen.aufgabe2_3_3;

public class AnkerDominoTokenFactory {
    public static AnkerDominoToken iniToken() {
        int valueOne = Integer.parseInt(AnkerDominoInput.getInput());
        int valueTwo = Integer.parseInt(AnkerDominoInput.getInput());
        return new AnkerDominoToken(valueOne, valueTwo);
    }
}

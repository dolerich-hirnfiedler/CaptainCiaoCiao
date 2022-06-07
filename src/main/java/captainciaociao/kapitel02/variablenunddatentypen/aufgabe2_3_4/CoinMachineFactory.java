package captainciaociao.kapitel02.variablenunddatentypen.aufgabe2_3_4;

public class CoinMachineFactory {
    public static CoinMachine initCoinMachine() {
        float input = CoinMachineInput.getAmount();
        return new CoinMachine(input);
    }
}

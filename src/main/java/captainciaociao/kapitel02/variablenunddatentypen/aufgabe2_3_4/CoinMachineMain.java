package captainciaociao.kapitel02.variablenunddatentypen.aufgabe2_3_4;

public class CoinMachineMain {
    public static void main(String[] args) {
        Money money = MoneyFactory.initMoney();
        CoinMachine.computeOutput(money);
    }
}

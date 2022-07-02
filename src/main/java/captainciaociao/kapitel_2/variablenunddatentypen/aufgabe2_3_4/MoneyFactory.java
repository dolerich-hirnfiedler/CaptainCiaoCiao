package captainciaociao.kapitel_2.variablenunddatentypen.aufgabe2_3_4;

public class MoneyFactory {
    public static Money initMoney() {
        int amount = CoinMachineInput.getAmount();
        return new Money(amount);
    }
}

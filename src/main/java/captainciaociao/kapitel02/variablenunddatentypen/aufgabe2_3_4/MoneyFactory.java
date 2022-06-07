package captainciaociao.kapitel02.variablenunddatentypen.aufgabe2_3_4;

public class MoneyFactory {
    public static MoneyInCents initMoneyInCents() {
        return new MoneyInCents(MoneyInput.getNextInput());
    }
}

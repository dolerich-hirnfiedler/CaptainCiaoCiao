package captainciaociao.kapitel_2.variablenunddatentypen.aufgabe2_3_2;

import java.util.ArrayList;

public class Loot {
    private ArrayList<Bottle> bottles = new ArrayList<Bottle>();

    private ArrayList<Bottle> generateBottles(int amountBottles) {
        ArrayList<Bottle> bottles = new ArrayList<>();
        for (int i = 0; i < amountBottles; i++) {
            bottles.add(new Bottle());
        }
        return bottles;
    }

    public Loot(int amountBottles) {
        this.bottles = generateBottles(amountBottles);
    }

    public int getLootAmount() {
        return bottles.size();
    }

    public boolean isLootAmountOdd() {
        if (bottles.size() % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }
}

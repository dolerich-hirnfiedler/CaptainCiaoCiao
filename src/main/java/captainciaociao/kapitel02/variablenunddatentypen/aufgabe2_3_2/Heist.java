package captainciaociao.kapitel02.variablenunddatentypen.aufgabe2_3_2;

public class Heist {
    private Crew crew;
    private Loot loot;
    private int captainsShare;
    private int crewsShare;

    public Heist(int crewSize, int lootAmount) {
        this.crew = new Crew(crewSize);
        this.loot = new Loot(lootAmount);
    }

    public void distributeLoot() {
        System.out.printf("Captain CiaoCiao gets %d Bottles%n", captainsShare);
        distributeCrewLoot();
    }

    private void distributeCrewLoot() {
        if (crewsShare % crew.getCrewmembersSize() == 0) {
            System.out.printf("Every Crewmember gets %d Bottles.%n", crewsShare / crew.getCrewmembersSize());
        } else {
            System.out.printf("The remaining loot cannot be shared equally%n");
        }

    }

    public void setShare() {
        if (loot.isLootAmountOdd()) {
            this.captainsShare = (loot.getLootAmount() - 1) / 2;
            this.crewsShare = (loot.getLootAmount() + 1) / 2;
        } else {
            this.captainsShare = loot.getLootAmount() / 2;
            this.crewsShare = loot.getLootAmount() / 2;
        }
    }
}

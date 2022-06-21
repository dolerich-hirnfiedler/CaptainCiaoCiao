package captainciaociao.kapitel_6._4_konstruktoren.aufgabe_3;

public class TreasureChest {
    private int goldDoubloonWeight;
    private int gemstoneWeight;

    public int getGoldDoubloonWeight() {
        return goldDoubloonWeight;
    }

    public int getGemstoneWeight() {
        return gemstoneWeight;
    }

    public static TreasureChest newInstance() {
        return new TreasureChest();
    }

    public static TreasureChest newInstanceWithGoldDoubloonWeight(int weight) {
        TreasureChest returnChest = newInstance();
        returnChest.goldDoubloonWeight = weight;
        return returnChest;
    }

    public static TreasureChest newInstanceWithGemstoneWeight(int weight) {
        TreasureChest returnChest = newInstance();
        returnChest.gemstoneWeight = weight;
        return returnChest;
    }

    public static TreasureChest newInstanceWithGoldDoubloonWeightAndGemstoneWeight(int doubloon, int gemstone) {
        TreasureChest returnChest = newInstance();
        returnChest.goldDoubloonWeight = doubloon;
        returnChest.gemstoneWeight = gemstone;
        return returnChest;
    }

}

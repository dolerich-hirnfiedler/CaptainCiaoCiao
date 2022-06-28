package captainciaociao.kapitel_6._9_schnittstellen.aufgabe_4;

public class DistanceImplementation implements Distance {
    private final int value;

    public DistanceImplementation(int value) {
        this.value = value;
    }

    @Override
    public int meter() {
        return value;
    }

}

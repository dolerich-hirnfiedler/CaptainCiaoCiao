package captainciaociao.kapitel_06._9_schnittstellen.aufgabe_4;

public interface Distance {
    int meter();

    static Distance ofMeter(int value) {
        return new DistanceImplementation(value);
    };

    static Distance ofKilometer(int value) {
        return new DistanceImplementation(value * 1000);
    }

    default int kilometer() {
        return meter() / 1000;
    }
}

package captainciaociao.kapitel_6._2_statische_eigenschaften.aufgabe_2;

public class Tracer {
    private boolean isOn;

    public void trace(String input) {
        if (isOn)
            System.out.printf("%s%n", input);

    }

    public void on() {
        this.isOn = true;
    }

    public void off() {
        this.isOn = false;
    }

}

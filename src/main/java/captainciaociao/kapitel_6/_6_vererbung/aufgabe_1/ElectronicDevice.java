package captainciaociao.kapitel_6._6_vererbung.aufgabe_1;

public class ElectronicDevice {
    private boolean isOn;

    public boolean isOn() {
        return isOn;
    }

    public void on() {
        this.isOn = true;
    }

    public void off() {
        this.isOn = false;
    }
}

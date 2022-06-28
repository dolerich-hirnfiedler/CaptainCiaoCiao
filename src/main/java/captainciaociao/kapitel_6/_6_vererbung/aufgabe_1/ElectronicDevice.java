package captainciaociao.kapitel_6._6_vererbung.aufgabe_1;

public class ElectronicDevice {
    private boolean isOn;
    private int watt;

    @Override
    public String toString() {
        return "ElectronicDevice [isOn=" + isOn + ", watt=" + watt + "]";
    }

    public int getWatt() {
        return watt;
    }

    public void setWatt(int watt) {
        this.watt = watt;
    }

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

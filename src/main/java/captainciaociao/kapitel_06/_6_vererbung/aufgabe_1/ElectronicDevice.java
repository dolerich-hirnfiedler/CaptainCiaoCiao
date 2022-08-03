package captainciaociao.kapitel_06._6_vererbung.aufgabe_1;

import captainciaociao.kapitel_08._3_eigene_ausnahmeklassen_schreiben.aufgabe_1.IllegalWattException;

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

    public void setWatt(int watt) throws IllegalWattException {
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

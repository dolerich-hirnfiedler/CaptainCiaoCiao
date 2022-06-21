package captainciaociao.kapitel_6._5_assoziation.aufgabe_3;

import java.util.ArrayList;

import captainciaociao.kapitel_6._1_objekte_und_klassen.aufgabe_1.Radio;
import captainciaociao.kapitel_6._6_vererbung.aufgabe_1.ElectronicDevice;

public class Ship {
    private ArrayList<ElectronicDevice> electronicDevices = new ArrayList<ElectronicDevice>();

    public ArrayList<ElectronicDevice> getRadios() {
        return electronicDevices;
    }

    public void setRadios(ArrayList<ElectronicDevice> devices) {
        this.electronicDevices = devices;
    }

    public void addRadios(Radio... radios) {
        for (Radio radio : radios) {
            this.electronicDevices.add(radio);
        }

    }

    private void addElectronicDevice(ElectronicDevice device) {
        System.out.printf("schon GEZahlt?%n");
        this.electronicDevices.add(device);
    }

    public void addElectronicDevices(ElectronicDevice... devices) {
        for (ElectronicDevice device : devices) {
            if (device instanceof Radio) {
                Radio radio = (Radio) device;
                if (radio.getVolume() >= 0)
                    this.addElectronicDevice(device);
            }
            this.addElectronicDevice(device);
        }

    }

    public int numberOfRadiosSwitchedOn() {
        int numberOfDevicesSwitchedOn = 0;
        for (ElectronicDevice device : this.electronicDevices) {
            if (device.isOn())
                numberOfDevicesSwitchedOn++;
        }

        return numberOfDevicesSwitchedOn;
    }

    @Override
    public String toString() {
        return "Ship [devices=" + electronicDevices + "]";
    }

}

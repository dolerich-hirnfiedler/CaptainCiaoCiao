package captainciaociao.kapitel_06._5_assoziation.aufgabe_1;

import captainciaociao.kapitel_06._6_vererbung.aufgabe_1.ElectronicDevice;

public class TV extends ElectronicDevice {
    private MonitorTube monitorTube;

    @Override
    public void on() {
        System.out.printf("TV is on...%n");
        this.monitorTube.on();
    }

    @Override
    public void off() {
        System.out.printf("TV is off...%n");
        this.monitorTube.off();
    }
}

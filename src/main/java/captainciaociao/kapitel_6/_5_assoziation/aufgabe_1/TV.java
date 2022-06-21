package captainciaociao.kapitel_6._5_assoziation.aufgabe_1;

public class TV {
    private MonitorTube monitorTube;

    public void on() {
        System.out.printf("TV is on...%n");
        this.monitorTube.on();
    }

    public void off() {
        System.out.printf("TV is off...%n");
        this.monitorTube.off();
    }
}

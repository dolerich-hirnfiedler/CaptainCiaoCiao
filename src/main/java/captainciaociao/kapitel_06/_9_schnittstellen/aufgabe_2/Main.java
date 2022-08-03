package captainciaociao.kapitel_06._9_schnittstellen.aufgabe_2;

import captainciaociao.kapitel_06._1_objekte_und_klassen.aufgabe_1.Radio;
import captainciaociao.kapitel_06._5_assoziation.aufgabe_1.TV;
import captainciaociao.kapitel_06._5_assoziation.aufgabe_3.Ship;

public class Main {
    public static void main(String[] args) {
        Radio grannysRadio = new Radio();
        grannysRadio.volumeUp();
        grannysRadio.setWatt(12_000);

        TV grandpasTv = new TV();
        grandpasTv.setWatt(1000);

        Ship ship = new Ship();
        ship.addElectronicDevices(grandpasTv, grannysRadio);
        System.out.println(ship.findMostPowerConsumingElectronicDevice().getWatt());
    }

}

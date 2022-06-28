package captainciaociao.kapitel_6._9_schnittstellen.aufgabe_1;

import java.util.Comparator;

import captainciaociao.kapitel_6._1_objekte_und_klassen.aufgabe_1.Radio;
import captainciaociao.kapitel_6._6_vererbung.aufgabe_1.ElectronicDevice;

public class Main {
    public static void main(String[] args) {
        ElectronicDevice ea1 = new Radio();
        ea1.setWatt(200);
        ElectronicDevice ea2 = new Radio();
        ea2.setWatt(20);
        Comparator<ElectronicDevice> c = new ElectronicDeviceWattComparator();
        System.out.println(c.compare(ea1, ea2));
        System.out.println(c.compare(ea2, ea1));
    }

}

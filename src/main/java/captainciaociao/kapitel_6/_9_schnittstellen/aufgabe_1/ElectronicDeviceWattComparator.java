package captainciaociao.kapitel_6._9_schnittstellen.aufgabe_1;

import java.util.Comparator;

import captainciaociao.kapitel_6._6_vererbung.aufgabe_1.ElectronicDevice;

public class ElectronicDeviceWattComparator implements Comparator<ElectronicDevice> {

    @Override
    public int compare(ElectronicDevice o1, ElectronicDevice o2) {
        System.out.printf("Compare %s and %s%n", o1.toString(), o2.toString());
        return Integer.compare(o1.getWatt(), o2.getWatt());
    }

}

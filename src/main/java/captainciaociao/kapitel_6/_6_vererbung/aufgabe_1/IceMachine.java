package captainciaociao.kapitel_6._6_vererbung.aufgabe_1;

public class IceMachine extends ElectronicDevice {

    public static int numberOfElectronicDevicesSwqitchedOn(ElectronicDevice... devices) {
        int numberOfElectronicDevicesSwqitchedOn = 0;
        for (ElectronicDevice device : devices) {
            if (device.isOn())
                numberOfElectronicDevicesSwqitchedOn++;
        }

        return numberOfElectronicDevicesSwqitchedOn;
    }
}

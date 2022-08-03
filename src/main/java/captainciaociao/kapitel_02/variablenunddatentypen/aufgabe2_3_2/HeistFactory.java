package captainciaociao.kapitel_02.variablenunddatentypen.aufgabe2_3_2;

public class HeistFactory {

    public static Heist initHeist() {
        int bottles = HeistInput.getAmmountBottles();
        int crewmembers = HeistInput.getAmmountCrewmembers();
        return new Heist(crewmembers, bottles);
    }
}

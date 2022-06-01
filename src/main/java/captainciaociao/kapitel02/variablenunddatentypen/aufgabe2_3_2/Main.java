package captainciaociao.kapitel02.variablenunddatentypen.aufgabe2_3_2;

public class Main {
    public static void main(String[] args) {
        Heist heist = HeistFactory.initHeist();
        heist.setShare();
        heist.distributeLoot();
    }

}

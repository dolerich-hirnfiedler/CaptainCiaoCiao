package captainciaociao.kapitel_6._8_abstraktion.aufgabe_2;

public class FreeDiskTimer {
    public static void main(String[] args) {
        new java.util.Timer().schedule(new FreeDiskTimerTask(), 0, 2000);
    }
}

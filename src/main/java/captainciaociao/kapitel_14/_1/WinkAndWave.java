package captainciaociao.kapitel_14._1;

public class WinkAndWave {
    public static void main(String[] args) {
        Runnable flagWaver = () -> {
            for (int i = 0; i < 50; i++) {
                System.out.printf("Wave flag; %s%n", Thread.currentThread());
            }
        };
        Wink winker = new Wink();
        Thread winkerThread = new Thread(winker);
        Thread waverThread = new Thread(flagWaver);
        winkerThread.start();
        waverThread.start();
    }
}

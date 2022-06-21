package captainciaociao.kapitel_6._8_abstraktion.aufgabe_2;

import java.util.TimerTask;

public class FreeDiskTimerTask extends TimerTask {
    private static final long MINIMAL_FREE_SPACE = 100_000_000_000L;

    @Override
    public void run() {
        long freeDiskSpace = java.io.File.listRoots()[0].getFreeSpace();
        if (freeDiskSpace < MINIMAL_FREE_SPACE) {
            System.out.printf("Device %s has less than %,d%n byte available, %,d byte currently available%n",
                    java.io.File.listRoots()[0], MINIMAL_FREE_SPACE, freeDiskSpace);
        }
    }

}

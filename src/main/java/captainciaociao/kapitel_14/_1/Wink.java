package captainciaociao.kapitel_14._1;

public class Wink implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.printf("Wink; %s%n", Thread.currentThread());
        }
    }
}

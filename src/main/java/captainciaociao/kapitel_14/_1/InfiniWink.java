package captainciaociao.kapitel_14._1;

public class InfiniWink implements Runnable {

    @Override
    public void run() {
        for (;;) {
            System.out.printf("Wink; %s%n", Thread.currentThread());
            if (Thread.currentThread().isInterrupted()) {
                break;
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

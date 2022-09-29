package captainciaociao.kapitel_14._1;

import javax.swing.JOptionPane;

public class BreakingThreadsExercise {
    public static void main(String[] args) {
        Runnable infiniWaver = () -> {
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

        };

        InfiniWink infiniWinker = new InfiniWink();
        infiniWinker.run();
        infiniWaver.run();

        JOptionPane.showInputDialog("endw");
        JOptionPane.showInputDialog("endf");
    }
}

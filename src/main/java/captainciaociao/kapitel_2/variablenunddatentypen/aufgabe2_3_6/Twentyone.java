package captainciaociao.kapitel_2.variablenunddatentypen.aufgabe2_3_6;

public class Twentyone {
    private final int value = 21;
    private int dealer;
    private int player;

    public Twentyone(int dealer, int player) {
        this.dealer = dealer;
        this.player = player;
    }

    public int getValue() {
        return value;
    }

    public int getDealer() {
        return dealer;
    }

    public void setDealer(int dealer) {
        this.dealer = dealer;
    }

    public int getPlayer() {
        return player;
    }

    public void setPlayer(int player) {
        this.player = player;
    }

    public void determineWinner() {
        if (Math.abs(this.value - this.dealer) <= Math.abs(this.value - this.player)) {
            System.out.printf("%d%n", this.dealer);
        } else if (Math.abs(this.value - this.dealer) >= Math.abs(this.value - this.player)) {
            System.out.printf("%d%n", this.player);
        } else {
            System.out.print(0);
        }
    }
}

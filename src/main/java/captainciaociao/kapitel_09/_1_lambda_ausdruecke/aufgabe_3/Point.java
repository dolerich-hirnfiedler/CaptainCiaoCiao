package captainciaociao.kapitel_09._1_lambda_ausdruecke.aufgabe_3;

public class Point {
    private double x;
    private double y;

    // Konstruktor
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getter and Setter
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    // toString
    @Override
    public String toString() {
        return "Point [x=" + x + ", y=" + y + "]";
    }

}

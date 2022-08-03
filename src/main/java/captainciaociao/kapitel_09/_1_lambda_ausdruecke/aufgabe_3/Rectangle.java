package captainciaociao.kapitel_09._1_lambda_ausdruecke.aufgabe_3;

public class Rectangle {
    private double length;
    private double width;

    @Override
    public String toString() {
        return "Rectangle [length=" + length + ", width=" + width + "]";
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

}

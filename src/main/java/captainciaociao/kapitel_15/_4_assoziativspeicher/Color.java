package captainciaociao.kapitel_15._4_assoziativspeicher;

public class Color {
    // 15.4.4 Farben einlesen und vorlesen lassen
    // colors: https://tutego.de/download/colors.csv

    private String name;
    private int rgb;

    /**
     * @param name
     * @param rgb
     */
    public Color(String name, int rgb) {
        this.name = name;
        this.rgb = rgb;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the rgb
     */
    public int getRgb() {
        return rgb;
    }

    /**
     * @param rgb the rgb to set
     */
    public void setRgb(int rgb) {
        this.rgb = rgb;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */

    @Override
    public String toString() {
        return String.format("Color [name=%s, rgb=%s]", name, rgb);
    }



}

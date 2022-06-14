package captainciaociao.kapitel_4._2_eindimensionale_arrays.aufgabe_7;

public class Mountain {
    private int[] altitudes;

    public Mountain(int[] altitudes) {
        this.altitudes = altitudes;
    }

    public int[] getAltitudes() {
        return altitudes;
    }

    public void setAltitudes(int[] altitudes) {
        this.altitudes = altitudes;
    }

    private int getHight() {
        int height = 0;
        for (int i = 0; i < this.altitudes.length; i++) {
            if (height < this.altitudes[i])
                height = this.altitudes[i];
        }
        return height;
    }

    public void print() {
        int[][] raster = new int[getHight() + 1][];
        for (int i = 0; i < raster.length; i++) {
            raster[i] = new int[this.altitudes.length];
        }
        for (int i = 0; i < this.altitudes.length; i++) {
            raster[raster.length - this.altitudes[i]][i] = this.altitudes[i];
        }

    }
}

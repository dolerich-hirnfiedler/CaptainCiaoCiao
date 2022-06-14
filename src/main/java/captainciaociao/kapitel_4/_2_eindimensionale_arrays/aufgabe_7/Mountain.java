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
            for (int j = 0; j < raster[i].length; j++) {
                raster[i][j] = -1;

            }
        }
        for (int i = 0; i < this.altitudes.length; i++) {
            raster[raster.length-1 - this.altitudes[i]][i] = this.altitudes[i];
        }
        for (int i = 0; i < raster.length; i++) {
            for (int j = 0; j < raster[i].length; j++) {
                if (raster[i][j] != -1) {
                    System.out.printf("*");
                }else{
                    System.out.printf(" ");
                }
            }
            System.out.printf("%n");
        }
    }
}

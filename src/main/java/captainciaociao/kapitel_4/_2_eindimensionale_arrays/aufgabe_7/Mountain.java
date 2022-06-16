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
      raster[raster.length - 1 - this.altitudes[i]][i] = this.altitudes[i];
    }
    for (int i = 0; i < raster.length; i++) {
      for (int j = 0; j < raster[i].length; j++) {
        if (raster[i][j] != -1) {
          System.out.printf("*");
        } else {
          System.out.printf(" ");
        }
      }
      System.out.printf("%n");
    }
  }

  // TODO finish the top
  public void print2() {
    String[][] raster = new String[getHight() + 1][];
    for (int i = 0; i < raster.length; i++) {
      raster[i] = new String[this.altitudes.length];
      for (int j = 0; j < raster[i].length; j++) {
        raster[i][j] = " ";
      }
    }
    for (int i = 0; i < this.altitudes.length; i++) {
      if (i < (this.altitudes.length - 1) / 2) {
        if (altitudes[i] == altitudes[i + 1]) {
          raster[raster.length - 1 - this.altitudes[i]][i] = "-";
        } else {
          raster[raster.length - 1 - this.altitudes[i]][i] = "/";
        }
      } else {
        if (altitudes[i] == altitudes[i - 1]) {
          raster[raster.length - 1 - this.altitudes[i]][i] = "-";
        } else {
          raster[raster.length - 1 - this.altitudes[i]][i] = "\\";
        }
      }
    }
    for (int i = 0; i < raster.length; i++) {
      for (int j = 0; j < raster[i].length; j++) {
        System.out.printf("%s", raster[i][j]);
      }
      System.out.printf("%n");
    }
  }
}

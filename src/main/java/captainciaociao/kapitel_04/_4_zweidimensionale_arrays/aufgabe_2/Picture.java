package captainciaociao.kapitel_04._4_zweidimensionale_arrays.aufgabe_2;

public class Picture {
    private int[][] pic;

    public int[][] magnify(int[][] array, int factor) {
        int[][] returnArray = new int[array.length * factor][];
        for (int i = 0; i < returnArray.length; i++) {
            returnArray[i] = new int[array[i % factor].length * factor];
        }
        for (int i = 0; i < returnArray.length; i++) {
            for (int j = 0; j < returnArray[i].length; j++) {
                returnArray[i][j] = array[i / factor][j / factor];
            }
        }
        return returnArray;
    }

    public int[][] getPic() {
        return pic;
    }

    public void setPic(int[][] pic) {
        this.pic = pic;
    }
}

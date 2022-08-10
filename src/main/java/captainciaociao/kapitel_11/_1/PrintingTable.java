package captainciaociao.kapitel_11._1;

public class PrintingTable {
    private String[][] table;

    public PrintingTable(int rows, int columns) {
        this.table = new String[rows][columns];
    }

    public void setHeader(int column, String value) {
        this.table[0][column] = value;
    }

    public void printTable() {
        for (String[] row : this.table) {
            System.out.printf("%n");
            for (String value : row) {
                System.out.printf("%-5s", value);
            }
        }
    }

    public void setValue(int row, int column, String value) {
        this.table[row][column]=value;
    }
}

package captainciaociao.kapitel_11._1;

public class Ascii {
  public static void main(String[] args) {
    int min = 32;
    int max = 127;
    int rows = 16;
    String header = String.format("%s%s", "Dec", "Hex");
    for (int i = min; i < rows + min; i++) {
      // System.out.printf("%d %X %c %n", i, i, i);
    }
    PrintingTable table = new PrintingTable(17, 3);
    table.setHeader(0, "Dec");
    table.setHeader(1, "Hex");
    table.setHeader(2, "Sym");
    table.printTable();
  }
}

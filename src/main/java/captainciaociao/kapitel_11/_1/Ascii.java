package captainciaociao.kapitel_11._1;

public class Ascii {
  public static PrintingTable generateAsciiTable() {
    PrintingTable table = new PrintingTable(17, 3);
    table.setHeader(0, "Dec");
    table.setHeader(1, "Hex");
    table.setHeader(2, "Sym");
    return table;
  }

  public static void main(String[] args) {
    int min = 32;
    int rows = 16;
    System.out.printf(
        "%s%n", String.format("%-4s%-4s%-4s", "Dec", "Hex", "  ").repeat(6));
    for (int row = 0; row < 16; row++) {
      for (int asciiCode = 32 + row; asciiCode < 128; asciiCode += 16) {
        System.out.printf("%1$-4d%1$-4X%2$-4s", asciiCode,
                          asciiCode == 127 ? "DEL"
                                           : Character.toString(asciiCode));
      }
      System.out.printf("%n");
    }
    // for (int i = 0; i < rows; i++) {
    //   // for (int j = 0; j < 18; j++) {
    //   //   switch (j % 3) {
    //   //   case 0:
    //   //     System.out.printf("%-4d", i + min + j);
    //   //   case 1:
    //   //     System.out.printf("%-4X", i + min + j);
    //   //   case 2:
    //   //     System.out.printf("%-4c", i + min + j);
    //   //   }
    //   // }
    //   // System.out.printf("%n");

    //   System.out.printf(
    //       "%s%s%s%s%s%s%n",
    //       String.format("%-4d%-4X%-4c", i + min, i + min, i + min),
    //       String.format("%-4d%-4X%-4c", i + min + rows, i + min + rows,
    //                     i + min + rows),
    //       String.format("%-4d%-4X%-4c", i + min + rows * 2, i + min + rows *
    //       2,
    //                     i + min + rows * 2),
    //       String.format("%-4d%-4X%-4c", i + min + rows * 3, i + min + rows *
    //       3,
    //                     i + min + rows * 3),
    //       String.format("%-4d%-4X%-4c", i + min + rows * 4, i + min + rows *
    //       4,
    //                     i + min + rows * 4),
    //       String.format("%-4d%-4X%-4c", i + min + rows * 5, i + min + rows *
    //       5,
    //                     i + min + rows * 5));

    // System.out.printf("%n");

    // for (int j = 0; j < 18; j++) {
    // if (i % 17 == 0) {
    // switch (j % 3) {
    // case 0:
    // System.out.printf("%-4s", "Dec");
    // case 1:
    // System.out.printf("%-4s", "Hex");
    // case 2:
    // System.out.printf("%-4s", " ");
    // }
    // } else {
    // switch (j % 3) {
    // case 0:
    // System.out.printf(" %-4d", i + j + min - 1);
    // case 1:
    // System.out.printf("%X", i + j + min - 1);
    // case 2:
    // System.out.printf("%-4c", i + j + min - 1);
    // }
    // }
    // }
  }
  // for (int i = 0; i < 17; i++) {
  // System.out.printf("%d modulo 17: %d%n", i, i % 17);
  // }
  // int min = 32;
  // int max = 127;
  // int rows = 16;
  // for (int i = min; i < rows + min; i++) {
  // // System.out.printf("%d %X %c %n", i, i, i);
  // }

  // PrintingTable tableFrom32To47 = generateAsciiTable();
  // fillTableWithAsciiValues(min, rows, tableFrom32To47);
  // tableFrom32To47.printTable();

  // PrintingTable tableFrom48To63 = generateAsciiTable();
  // fillTableWithAsciiValues(48, rows, tableFrom48To63);
  // tableFrom48To63.printTable();
  // }
  // private static void fillTableWithAsciiValues(int min, int rows,
  // PrintingTable table) {
  // for (int i = 0; i < rows; i++) {
  // table.setValue(i + 1, 0, String.format("%d", i + min));
  // table.setValue(i + 1, 1, String.format("%X", i + min));
  // table.setValue(i + 1, 2, String.format("%c", i + min));
  // }
}

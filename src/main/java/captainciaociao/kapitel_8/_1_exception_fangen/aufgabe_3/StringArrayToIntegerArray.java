package captainciaociao.kapitel_8._1_exception_fangen.aufgabe_3;

public class StringArrayToIntegerArray {
  static int[] parseInts(String... numbers) {
    int[] returnArray = new int[numbers.length];
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i].matches("[0-9]+")) {
        returnArray[i] = Integer.parseInt(numbers[i]);
      } else {
        returnArray[i] = 0;
      }
    }
    return returnArray;
  }
}

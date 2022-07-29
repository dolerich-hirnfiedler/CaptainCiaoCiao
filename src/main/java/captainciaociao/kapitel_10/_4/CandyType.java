package captainciaociao.kapitel_10._4;

import java.util.Optional;

public enum CandyType {
  CARAMELS(9),
  CHOCOLATE(5),
  GUMMIES(4),
  LICORICE(3),
  LOLLIPOPS(2),
  CHEWING_GUMS(3),
  COTTON_CANDY(1);

  private CandyType() {}

  static Optional<CandyType> fromName(String input) {
    try {
      input = input.trim().toUpperCase().replaceAll(" ", "_");
      return Optional.of(valueOf(input));

    } catch (IllegalArgumentException e) {
      return Optional.empty();
    }
  }

  public static CandyType random() {
    return values()[(int)(Math.random() * values().length)];
    // int random = (int) (Math.random() * 7);
    // switch (random) {
    // case 0:
    // return CARAMELS;
    // case 1:
    // return CHOCOLATE;
    // case 2:
    // return GUMMIES;
    // case 3:
    // return LICORICE;
    // case 4:
    // return LOLLIPOPS;
    // case 5:
    // return CHEWING_GUMS;
    // case 6:
    // return COTTON_CANDY;
    // }
    // return null;
  }

  public static void main(String[] args) {
    System.out.print(CandyType.random());
  }
}

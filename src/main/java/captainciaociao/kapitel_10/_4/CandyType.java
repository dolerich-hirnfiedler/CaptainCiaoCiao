package captainciaociao.kapitel_10._4;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Random;

public enum CandyType {

  CARAMELS(9), CHOCOLATE(5), GUMMIES(4), LICORICE(3), LOLLIPOPS(2), CHEWING_GUMS(3), COTTON_CANDY(1);

  private final int addictiveQuality;

  private static final int MAXIMUM_ADDICTIVENESS = 1000;
  private static final Random RANDOM = new Random();

  private CandyType(int addictiveQuality) {
    this.addictiveQuality = addictiveQuality;
  }

  static Optional<CandyType> fromName(String input) {
    try {
      input = input.trim().toUpperCase().replaceAll(" ", "_");
      return Optional.of(valueOf(input));

    } catch (IllegalArgumentException e) {
      return Optional.empty();
    }
  }

  public int getAddictiveQuality() {
    return addictiveQuality;
  }

  /**
   * Is there to get the minimum difference for the next() Method. If the step
   *
   */
  private int getMinDifference(CandyType candytype) {
    int min = -MAXIMUM_ADDICTIVENESS;
    for (int i = 0; i < values().length; i++) {
      if (values()[i].getAddictiveQuality() > candytype.getAddictiveQuality()) {
        min = (values()[i].addictiveQuality - candytype.addictiveQuality < Math.abs(min))
            ? values()[i].addictiveQuality - candytype.addictiveQuality
            : min;
      }
    }
    if (min <= 0) {
      return 0;
    } else {
      return min;
    }
  }

  public CandyType next() {
    int minDiff = getMinDifference(this);
    ArrayList<CandyType> solutions = new ArrayList<>();
    for (int i = 0; i < values().length; i++) {
      if (values()[i].getAddictiveQuality() - this.getAddictiveQuality() == minDiff) {
        solutions.add(values()[i]);
      }
    }
    return solutions.get((int) (RANDOM.nextInt(solutions.size())));
    // Second Idea
    // for (int i = 1; i < values().length; i++) {
    // if (values()[i].getAddictiveQuality() > this.getAddictiveQuality()) {
    // if (values()[i].getAddictiveQuality() <
    // tempType.getAddictiveQuality()) {
    // tempType = values()[i];
    // }
    // }
    //
    // First Idea
    // if (Math.abs(this.addictiveQuality() - values()[i].addictiveQuality())
    // >=
    // 1 &&
    // Math.abs(this.addictiveQuality() - values()[i].addictiveQuality())
    // <=
    // Math.abs(this.addictiveQuality() -
    // values()[i + 1].addictiveQuality())) {
    // returnType = values()[i];
    // } else {
    // returnType = values()[i + 1];
    // }
    // }
  }

  public static CandyType random() {
    return values()[(int) (RANDOM.nextInt(values().length))];
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
    CandyType type = CandyType.random();
    System.out.println(type);
    System.out.println("Next higher");
    System.out.println(type.next());
  }
}

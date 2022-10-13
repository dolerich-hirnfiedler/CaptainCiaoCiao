package captainciaociao.kapitel_12._2;

import java.math.BigInteger;

public class Fraction extends Number implements Comparable<Fraction> {

  public final int numerator;
  public final int denominator;

  // Help methods
  private static int[] reduce(int numerator, int denominator) {
    BigInteger numeratorBigInt =
        new BigInteger(Integer.valueOf(numerator).toString());
    BigInteger denominatorBigInt =
        new BigInteger((Integer.valueOf(denominator).toString()));
    BigInteger gcd = numeratorBigInt.gcd(denominatorBigInt);
    int[] returnValue = new int[2];

    while (!gcd.equals(BigInteger.ONE)) {
      numeratorBigInt = numeratorBigInt.divide(gcd);
      denominatorBigInt = denominatorBigInt.divide(gcd);
      gcd = numeratorBigInt.gcd(denominatorBigInt);
    }
    returnValue[0] = Integer.parseInt(numeratorBigInt.toString());
    returnValue[1] = Integer.parseInt(denominatorBigInt.toString());
    return returnValue;
  }

  private static Fraction reciprocal(Fraction fraction) {
    return new Fraction(fraction.numerator, fraction.denominator);
  }

  private static int[] computeSign(int numerator, int denominator) {
    boolean isNumGreaterZero = (numerator >= 0);
    boolean isDenGreaterZero = (denominator >= 0);
    int[] returnValue = {numerator, denominator};
    if (!isDenGreaterZero && isNumGreaterZero) {
      returnValue[0] = -numerator;
      returnValue[1] = -denominator;
    }
    if (!isDenGreaterZero && !isNumGreaterZero) {
      returnValue[0] = -numerator;
      returnValue[1] = -denominator;
    }

    return returnValue;
  }

  /**
   * @param numerator
   * @param denominator
   */
  public Fraction(int numerator, int denominator) {
    if (denominator == 0) {
      throw new IllegalArgumentException("value of denominator cant be 0");
    }
    int[] values = reduce(numerator, denominator);
    values = computeSign(values[0], values[1]);
    this.numerator = values[0];
    this.denominator = values[1];
  }

  // Fraction operations

  public Fraction add(Fraction fraction) {
    return new Fraction(this.numerator + fraction.numerator,
                        this.denominator + fraction.denominator);
  }

  public Fraction substract(Fraction fraction) {
    return new Fraction(this.numerator - fraction.numerator,
                        this.denominator - fraction.denominator);
  }

  public Fraction multiply(Fraction fraction) {
    return new Fraction(
        Math.multiplyExact(this.numerator, fraction.numerator),
        Math.multiplyExact(this.denominator, fraction.denominator));
  }

  public Fraction divide(Fraction fraction) {
    return this.multiply(reciprocal(fraction));
  }

  /**
   *
   * @param numerator
   */
  public Fraction(int numerator) {
    this.numerator = numerator;
    this.denominator = 1;
  }

  @Override
  public int intValue() {
    return (int)this.numerator / this.denominator;
  }

  @Override
  public long longValue() {
    return (long)this.numerator / this.denominator;
  }

  @Override
  public float floatValue() {
    return (float)this.numerator / this.denominator;
  }

  @Override
  public double doubleValue() {
    return this.numerator / this.denominator;
  }

  /*
   * (non-Javadoc)
   *
   * @see java.lang.Object#toString()
   */

  @Override
  public String toString() {
    if (this.numerator == 0)
      return "0";
    if (this.denominator == 1)
      return "" + this.denominator;
    return String.format("%d/%d", numerator, denominator);
  }

  @Override
  public int compareTo(Fraction o) {
    Double first = Double.valueOf(this.numerator / this.denominator);
    Double second = Double.valueOf(o.numerator / o.denominator);
    return first.compareTo(second);
  }

  /*
   * (non-Javadoc)
   *
   * @see java.lang.Object#hashCode()
   */

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + denominator;
    result = prime * result + numerator;
    return result;
  }

  /*
   * (non-Javadoc)
   *
   * @see java.lang.Object#equals(java.lang.Object)
   */

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Fraction other = (Fraction)obj;
    if (denominator != other.denominator)
      return false;
    if (numerator != other.numerator)
      return false;
    return true;
  }
}

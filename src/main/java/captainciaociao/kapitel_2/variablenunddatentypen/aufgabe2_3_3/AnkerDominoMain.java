package captainciaociao.kapitel_2.variablenunddatentypen.aufgabe2_3_3;

public class AnkerDominoMain {
  public static void main(String[] args) {
    AnkerDominoToken firstToken = AnkerDominoTokenFactory.iniToken();
    AnkerDominoToken secondToken = AnkerDominoTokenFactory.iniToken();

    if (firstToken.matches(secondToken)) {
      System.out.printf("Tokens share number%n");
    } else {
      System.out.printf("Tokens dont share nummbers%n");
    }
  }
}

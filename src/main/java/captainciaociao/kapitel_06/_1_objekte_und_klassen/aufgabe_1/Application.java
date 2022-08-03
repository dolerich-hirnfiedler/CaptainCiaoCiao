package captainciaociao.kapitel_06._1_objekte_und_klassen.aufgabe_1;

import captainciaociao.kapitel_06._5_assoziation.aufgabe_1.TV;

public class Application {

  public static void main(String[] args) {

    Radio radio = new Radio();
    TV television = new TV();
    System.out.printf("%s%n", radio.toString());
    television.on();
    television.off();
  }
}

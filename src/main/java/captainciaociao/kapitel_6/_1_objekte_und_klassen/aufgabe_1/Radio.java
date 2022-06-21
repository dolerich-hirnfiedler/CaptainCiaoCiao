package captainciaociao.kapitel_6._1_objekte_und_klassen.aufgabe_1;

import captainciaociao.kapitel_6._3_aufzaehlunngen.aufgabe_1.Modulation;
import captainciaociao.kapitel_6._6_vererbung.aufgabe_1.ElectronicDevice;

public class Radio extends ElectronicDevice {
  private int Volume;
  private double frequency;
  private double minFrequency;
  private double maxFrequency;
  private Modulation modulation;

  // Constructor
  public Radio(int volume, double frequency) {
    Volume = volume;
    this.frequency = frequency;
  }

  public Radio() {
    this(0, 90);
  }

  // Getter and setter
  public Modulation getModulation() {
    return modulation;
  }

  public void setModulation(Modulation modulation) {
    switch (modulation) {
      case AM:
        this.minFrequency = 0.1485;
        this.maxFrequency = 26.1;
      case FM:
        this.minFrequency = 87.5;
        this.maxFrequency = 108.0;

    }
    this.modulation = modulation;
  }

  public Radio(String station) {
    this(0, stationNameToString(station));
  }

  public Radio(Radio radio) {
    this(radio.getVolume(), radio.getFrequency());
  }

  public double getFrequency() {
    return frequency;
  }

  public void setFrequency(double frequency) {
    this.frequency = frequency;
  }

  public int getVolume() {
    return Volume;
  }

  public void setVolume(int volume) {
    Volume = volume;
  }

  @Override
  public String toString() {
    return "Radio [Volume=" + Volume + ", frequency=" + frequency + ", maxFrequency=" + maxFrequency + ", minFrequency="
        + minFrequency + ", modulation=" + modulation + "]";
  }

  public void volumeUp() {
    this.Volume++;
  }

  public void volumeDown() {
    this.Volume--;
  }

  public static double stationNameToString(String input) {
    if (input.equals("Walking the plank"))
      return 98.3;
    return 0.0;
  }

}

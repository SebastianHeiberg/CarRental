package com.company;

public class Benzinbil extends Bil {
  private int oktantal;
  private int kmPrL;

  public Benzinbil(int regNr, String model, String mærke, int årstal, int antalDøre, int oktantal, int kmPrL) {
    super(regNr, model, mærke, årstal, antalDøre);
    this.oktantal = oktantal;
    this.kmPrL = kmPrL;
  }

  public int getOktantal() {
    return oktantal;
  }

  public void setOktantal(int oktantal) {
    this.oktantal = oktantal;
  }

  public int getKmPrL() {
    return kmPrL;
  }

  public void setKmPrL(int kmPrL) {
    this.kmPrL = kmPrL;
  }

  @Override
  public String toString() {
    return "Benzinbil, " +
        "regNr = " + regNr +
        ", mærke = " + mærke + '\'' +
        ", model = " + model + '\'' +
        ", årstal = " + årstal +
        ", antalDøre = " + antalDøre + ", oktantal = " + oktantal + ", kmPrL = " + kmPrL;
  }
}

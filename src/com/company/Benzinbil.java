package com.company;

public class Benzinbil extends Bil {
  private int oktantal;
  private int kmPrL;

  public Benzinbil(int regNr, String model, String mærke, int årstal, int antalDøre, int oktantal, int kmPrL) {
    super(regNr, model, mærke, årstal, antalDøre);
    this.oktantal = oktantal;
    this.kmPrL = kmPrL;
  }

  @Override
  public double beregnGrønEjerafgift() {
    if (kmPrL < 5) {
      return 10470;
    } else if (kmPrL > 5 && kmPrL < 10) {
      return 5500 ;
    } else if (kmPrL > 10 && kmPrL < 15) {
      return 2340 ;
    } else if (kmPrL > 15 && kmPrL < 20) {
      return 1050 ;
    } else {
      return 330;
    }
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

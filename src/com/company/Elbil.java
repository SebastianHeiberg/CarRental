package com.company;

public class Elbil extends Bil{
  private int batterikapacitetKWH;
  private int maxKm;
  private int whPrKm;

  public Elbil(int regNr,String model, String mærke, int årstal, int antalDøre, int maxKm, int whPrKm) {
    super(regNr, model, mærke, årstal, antalDøre);
    this.maxKm = maxKm;
    this.whPrKm = whPrKm;
  }

  @Override
  public double beregnGrønEjerafgift() {
    double kmPrL = 100 / (whPrKm/91.25);

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

  public int getBatterikapacitetKWH() {
    return batterikapacitetKWH;
  }

  public void setBatterikapacitetKWH(int batterikapacitetKWH) {
    this.batterikapacitetKWH = batterikapacitetKWH;
  }

  public int getMaxKm() {
    return maxKm;
  }

  public void setMaxKm(int maxKm) {
    this.maxKm = maxKm;
  }

  public int getWhPrKm() {
    return whPrKm;
  }

  public void setWhPrKm(int whPrKm) {
    this.whPrKm = whPrKm;
  }

  @Override
  public String toString() {
    return "Elbil, " +
        "regNr = " + regNr +
        ", mærke = " + mærke + '\'' +
        ", model = " + model + '\'' +
        ", årstal = " + årstal +
        ", antalDøre = " + antalDøre + ", batterikapacitetKWH = " + batterikapacitetKWH + ", maxKm = " + maxKm + ", whPrKm = "+ whPrKm;
  }
}


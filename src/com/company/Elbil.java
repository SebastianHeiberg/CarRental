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


package com.company;

public class Dieselbil extends Bil {
private boolean harPartikelfilter;
private int kmPrL;

public Dieselbil (int regNr,String model, String mærke, int årstal, int antalDøre, boolean harPartikelfilter, int kmPrL){
  super(regNr, model, mærke, årstal, antalDøre);
  this.harPartikelfilter = harPartikelfilter;
  this.kmPrL = kmPrL;
}

  public boolean isHarPartikelfilter() {
    return harPartikelfilter;
  }

  public void setHarPartikelfilter(boolean harPartikelfilter) {
    this.harPartikelfilter = harPartikelfilter;
  }

  public int getKmPrL() {
    return kmPrL;
  }

  public void setKmPrL(int kmPrL) {
    this.kmPrL = kmPrL;
  }

  @Override
  public String toString() {
    return "Dieselbil, " +
        "regNr = " + regNr +
        ", mærke = " + mærke + '\'' +
        ", model = " + model + '\'' +
        ", årstal = " + årstal +
        ", antalDøre = " + antalDøre + ", har partikelfilter = " + harPartikelfilter + ", kmPrL = " + kmPrL;
  }
}




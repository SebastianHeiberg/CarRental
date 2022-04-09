package com.company;

public class Dieselbil extends Bil {
private boolean harPartikelfilter;
private int kmPrL;

public Dieselbil (int regNr,String model, String mærke, int årstal, int antalDøre, boolean harPartikelfilter, int kmPrL){
  super(regNr, model, mærke, årstal, antalDøre);
  this.harPartikelfilter = harPartikelfilter;
  this.kmPrL = kmPrL;
}

  @Override
  public double beregnGrønEjerafgift() {
  double samletAfgift = 0;

  if (!harPartikelfilter){
    samletAfgift += 1000;
  }

    if (kmPrL < 5) {
      samletAfgift += 15260;
    } else if (kmPrL > 5 && kmPrL < 10) {
      samletAfgift += 2770 ;
    } else if (kmPrL > 10 && kmPrL < 15) {
      samletAfgift += 1850 ;
    } else if (kmPrL > 15 && kmPrL < 20) {
      samletAfgift += 1390 ;
    } else {
      samletAfgift += 130;
    }
    return samletAfgift;
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




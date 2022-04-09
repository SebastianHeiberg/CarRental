package com.company;

public abstract class Bil {
  protected int regNr;
  protected String mærke;
  protected String model;
  protected int årstal;
  protected int antalDøre;

  public Bil (int regNr,String model, String mærke, int årstal, int antalDøre){
    this.regNr = regNr;
    this.model = model;
    this.mærke = mærke;
    this.årstal = årstal;
    this.antalDøre = antalDøre;
  }

  public abstract double beregnGrønEjerafgift();


  public int getRegNr() {
    return regNr;
  }

  public void setRegNr(int regNr) {
    this.regNr = regNr;
  }

  public String getMærke() {
    return mærke;
  }

  public void setMærke(String mærke) {
    this.mærke = mærke;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public int getÅrstal() {
    return årstal;
  }

  public void setÅrstal(int årstal) {
    this.årstal = årstal;
  }

  public int getAntalDøre() {
    return antalDøre;
  }

  public void setAntalDøre(int antalDøre) {
    this.antalDøre = antalDøre;
  }

  @Override
  public String toString() {
    return "Bil{" +
        "regNr=" + regNr +
        ", mærke='" + mærke + '\'' +
        ", model='" + model + '\'' +
        ", årstal=" + årstal +
        ", antalDøre=" + antalDøre +
        '}';
  }
}

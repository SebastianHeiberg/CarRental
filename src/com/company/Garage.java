package com.company;

import java.util.ArrayList;

public class Garage {

  private ArrayList<Bil> garage;

  public Garage (){
    this.garage = new ArrayList<>();
  }

  public void addCarToGarage (Bil nyBil) {
    garage.add(nyBil);
  }

  public double beregnGrønAfgiftForBilpark() {
    double samletAfgiftForBilpark = 0;
    for (Bil bil:garage) {
      samletAfgiftForBilpark += bil.beregnGrønEjerafgift();
    }
  return samletAfgiftForBilpark;
  }

  @Override
  public String toString() {
    return "Garagen indeholder: " + garage;
  }
}

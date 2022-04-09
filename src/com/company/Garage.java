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

  @Override
  public String toString() {
    return "Garagen indeholder: " + garage;
  }
}

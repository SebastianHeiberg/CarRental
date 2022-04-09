package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Garage garagen = new Garage();
    Benzinbil benzinbil1 = new Benzinbil(111,"Ford","Humvee",2020,4,35,20);
    Elbil elbil1 = new Elbil(222,"T4","Tesla",2016,2,300,44);
    Dieselbil dieselbil1 = new Dieselbil(333,"Bæstet","Toyota",2000,4,false,5);

    garagen.addCarToGarage(benzinbil1);
    garagen.addCarToGarage(elbil1);
    garagen.addCarToGarage(dieselbil1);

    System.out.println(garagen);
    }
}

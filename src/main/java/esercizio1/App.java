/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio1;

/**
 *
 * @author User
 */
public class App {

    final static int limiteGarage = 15;

    public static void main(String[] args) {

        Veicolo Lista[] = new Veicolo[limiteGarage];

        Auto mia = new Auto(5, 0, 1000, 2018, "bmw", Auto.Alimentazione.Benzina);
        Lista[0] = mia;

        System.out.println();
    }
}

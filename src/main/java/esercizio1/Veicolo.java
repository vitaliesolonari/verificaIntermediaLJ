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
public class Veicolo {

    /*
    Si realizzi una applicazione java per la gestione di un garage secondo le
specifiche:
il garage ha al max 15 posti ognuno dei quali è identificato da un num a partire
da 0 e per motivi di capienza può ospitare solo auto moto e furgoni partendo
dalla classe base veicolo a motore V; la si estenda, realizzando anche le classi
che modellano le entità furgone (F) auto (A) e moto (M).
Ridefinire il metodo toString in modo che ogni entità possa esternalizzare in
forma di stringa tutte le informazioni che la riguardano.
Si implementi una classe che modelli il garage sopradescritto offrendo le
seguenti operazioni di gestione
1] immissione di un nuovo veicolo
2] estrazione dal garage del veicolo che occupa un determinato posto (ritornare
l'istanza del veicolo stesso)
3] stampa della situazione corrente dei posti nel garage veicolo:
marca,anno,cilindrata;
auto:porte, alimentazione (diesel/benzina)
moto:tempi
furgone:capacità
     */
    protected int id, cil, anno;
    protected String marca;

    public Veicolo(int id, int cil, int anno, String marca) {
        this.id = id;
        this.cil = cil;
        this.anno = anno;
        this.marca = marca;
    }

}

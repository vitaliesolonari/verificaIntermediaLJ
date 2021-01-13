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
public class Furgone extends Veicolo {

    private int capacita;

    public Furgone(int capacita, int id, int cil, int anno, String marca) {
        super(id, cil, anno, marca);
        this.capacita = capacita;
    }

    public int getCapacita() {
        return capacita;
    }

    public String getMarca() {
        return marca;
    }

    public int getId() {
        return id;
    }

    public int getCil() {
        return cil;
    }

    public int getAnno() {
        return anno;
    }

    public String infoVeicolo() {
        String ris = "posto: " + getId() + "; marca: " + getMarca() + "; anno: " + getAnno() + "; cilindrata: " + getCil() + "; capacità: " + getCapacita();
        return ris;
    }
}

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
public class Auto extends Veicolo {

    public static enum Alimentazione {
        Benzina, Gasolio
    };
    private Alimentazione alimentazione;
    private int porte;

    public Auto(int porte, int id, int cil, int anno, String marca, Alimentazione alimentazione) {
        super(id, cil, anno, marca);
        this.alimentazione = alimentazione;
        this.porte = porte;
    }

    public int getPorte() {
        return porte;
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

    public Alimentazione getAlimentazione() {
        return alimentazione;
    }

    public String infoVeicolo() {
        String ris = "posto: " + getId() + "; marca: " + getMarca() + "; anno: " + getAnno() + "; cilindrata: " + getCil() + "; porte:  " + getPorte() + "; alimentazione: " + getAlimentazione();
        return ris;
    }
}

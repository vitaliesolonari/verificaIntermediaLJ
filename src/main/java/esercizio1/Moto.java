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
public class Moto extends Veicolo {
    private int tempi;

    public Moto(int tempi, int id, int cil, int anno, String marca) {
        super(id, cil, anno, marca);
        this.tempi = tempi;
    }

  

    public int getTempi() {
        return tempi;
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
        String ris = "posto: " + getId() + "; marca: " + getMarca() + "; anno: " + getAnno() + "; cilindrata: " + getCil() + "; tempi: " + getTempi();
        return ris;
    }
}

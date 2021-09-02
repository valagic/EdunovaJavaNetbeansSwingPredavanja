/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polaznik24.vjezbanjemapiranje.osnovno;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author valagic
 */
@Entity
public class Racunalo {
    
    @Id
    private int sifra;
    private String naziv;
    private String boja;

    public int getSifra() {
        return sifra;
    }

    public void setSifra(int sifra) {
        this.sifra = sifra;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getBoja() {
        return boja;
    }

    public void setBoja(String boja) {
        this.boja = boja;
    }
    
    
}

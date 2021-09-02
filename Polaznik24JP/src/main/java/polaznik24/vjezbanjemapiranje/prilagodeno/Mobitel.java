/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polaznik24.vjezbanjemapiranje.prilagodeno;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author valagic
 */
@Entity(name = "Phones")
public class Mobitel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sifra;
    
    @Column(name = "imeMobitela")
    private String naziv;
    private String boja;

    public Long getSifra() {
        return sifra;
    }

    public void setSifra(Long sifra) {
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

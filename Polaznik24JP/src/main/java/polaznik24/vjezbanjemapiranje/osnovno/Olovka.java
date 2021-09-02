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
public class Olovka {
    
    @Id
    private int id;
    private String boja;
    private String model;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBoja() {
        return boja;
    }

    public void setBoja(String boja) {
        this.boja = boja;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.location;

import java.util.List;

/**
 *
 * @author hiepnguyen
 */
public class Ward {
    private int id;
    private String name;
    private List<Village> villages;

    public Ward() {
    }

    public Ward(int id, String name, List<Village> villages) {
        this.id = id;
        this.name = name;
        this.villages = villages;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Village> getVillages() {
        return villages;
    }

    public void setVillages(List<Village> villages) {
        this.villages = villages;
    }
    
    
}

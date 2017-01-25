/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipeAdventures.model;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author denisegoetz
 */
public class World  implements Serializable{
    
    //class instance variables
    private List countries;

    public List getCountries() {
        return countries;
    }

    public void setCountries(List countries) {
        this.countries = countries;
    }

    public World() {
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.countries);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final World other = (World) obj;
        if (!Objects.equals(this.countries, other.countries)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "World{" + "countries=" + countries + '}';
    }
    
    

    
}

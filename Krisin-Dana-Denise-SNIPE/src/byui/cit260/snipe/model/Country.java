/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.model;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author denisegoetz
 */
public class Country implements Serializable{
    
    //class instance variables
    private List country;
    private String entryPointCode;
    private String entryPointDesc;

    public List getCountry() {
        return country;
    }

    public void setCountry(List country) {
        this.country = country;
    }

    public String getEntryPointCode() {
        return entryPointCode;
    }

    public void setEntryPointCode(String entryPointCode) {
        this.entryPointCode = entryPointCode;
    }

    public String getEntryPointDesc() {
        return entryPointDesc;
    }

    public void setEntryPointDesc(String entryPointDesc) {
        this.entryPointDesc = entryPointDesc;
    }

    public Country() {
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.country);
        hash = 53 * hash + Objects.hashCode(this.entryPointCode);
        hash = 53 * hash + Objects.hashCode(this.entryPointDesc);
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
        final Country other = (Country) obj;
        if (!Objects.equals(this.entryPointCode, other.entryPointCode)) {
            return false;
        }
        if (!Objects.equals(this.entryPointDesc, other.entryPointDesc)) {
            return false;
        }
        if (!Objects.equals(this.country, other.country)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Countries{" + "country=" + country + ", entryPointCode=" + entryPointCode + ", entryPointDesc=" + entryPointDesc + '}';
    }
    
    

    
}
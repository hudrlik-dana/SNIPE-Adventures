/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.snipe.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author aingealfire@gmail.com (new16014@byui.edu)
 */
public class CypherComplete implements Serializable {
    
    //Class instance variables
    private String codePhrase;
    private String codeDecoder;

    public String getCodePhrase() {
        return codePhrase;
    }

    public void setCodePhrase(String codePhrase) {
        this.codePhrase = codePhrase;
    }

    public String getCodeDecoder() {
        return codeDecoder;
    }

    public void setCodeDecoder(String codeDecoder) {
        this.codeDecoder = codeDecoder;
    }

    public CypherComplete() {
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.codePhrase);
        hash = 59 * hash + Objects.hashCode(this.codeDecoder);
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
        final CypherComplete other = (CypherComplete) obj;
        if (!Objects.equals(this.codePhrase, other.codePhrase)) {
            return false;
        }
        if (!Objects.equals(this.codeDecoder, other.codeDecoder)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CypherComplete{" + "codePhrase=" + codePhrase + ", codeDecoder=" + codeDecoder + '}';
    }
    
    
    

}

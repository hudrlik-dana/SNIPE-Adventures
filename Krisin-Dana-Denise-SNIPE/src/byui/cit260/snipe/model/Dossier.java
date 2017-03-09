/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.model;

import java.io.Serializable;

/**
 *
 * @author aingealfire@gmail.com (new16014@byui.edu)
 */
public enum Dossier implements Serializable {

USA(""),
GERMANY(""),
ENGLAND(""),
SPAIN(""),
RUSSIA(""),
FRANCE(""),
CANADA(""),
BRAZIL(""),
AUSTRALIA("");

//class instance variables
    private final String countryCode;
    private final String hints;

    public String getCountryCode() {
        return countryCode;
    }

    public String getHints() {
        return hints;
    }

    Dossier(String hints) {
        this.hints = hints;
        countryCode = new String();
    }

       

    @Override
    public String toString() {
        return "Dossier{" + "countryCode=" + countryCode + ", hints=" + hints + '}';
    }

}

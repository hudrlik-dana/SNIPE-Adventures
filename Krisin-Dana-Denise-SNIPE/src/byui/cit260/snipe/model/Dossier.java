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
public class Dossier implements Serializable {

    //class instance variables
    private String countryCode;
    private String challengeChoices;
    private String hints;
    private String countryVis;

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getChallengeChoices() {
        return challengeChoices;
    }

    public void setChallengeChoices(String challengeChoices) {
        this.challengeChoices = challengeChoices;
    }

    public String getHints() {
        return hints;
    }

    public void setHints(String hints) {
        this.hints = hints;
    }

    public String getCountryVis() {
        return countryVis;
    }

    public void setCountryVis(String countryVis) {
        this.countryVis = countryVis;
    }

    public Dossier() {
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 73 * hash + Objects.hashCode(this.countryCode);
        hash = 73 * hash + Objects.hashCode(this.challengeChoices);
        hash = 73 * hash + Objects.hashCode(this.hints);
        hash = 73 * hash + Objects.hashCode(this.countryVis);
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
        final Dossier other = (Dossier) obj;
        if (!Objects.equals(this.countryCode, other.countryCode)) {
            return false;
        }
        if (!Objects.equals(this.challengeChoices, other.challengeChoices)) {
            return false;
        }
        if (!Objects.equals(this.hints, other.hints)) {
            return false;
        }
        if (!Objects.equals(this.countryVis, other.countryVis)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Dossier{" + "countryCode=" + countryCode + ", challengeChoices=" + challengeChoices + ", hints=" + hints + ", countryVis=" + countryVis + '}';
    }

}

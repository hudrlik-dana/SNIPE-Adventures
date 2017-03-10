/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author aingealfire@gmail.com (new16014@byui.edu)
 */
public class Player implements Serializable {

    //Class instance variables
    private String name;
    private int playerHealth;
    private String codeName;
    private String dossier;
    private ArrayList<Place> passport; 
    private Place currentPlace;
    private Country currentCountry;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPlayerHealth() {
        return playerHealth;
    }

    public void setPlayerHealth(int playerHealth) {
        this.playerHealth = playerHealth;
    }

    public String getCodeName() {
        return codeName;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    public String getDossier() {
        return dossier;
    }

    public void setDossier(String dossier) {
        this.dossier = dossier;
    }

    public ArrayList<Place> getPassport() {
        return passport;
    }

    public void setPassport(ArrayList<Place> passport) {
        this.passport = passport;
    }

    public Place getCurrentPlace() {
        return currentPlace;
    }

    public void setCurrentPlace(Place currentPlace) {
        this.currentPlace = currentPlace;
    }

    public Country getCurrentCountry() {
        return currentCountry;
    }

    public void setCurrentCountry(Country currentCountry) {
        this.currentCountry = currentCountry;
    }

    public Player() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.name);
        hash = 89 * hash + this.playerHealth;
        hash = 89 * hash + Objects.hashCode(this.codeName);
        hash = 89 * hash + Objects.hashCode(this.dossier);
        hash = 89 * hash + Objects.hashCode(this.passport);
        hash = 89 * hash + Objects.hashCode(this.currentPlace);
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
        final Player other = (Player) obj;
        if (this.playerHealth != other.playerHealth) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.codeName, other.codeName)) {
            return false;
        }
        if (!Objects.equals(this.dossier, other.dossier)) {
            return false;
        }
        if (!Objects.equals(this.passport, other.passport)) {
            return false;
        }
        if (!Objects.equals(this.currentPlace, other.currentPlace)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", playerHealth=" + playerHealth + ", codeName=" + codeName + ", dossier=" + dossier + ", passport=" + passport + ", currentPlace=" + currentPlace + '}';
    }

}

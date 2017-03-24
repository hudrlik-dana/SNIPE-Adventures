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
 * @author denisegoetz
 */
public class Place implements Serializable {

    //class instance variables
    private String countryCode;
    private String placeCode;
    private String placeName;
    private String placeScene;
    private String masterCodePiece;
    private boolean challenge;

    
    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getPlaceCode() {
        return placeCode;
    }

    public void setPlaceCode(String placeCode) {
        this.placeCode = placeCode;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getPlaceScene() {
        return placeScene;
    }

    public void setPlaceScene(String placeScene) {
        this.placeScene = placeScene;
    }

    public String getMasterCodePiece() {
        return masterCodePiece;
    }

    public void setMasterCodePiece(String masterCodePiece) {
        this.masterCodePiece = masterCodePiece;
    }

    public boolean isChallenge() {
        return challenge;
    }

    public void setChallenge(boolean challenge) {
        this.challenge = challenge;
    }

    //constructor for Place
    public Place() {
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.countryCode);
        hash = 41 * hash + Objects.hashCode(this.placeCode);
        hash = 41 * hash + Objects.hashCode(this.placeName);
        hash = 41 * hash + Objects.hashCode(this.placeScene);
        hash = 41 * hash + Objects.hashCode(this.masterCodePiece);
        hash = 41 * hash + (this.challenge ? 1 : 0);
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
        final Place other = (Place) obj;
        if (this.challenge != other.challenge) {
            return false;
        }
        if (!Objects.equals(this.countryCode, other.countryCode)) {
            return false;
        }
        if (!Objects.equals(this.placeCode, other.placeCode)) {
            return false;
        }
        if (!Objects.equals(this.placeName, other.placeName)) {
            return false;
        }
        if (!Objects.equals(this.placeScene, other.placeScene)) {
            return false;
        }
        if (!Objects.equals(this.masterCodePiece, other.masterCodePiece)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Place{" + "countryCode=" + countryCode + ", placeCode=" + placeCode + ", placeName=" + placeName + ", placeScene=" + placeScene + ", masterCodePiece=" + masterCodePiece + ", challenge=" + challenge + '}';
    }

}

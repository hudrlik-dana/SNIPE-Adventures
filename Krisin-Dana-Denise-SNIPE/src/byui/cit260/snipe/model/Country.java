package byui.cit260.snipe.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author denisegoetz
 */
public class Country implements Serializable {

    //class instance variables
    private List<Place> places;
    private String entryPointCode;
    private String entryPointDesc;
    private String name;

    public List<Place> getPlaces() {
        return places;
    }

    public void setPlaces(List<Place> places) {
        this.places = places;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addPlace(Place place) {
        places.add(place);
    }

    //constructor for country
    public Country() {
        places = new ArrayList<>();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.places);
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
        if (!Objects.equals(this.places, other.places)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Countries{" + "places=" + places + ", entryPointCode=" + entryPointCode + ", entryPointDesc=" + entryPointDesc + '}';
    }
}

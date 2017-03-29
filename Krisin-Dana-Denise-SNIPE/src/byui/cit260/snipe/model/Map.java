package byui.cit260.snipe.model;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author denisegoetz
 */
public class Map implements Serializable {

    //class instance variables
    private int numRows;
    private int numCols;
    private List<String> places;
    private boolean visited;

    public int getNumRows() {
        return numRows;
    }

    public void setNumRows(int numRows) {
        this.numRows = numRows;
    }

    public int getNumCols() {
        return numCols;
    }

    public void setNumCols(int numCols) {
        this.numCols = numCols;
    }

    public List<String> getPlaces() {
        return places;
    }

    public void setPlaces(List<String> places) {
        this.places = places;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    //constructor for map
    public Map() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.numRows;
        hash = 59 * hash + this.numCols;
        hash = 59 * hash + Objects.hashCode(this.places);
        hash = 59 * hash + (this.visited ? 1 : 0);
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
        final Map other = (Map) obj;
        if (this.numRows != other.numRows) {
            return false;
        }
        if (this.numCols != other.numCols) {
            return false;
        }
        if (this.visited != other.visited) {
            return false;
        }
        if (!Objects.equals(this.places, other.places)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "numRows=" + numRows + ", numCols=" + numCols + ", places=" + places + ", visited=" + visited + '}';
    }

}


package byui.cit260.snipe.model;

import java.io.Serializable;

/**
 *
 * @author danahudrlik
 */
public class MentalChallenge implements Serializable {

    //class instance variables
    private char mentalAnswer;

    public char getMentalAnswer() {
        return mentalAnswer;
    }

    public void setMentalAnswer(char mentalAnswer) {
        this.mentalAnswer = mentalAnswer;
    }

    public MentalChallenge() {
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + this.mentalAnswer;
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
        final MentalChallenge other = (MentalChallenge) obj;
        if (this.mentalAnswer != other.mentalAnswer) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MentalChallenge{" + "mentalAnswer=" + mentalAnswer + '}';
    }

}

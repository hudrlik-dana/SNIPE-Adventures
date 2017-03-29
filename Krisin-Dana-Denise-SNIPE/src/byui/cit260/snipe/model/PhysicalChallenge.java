package byui.cit260.snipe.model;

import java.io.Serializable;

/**
 *
 * @author danahudrlik
 */
public class PhysicalChallenge implements Serializable {

    //class instance variables
    private boolean physicalSuccess;
    private int challengeNumber;
    private int playerRandomNum;

    public boolean isPhysicalSuccess() {
        return physicalSuccess;
    }

    public void setPhysicalSuccess(boolean physicalSuccess) {
        this.physicalSuccess = physicalSuccess;
    }

    public int getChallengeNumber() {
        return challengeNumber;
    }

    public void setChallengeNumber(int challengeNumber) {
        this.challengeNumber = challengeNumber;
    }

    public int getPlayerRandomNum() {
        return playerRandomNum;
    }

    public void setPlayerRandomNum(int playerRandomNum) {
        this.playerRandomNum = playerRandomNum;
    }

    public PhysicalChallenge() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + (this.physicalSuccess ? 1 : 0);
        hash = 47 * hash + this.challengeNumber;
        hash = 47 * hash + this.playerRandomNum;
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
        final PhysicalChallenge other = (PhysicalChallenge) obj;
        if (this.physicalSuccess != other.physicalSuccess) {
            return false;
        }
        if (this.challengeNumber != other.challengeNumber) {
            return false;
        }
        if (this.playerRandomNum != other.playerRandomNum) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PhysicalChallenge{" + "physicalSuccess=" + physicalSuccess + ", challengeNumber=" + challengeNumber + ", playerRandomNum=" + playerRandomNum + '}';
    }

}

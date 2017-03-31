package byui.cit260.snipe.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author danahudrlik
 */
public class Challenge implements Serializable {

    //class instance variables
    private String desc;
    private int injuryPoints;
    private String hint;
    private String masterCodePiece;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getInjuryPoints() {
        return injuryPoints;
    }

    public void setInjuryPoints(int injuryPoints) {
        this.injuryPoints = injuryPoints;
    }

    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }

    public String getMasterCodePiece() {
        return masterCodePiece;
    }

    public void setMasterCodePiece(String masterCodePiece) {
        this.masterCodePiece = masterCodePiece;
    }

    public Challenge() {
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.desc);
        hash = 59 * hash + this.injuryPoints;
        hash = 59 * hash + Objects.hashCode(this.hint);
        hash = 59 * hash + Objects.hashCode(this.masterCodePiece);
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
        final Challenge other = (Challenge) obj;
        if (this.injuryPoints != other.injuryPoints) {
            return false;
        }
        if (!Objects.equals(this.desc, other.desc)) {
            return false;
        }
        if (!Objects.equals(this.hint, other.hint)) {
            return false;
        }
        if (!Objects.equals(this.masterCodePiece, other.masterCodePiece)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Challenge{" + "desc=" + desc + ", injuryPoints=" + injuryPoints + ", hint=" + hint + ", masterCodePiece=" + masterCodePiece + '}';
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipeAdventures.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author danahudrlik
 */
public class MathPuzzle implements Serializable{
    //class instance variables
    private int healthPoints; 
    private String mathAnswer; 
    private int var1; 
    private int var2;
    private int var3; 

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public String getMathAnswer() {
        return mathAnswer;
    }

    public void setMathAnswer(String mathAnswer) {
        this.mathAnswer = mathAnswer;
    }

    public int getVar1() {
        return var1;
    }

    public void setVar1(int var1) {
        this.var1 = var1;
    }

    public int getVar2() {
        return var2;
    }

    public void setVar2(int var2) {
        this.var2 = var2;
    }

    public int getVar3() {
        return var3;
    }

    public void setVar3(int var3) {
        this.var3 = var3;
    }

    public MathPuzzle() {
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + this.healthPoints;
        hash = 37 * hash + Objects.hashCode(this.mathAnswer);
        hash = 37 * hash + this.var1;
        hash = 37 * hash + this.var2;
        hash = 37 * hash + this.var3;
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
        final MathPuzzle other = (MathPuzzle) obj;
        if (this.healthPoints != other.healthPoints) {
            return false;
        }
        if (this.var1 != other.var1) {
            return false;
        }
        if (this.var2 != other.var2) {
            return false;
        }
        if (this.var3 != other.var3) {
            return false;
        }
        if (!Objects.equals(this.mathAnswer, other.mathAnswer)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MathPuzzle{" + "healthPoints=" + healthPoints + ", mathAnswer=" + mathAnswer + ", var1=" + var1 + ", var2=" + var2 + ", var3=" + var3 + '}';
    }

    
    
    
    
    
}

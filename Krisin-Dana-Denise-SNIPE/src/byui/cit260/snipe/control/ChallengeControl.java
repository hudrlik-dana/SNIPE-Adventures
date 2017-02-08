/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.control;

import static javafx.beans.binding.Bindings.and;

/**
 *
 * @author denisegoetz
 */
public class ChallengeControl {
double totalAnimals = 30;
double totalLegs    = 74;
String answer = null;
//System.out.println(" hjhj  ");
//String answer      = (String) (numChickens “ chickens” + “ and “ + numCows + “ cows.”);
    /**
     *
     * @param totalLegs
     * @param totalAnimals
     * @param numCows
     * @param numChickens
     * @return
     */
    public String calcMathPuzzle2(double totalLegs, double totalAnimals) {
    double numChickens =  ((4 * totalAnimals) - totalLegs) / 2;
    double numCows     = totalAnimals - numChickens;
    
    String answer     = toString(numChickens “ chickens” + “ and “ + numCows + “ cows.”);
    return answer;
    
    
    }
    
    }
}

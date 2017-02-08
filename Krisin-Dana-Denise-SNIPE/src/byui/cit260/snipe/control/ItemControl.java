/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.control;

/**
 *
 * @author danahudrlik
 */
public class ItemControl {
    public class ChallengeControl {
        double totalAnimals = 30;
        double totalLegs = 74; 
        double numCows;
        double numChickens;

        
        public double calcMathPuzzle2(double totalLegs, double totalAnimals, double numCows, double numChickens) {
            numChickens = ((4 * totalAnimals) - totalLegs)/2;
            numCows = numChickens - numCows;
            
            return numCows;
           
        
    }
    }
}

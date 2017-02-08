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
public class ChallengeControl {

       int totalLegs; 
       int totalAnimals; 
     
    public static String calcMathPuzzle2(int totalAnimals, int totalLegs) {
        int numChickens = ((totalAnimals * 4) - totalLegs)/2; 
        int numCows = totalAnimals - numChickens;
        
        String response = "You have " + numChickens + " chickens and " + numCows + " cows.";   
        
        System.out.println(response);
       
       return response;
    }
}
   



      


    

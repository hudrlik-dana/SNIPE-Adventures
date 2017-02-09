/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.control;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;
import java.util.Objects;
import static javafx.beans.binding.Bindings.and;

/**
 *
 * @author denisegoetz
 */

public class ChallengeControl {
    
//Team Assignment
    int totallegs = 74;
    int totalAnimals = 30;

    public static String calcMathPuzzle2(int totalLegs, int totalAnimals) {
        int numChickens = ((4 * totalAnimals) - totalLegs) / 2;
        int numCows = totalAnimals - numChickens;

        String response = "You have  " + numChickens + " chickens and  " + numCows + " cows.";

        return response;

    }

//Kristin's Individual Assignment
    Boolean physicalSuccess = null;

    public Boolean physicalChallenge() {
        int randomNumber = 75;
        int challengeNumber = 50;

        if (randomNumber > challengeNumber) {
            return physicalSuccess = TRUE;
        } else {
            return physicalSuccess = FALSE;
        }

    }

//Denise's Individual Assignment
    int wallHeight = 32;
    int shadowLength = 60;
    double distance = 0;

    public double calcMathPuzzle1(int wallHeight, int shadowLength) {
        distance = Math.sqrt((wallHeight * wallHeight) + (shadowLength * shadowLength));

        return distance;
    }

//Dana's Individual Assignment
    //length & width in feet
    int lengthA = 200; 
    int widthA = 75;
    //length & width in inches
    int lengthB = 6;
    int widthB = 3;
    
    public double calcMathPuzzle3(int lengthA, int widthA, int lengthB, int widthB){

        double totalBricks = ((lengthA*widthA)*12)/(lengthB*widthB);
        
        return totalBricks;    
    }
    
}

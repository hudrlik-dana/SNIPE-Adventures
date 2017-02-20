/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.control;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;
import java.util.Objects;
import java.util.Random;
import static javafx.beans.binding.Bindings.and;

/**
 *
 * @author dana.hudrlik
 */
public class ChallengeControl {

    public boolean checkAnswer(double playerAnswer, double correctAnswer) {
        return playerAnswer == correctAnswer;
    }

//Team Assignment
    public static String calcMathPuzzle2(double totalLegs, double totalAnimals) {
        double numChickens = Math.round(((4 * totalAnimals) - totalLegs) / 2);
        double numCows = Math.round(totalAnimals - numChickens);

        String response = "You have " + numChickens + " chickens and " + numCows + " cows.";

        return response;

    }

    public boolean performPhysicalChallenge() {
        Random rand = new Random();
        int randomValue = rand.nextInt(100);
        return physicalChallengeCheck(randomValue, 50); //TODO grab location challenge number
        //TODO add more logic like removing health, etc.
    }

    //Kristin's Individual Assignment
    public boolean physicalChallengeCheck(int randomNumber, int challengeNumber) {
        if (randomNumber > challengeNumber) {
            return true;
        } else {
            return false;
        }
    }

    public void performMathPuzle1() {
        int wallHeight = 10;
        int shadowLength = 10;

        double distance = calcMathPuzzle1(wallHeight, shadowLength);

    }

    //Denise's Individual Assignment
    public double calcMathPuzzle1(int wallHeight, int shadowLength) {
        double distance = 0;
        distance = Math.round(Math.sqrt((wallHeight * wallHeight) + (shadowLength * shadowLength)));

        return distance;
    }

//Dana's Individual Assignment
    //A - length & width in feet 
    //B - length & width in inches
    public double calcMathPuzzle3(int lengthA, int widthA, int lengthB, int widthB) {

        double totalBricks = Math.round(((lengthA * widthA) * 12) / (lengthB * widthB));

        return totalBricks;
    }

//Other functions 
//Apply Damage
    int playerHealth = 100;
    
    public int adjustPlayerHealth(int currentHealth, int injuryPoints) {

        if (injuryPoints < currentHealth) {
            playerHealth = currentHealth - injuryPoints;
            return playerHealth;
        } else {
            return playerHealth = 0;
        }

    }

//Results of Player Answer
    
    String result = null;
    
    public String playerAnswer(char playerAnswer, char correctAnswer, char otherAnswer1, char otherAnswer2, char otherAnswer3) {

        if (playerAnswer == correctAnswer) {
            return result = "Correct";
        } else if (playerAnswer == otherAnswer1 || playerAnswer == otherAnswer2 || playerAnswer == otherAnswer3) {
            return result = "Incorrect";
        } else {
            return result = "Invalid Entry, Try Again";
        }
    }
    
    // Get an integer between 1 and 100.

    public int randomWithRange(int min, int max, int number) {
        int range = (max - min) + 1;
        return number = (int) (Math.random() * range) + min;

    }
}
        
 



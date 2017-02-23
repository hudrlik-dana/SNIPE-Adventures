/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.control;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author aingealfire@gmail.com (new16014@byui.edu)
 */
public class PresentationExamples {

//*******************************************************************************************
    // Individual Assignment Walkthroughs
//*******************************************************************************************
//From ChallengeControl:
//Kristin's Individual Assignment
    public boolean physicalChallengeCheck(int randomNumber, int challengeNumber) {
        if (randomNumber > challengeNumber) {
            return true;
        } else {
            return false;
        }
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

//From MainMenuView:
    private boolean doAction(String choice) {

        choice = choice.toUpperCase(); //convert choice to upper case

        switch (choice) {
            case "L": //Load Saved Game
                this.startSavedGame();
                break;
            case "N": //Start New Game
                this.startNewGame();
                break;
            case "S": //Save Current Game
                this.saveGame();
                break;
            case "R": //Return to Player Location
                this.displayPlayerCurrentScene();
                break;
            case "H": //Display Help Menu
                this.displayHelpMenu();
                break;
            case "X": //Exit Game
                this.exitGame();
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
        }
        return false;
    }

    private void startSavedGame() {
        System.out.println("\n*** startSavedGame stub function called ***");
    }

    private void startNewGame() {
        //create new game
        System.out.println("\n*** startNewGame stub function called ***");
    }

    private void saveGame() {
        System.out.println("\n*** saveGame stub function called ***");
    }

    private void displayPlayerCurrentScene() {
        System.out.println("\n*** displayPlayerCurrentScene stub function called ***");
    }

    private void displayHelpMenu() {
        //display the help menu
        System.out.println("\n*** exitGame stub function called ***");
    }

    private void exitGame() {
        System.out.println("\n*** exitGame stub function called ***");
    }

//*******************************************************************************************
    // Individual Test Case Walkthroughs
//*******************************************************************************************
    /**
     * Test of physicalChallenge method, of class ChallengeControl. Kristin's
     * Individual Assignment
     */
    @Test
    public void testPhysicalChallenge() {
        System.out.println("physicalChallenge");
        ChallengeControl instance = new ChallengeControl();
        boolean expResult = true;
        int psuedoRand = 75;
        int challengeValue = 50;
        Boolean result = instance.physicalChallengeCheck(psuedoRand, challengeValue);
        assertEquals(expResult, result);

        psuedoRand = 45;
        challengeValue = 50;
        expResult = false;
        result = instance.physicalChallengeCheck(psuedoRand, challengeValue);
        assertEquals(expResult, result);
    }

    /**
     * Test of calcMathPuzzle1 method, of class ChallengeControl. Denise's
     * Individual Assignment
     */
    @Test
    public void testCalcMathPuzzle1() {
        System.out.println("calcMathPuzzle1");
        int wallHeight = 32;
        int shadowLength = 60;
        ChallengeControl instance = new ChallengeControl();
        double expResult = 68;
        double result = instance.calcMathPuzzle1(wallHeight, shadowLength);
        assertEquals(expResult, result, 0.1);

        wallHeight = 32;
        shadowLength = 102;
        expResult = 106.9;
        result = instance.calcMathPuzzle1(wallHeight, shadowLength);
        assertEquals(expResult, result, 0.1);

    }

    /**
     * Test of calcMathPuzzle3 method, of class ChallengeControl. Dana's
     * Individual Assignment
     */
    @Test
    public void testCalcMathPuzzle3() {
        System.out.println("calcMathPuzzle3");
        int lengthA = 200;
        int widthA = 75;
        int lengthB = 6;
        int widthB = 3;
        ChallengeControl instance = new ChallengeControl();
        double expResult = 10000;
        double result = instance.calcMathPuzzle3(lengthA, widthA, lengthB, widthB);
        assertEquals(expResult, result, 0.0);

        lengthA = 500;
        widthA = 95;
        lengthB = 6;
        widthB = 3;
        expResult = 31666; //round should make this 31667 but isn't????
        result = instance.calcMathPuzzle3(lengthA, widthA, lengthB, widthB);
        assertEquals(expResult, result, 0.0);

        lengthA = 100;
        widthA = 25;
        lengthB = 6;
        widthB = 3;
        expResult = 1666; //round should make this 1667 but isn't????
        result = instance.calcMathPuzzle3(lengthA, widthA, lengthB, widthB);
        assertEquals(expResult, result, 0.0);
    }

//*******************************************************************************************
    // Team Lifespan and Scope
//*******************************************************************************************  
    
    
    
    
//*******************************************************************************************
    // Team Pass by value & reference
//*******************************************************************************************   
    
    
    
    
    
}

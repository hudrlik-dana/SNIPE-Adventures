/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.control;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aingealfire
 */
public class ChallengeControlTest {

    public ChallengeControlTest() {
    }

    /**
     * Test of calcMathPuzzle2 method, of class ChallengeControl. Team
     * Assignment
     */
    @Test
    public void testCalcMathPuzzle2() {
        System.out.println("calcMathPuzzle2");
        int totalLegs = 74;
        int totalAnimals = 30;
        String expResult = "You have  23 chickens and  7 cows.";
        String result = ChallengeControl.calcMathPuzzle2(totalLegs, totalAnimals);
        assertEquals(expResult, result);

        //expected fail test
        totalLegs = 74;
        totalAnimals = 30;
        expResult = "You have  25 chickens and  5 cows.";
        result = ChallengeControl.calcMathPuzzle2(totalLegs, totalAnimals);
        assertEquals(expResult, result);

        //expected fail test
        totalLegs = 74;
        totalAnimals = 30;
        expResult = "You have  27 chickens and  3 cows.";
        result = ChallengeControl.calcMathPuzzle2(totalLegs, totalAnimals);
        assertEquals(expResult, result);
    }

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

        //expected fail test
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

        //expected fail test
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
        assertEquals(expResult, result, 0);

        //expected fail test
        lengthA = 200;
        widthA = 75;
        lengthB = 6;
        widthB = 3;
        expResult = 5000;
        result = instance.calcMathPuzzle3(lengthA, widthA, lengthB, widthB);
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of adjustPlayerHealth method, of class ChallengeControl.
     */
    @Test
    public void testAdjustPlayerHealth() {
        System.out.println("adjustPlayerHealth");
        int currentHealth = 100;
        int injuryPoints = 10;
        ChallengeControl instance = new ChallengeControl();
        int expResult = 90;
        int result = instance.adjustPlayerHealth(currentHealth, injuryPoints);
        assertEquals(expResult, result);

        currentHealth = 10;
        injuryPoints = 75;
        expResult = 0;
        result = instance.adjustPlayerHealth(currentHealth, injuryPoints);
        assertEquals(expResult, result);
    }

    /**
     * Test of playerAnswer method, of class ChallengeControl.
     */
    @Test
    public void testPlayerAnswer() {
        System.out.println("playerAnswer");
        char playerAnswer = 'A';
        char correctAnswer = 'A';
        char otherAnswer1 = 'B';
        char otherAnswer2 = 'C';
        char otherAnswer3 = 'D';
        ChallengeControl instance = new ChallengeControl();
        String expResult = "Correct";
        String result = instance.playerAnswer(playerAnswer, correctAnswer, otherAnswer1, otherAnswer2, otherAnswer3);
        assertEquals(expResult, result);

        playerAnswer = 'B';
        correctAnswer = 'A';
        otherAnswer1 = 'B';
        otherAnswer2 = 'C';
        otherAnswer3 = 'D';
        expResult = "Incorrect";
        result = instance.playerAnswer(playerAnswer, correctAnswer, otherAnswer1, otherAnswer2, otherAnswer3);
        assertEquals(expResult, result);

        playerAnswer = 'X';
        correctAnswer = 'A';
        otherAnswer1 = 'B';
        otherAnswer2 = 'C';
        otherAnswer3 = 'D';
        expResult = "Invalid Entry, Try Again";
        result = instance.playerAnswer(playerAnswer, correctAnswer, otherAnswer1, otherAnswer2, otherAnswer3);
        assertEquals(expResult, result);
    }

    /**
     * Test of randomWithRange method, of class ChallengeControl.
     */
    @Test
    public void testRandomWithRange() {
        System.out.println("randomWithRange");
        int min = 1;
        int max = 100;
        ChallengeControl instance = new ChallengeControl();
        int expResult = 10;
        int result = instance.randomWithRange(min, max);
        assertEquals(expResult, result);

        min = 2;
        max = 2;
        expResult = 2;
        assertEquals(expResult, result);

        min = 1;
        max = 1;
        expResult = 1;
        assertEquals(expResult, result);
    }

}

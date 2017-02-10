/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Randstad
 */
public class ChallengeControlTest2 {
    
    public ChallengeControlTest2() {
    }

    /**
     * Test of checkAnswer method, of class ChallengeControl.
     */
    /*@Test
    public void testCheckAnswer() {
    System.out.println("checkAnswer");
    double playerAnswer = 0.0;
    double correctAnswer = 0.0;
    ChallengeControl instance = new ChallengeControl();
    boolean expResult = false;
    boolean result = instance.checkAnswer(playerAnswer, correctAnswer);
    assertEquals(expResult, result);
    }*/

    /**
     * Test of calcMathPuzzle2 method, of class ChallengeControl.
     */
    @Test
    public void testCalcMathPuzzle2() {
        System.out.println("calcMathPuzzle2");
        double totalLegs = 74;
        double totalAnimals = 30;
        String expResult = "You have 23 chickens and 7 cows.";
        String result = ChallengeControl.calcMathPuzzle2(totalLegs, totalAnimals);
        assertEquals(expResult, result);
        
        totalLegs = 125;
        totalAnimals = 50;
        expResult = "You have 38 chickens and 12 cows.";
        assertEquals(expResult, result);
        
        totalLegs = 65;
        totalAnimals = 20;
        expResult = "You have 8 chickens and 12 cows.";
        assertEquals(expResult, result);
    }

    /**
     * Test of performPhysicalChallenge method, of class ChallengeControl.
     */
    /*@Test
    public void testPerformPhysicalChallenge() {
    System.out.println("performPhysicalChallenge");
    ChallengeControl instance = new ChallengeControl();
    boolean expResult = false;
    boolean result = instance.performPhysicalChallenge();
    assertEquals(expResult, result);
    
    }*/

    /**
     * Test of physicalChallengeCheck method, of class ChallengeControl.
     */
    @Test
    public void testPhysicalChallengeCheck() {
        System.out.println("physicalChallengeCheck");
        int randomNumber = 75;
        int challengeNumber = 50;
        ChallengeControl instance = new ChallengeControl();
        boolean expResult = true;
        boolean result = instance.physicalChallengeCheck(randomNumber, challengeNumber);
        assertEquals(expResult, result);

        randomNumber = 35;
        challengeNumber = 50;
        expResult = false;
        assertEquals(expResult, result);
    }

    /**
     * Test of performMathPuzle1 method, of class ChallengeControl.
     */
    /*@Test
    public void testPerformMathPuzle1() {
    System.out.println("performMathPuzle1");
    ChallengeControl instance = new ChallengeControl();
    instance.performMathPuzle1();
    
    }*/

    /**
     * Test of calcMathPuzzle1 method, of class ChallengeControl.
     */
    @Test
    public void testCalcMathPuzzle1() {
        System.out.println("calcMathPuzzle1");
        int wallHeight = 32;
        int shadowLength = 60;
        ChallengeControl instance = new ChallengeControl();
        double expResult = 68;
        double result = instance.calcMathPuzzle1(wallHeight, shadowLength);
        assertEquals(expResult, result, 0.0);

        wallHeight = 58;
        shadowLength = 79;
        expResult = 98;
        result = instance.calcMathPuzzle1(wallHeight, shadowLength);
        assertEquals(expResult, result, 0.0);
        
        wallHeight = 23;
        shadowLength = 5;
        expResult = 24;
        result = instance.calcMathPuzzle1(wallHeight, shadowLength);
        assertEquals(expResult, result, 0.0); 
    }

    /**
     * Test of calcMathPuzzle3 method, of class ChallengeControl.
     */
    @Test
    public void testCalcMathPuzzle3() {
        System.out.println("calcMathPuzzle3");
        int lengthA = 200;
        int widthA = 75;
        int lengthB = 6;
        int widthB = 3;
        ChallengeControl instance = new ChallengeControl();
        double expResult = 0.0;
        double result = instance.calcMathPuzzle3(lengthA, widthA, lengthB, widthB);
        assertEquals(expResult, result, 0.0);

        lengthA = 500;
        widthA = 95;
        lengthB = 6;
        widthB = 3;
        expResult = 31667;
        result = instance.calcMathPuzzle3(lengthA, widthA, lengthB, widthB);
        assertEquals(expResult, result, 0.0);
        
        lengthA = 100;
        widthA = 25;
        lengthB = 6;
        widthB = 3;
        expResult = 1667;
        result = instance.calcMathPuzzle3(lengthA, widthA, lengthB, widthB);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of adjustPlayerHealth method, of class ChallengeControl.
     */
    /*@Test
    public void testAdjustPlayerHealth() {
    System.out.println("adjustPlayerHealth");
    int currentHealth = 0;
    int injuryPoints = 0;
    ChallengeControl instance = new ChallengeControl();
    int expResult = 0;
    int result = instance.adjustPlayerHealth(currentHealth, injuryPoints);
    assertEquals(expResult, result);
    
    
    }*/

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

        playerAnswer = 'A';
        correctAnswer = 'A';
        otherAnswer1 = 'B';
        otherAnswer2 = 'C';
        otherAnswer3 = 'D';
        expResult = "Incorrect";
        result = instance.playerAnswer(playerAnswer, correctAnswer, otherAnswer1, otherAnswer2, otherAnswer3);
        assertEquals(expResult, result);
        
        playerAnswer = 'A';
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
    /*@Test
    public void testRandomWithRange() {
    System.out.println("randomWithRange");
    int min = 0;
    int max = 0;
    ChallengeControl instance = new ChallengeControl();
    int expResult = 0;
    int result = instance.randomWithRange(min, max);
    assertEquals(expResult, result);
    
    
    }*/
    
}

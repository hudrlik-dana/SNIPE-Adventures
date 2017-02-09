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
 * @author Randstad
 */
public class ChallengeControlTest {
    
    public ChallengeControlTest() {
    }

    /**
     * Test of calcMathPuzzle2 method, of class ChallengeControl.
     * Team Assignment
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
     * Test of physicalChallenge method, of class ChallengeControl.
     * Kristin's Individual Assignment
     */
    @Test
    public void testPhysicalChallenge() {
        System.out.println("physicalChallenge");
        ChallengeControl instance = new ChallengeControl();
        Boolean expResult = TRUE;
        Boolean result = instance.physicalChallenge();
        assertEquals(expResult, result);
        
        //expected fail test
        expResult = FALSE;
        result = instance.physicalChallenge();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of calcMathPuzzle1 method, of class ChallengeControl.
     * Denise's Individual Assignment
     */
    @Test
    public void testCalcMathPuzzle1() {
        System.out.println("calcMathPuzzle1");
        int wallHeight = 32;
        int shadowLength = 60;
        ChallengeControl instance = new ChallengeControl();
        double expResult = 68;
        double result = instance.calcMathPuzzle1(wallHeight, shadowLength);
        assertEquals(expResult, result, 0);
        
        //expected fail test
        wallHeight = 32;
        shadowLength = 102;
        expResult = 68;
        result = instance.calcMathPuzzle1(wallHeight, shadowLength);
        assertEquals(expResult, result, 0);
        
    }

    /**
     * Test of calcMathPuzzle3 method, of class ChallengeControl.
     * Dana's Individual Assignment
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
    
}

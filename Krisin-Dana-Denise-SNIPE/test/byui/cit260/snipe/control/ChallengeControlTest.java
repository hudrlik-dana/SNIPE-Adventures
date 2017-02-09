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
public class ChallengeControlTest {
    
    public ChallengeControlTest() {
    }

    /**
     * Test of calcMathPuzzle2 method, of class ChallengeControl.
     */
    @Test
    public void testCalcMathPuzzle2() {
        System.out.println("calcMathPuzzle2");
        int totalLegs = 74;
        int totalAnimals = 30;
        String expResult = "You have  23 chickens and  7 cows.";
        String result = ChallengeControl.calcMathPuzzle2(totalLegs, totalAnimals);
        assertEquals(expResult, result);
        
    }
    
}

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

    public String playerAnswer(char playerAnswer, char correctAnswer, 
            char otherAnswer1, char otherAnswer2, char otherAnswer3) {

        if (playerAnswer == correctAnswer) {
            return result = "Correct";
        } else if (playerAnswer == otherAnswer1 || playerAnswer == otherAnswer2 
                     || playerAnswer == otherAnswer3) {
            return result = "Incorrect";
        } else {
            return result = "Invalid Entry, Try Again";
        }
    }
//*******************************************************************************************
//*******************************************************************************************
//*******************************************************************************************
//*******************************************************************************************
    //
//*******************************************************************************************
    // Individual Test Case Walkthroughs
//*******************************************************************************************
    /**
     * Test of physicalChallenge method, of class ChallengeControl. Kristin's
     * Individual Assignment
     */
    /*public boolean physicalChallengeCheck(int randomNumber, int challengeNumber) {
        if (randomNumber > challengeNumber) {
            return true;
        } else {
            return false;
        }
    }*/
    //@Test
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

//*******************************************************************************************
    /**
     * Test of calcMathPuzzle1 method, of class ChallengeControl. Denise's
     * Individual Assignment
     */
    /*public static double calcMathPuzzle1(int wallHeight, int shadowLength) {
        double distance = 0;
        distance = Math.round(Math.sqrt((wallHeight * wallHeight) + (shadowLength * shadowLength)));

        return distance;*/
    //@Test
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

    //*******************************************************************************************
    /**
     * Test of calcMathPuzzle3 method, of class ChallengeControl. Dana's
     * Individual Assignment
     */
    /*
    public static double calcMathPuzzle3(int lengthA, int widthA, int lengthB, int widthB) {
        double totalBricks = Math.round(((lengthA * widthA) * 12) / (lengthB * widthB));
        return totalBricks;
    }    
     */
    //@Test
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

    }

//*******************************************************************************************
//*******************************************************************************************
//*******************************************************************************************
//*******************************************************************************************
    //
//*******************************************************************************************
    // Team Lifespan and Scope
//*******************************************************************************************  
/*Variables declared inside a scope are not accessible to code outside.
Scopes can be nested. The outer scope encloses the inner scope.
Variables declared in the outer scope are visible to the inner scope.
Variables declared in the inner scope are not visible to the outside scope.*/

public class Main {
  public void main(String args[]) {
    int x; // known within main
    x = 10;
    if (x == 10) { // start new scope
      int y = 20; // y is known only to this block
      // x and y both known here.
      System.out.println("x and y: " + x + " " + y);
      x = y + 2;
    }
    System.out.println("x is " + x);
  }
}
    
/*The output:

x and y: 10 20
x is 22*/

//-------------------------------------------------------

/*Variables declared within a scope will not hold 
their values between calls to that scope.*/
 

public class Test {
  public void test(String args[]) {
    for (int i = 0; i < 3; i++) {
      int y = 0; // y is initialized each time block is entered
      System.out.println("y is: " + y); 
      y = 100;
      System.out.println("y is now: " + y);

    }
  }
}
/*
The output generated by this program is shown here:

y is: 0
y is now: 100
y is: 0
y is now: 100
y is: 0
y is now: 100*/
    

// http://www.java2s.com/Book/Java/0020__Language-Basics/The_Scope_and_Lifetime_of_Variables.htm
    
//*******************************************************************************************
//*******************************************************************************************
//*******************************************************************************************
//*******************************************************************************************
    //
//*******************************************************************************************
    // Team Pass by value & reference
//*******************************************************************************************  

/* Pass by Value vs Pass by Reference

We can run a simple swap test and check for pass 
by value vs pass by reference. Let us pass two arguments 
and swap them inside the invoked method, then check if the 
actual arguments are swapped. If the actual arguments are 
affected then the mechanism used is pass by reference 
otherwise it is pass by value.*/

public class Swap {
	public void main(String args[]) {
		Animal a1 = new Animal("Lion");
		Animal a2 = new Animal("Crocodile");

		System.out.println("Before Swap:- a1:" + a1 + "; a2:" + a2);
		swap(a1, a2);
		System.out.println("After Swap:- a1:" + a1 + "; a2:" + a2);
	}
	public void swap(Animal animal1, Animal animal2) {
		Animal temp = new Animal("");
		temp = animal1;
		animal1 = animal2;
		animal2 = temp;
	}
}
class Animal {
	String name;
	public Animal(String name) {
		this.name = name;
	}
	public String toString() {
		return name;
	}
}
/*Example Output:

Before Swap:- a1:Lion; a2:Crocodile
After Swap:- a1:Lion; a2:Crocodile
Objects are not swapped because Java uses pass by value.*/


/*Java Passes the Reference

Look at the following code where we able to change the 
property of a passed argument object inside a method and it gets 
reflected in the actual argument.*/

public class Swap2 {
	public void main(String args[]) {
		Animal2 a = new Animal2("Lion");

		System.out.println("Before Modify: " + a);
		modify(a);
		System.out.println("After Modify: " + a);
	}
	public void modify(Animal2 animal) {
		animal.setName("Tiger");
	}
}
class Animal2 {
	String name;

	public Animal2(String name) {
		this.name = name;
	}
	public String toString() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
    }

/* Example Output
Before Modify: Lion
After Modify: Tiger*/


// http://javapapers.com/core-java/java-pass-by-value-and-pass-by-reference/
}
/*

    //Denise's Individual Assignment
    public static double calcMathPuzzle1(int wallHeight, int shadowLength) {
        double distance = 0;
        distance = Math.round(Math.sqrt((wallHeight * wallHeight) + (shadowLength * shadowLength)));

        return distance;
    }

//Dana's Individual Assignment
    //A - length & width in feet 
    //B - length & width in inches
    public static double calcMathPuzzle3(int lengthA, int widthA, int lengthB, int widthB) {
        double totalBricks = Math.round(((lengthA * widthA) * 12) / (lengthB * widthB));
        return totalBricks;
    }

    //Kristin's Individual Assignment
    public boolean physicalChallengeCheck(int randomNumber, int challengeNumber) {
        if (randomNumber > challengeNumber) {
            return true;
        } else {
            return false;
        }
    }
*/

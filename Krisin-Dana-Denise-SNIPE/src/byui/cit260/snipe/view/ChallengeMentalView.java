/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.view;

import byui.cit260.snipe.control.ChallengeControl;
import byui.cit260.snipe.model.Country;
import java.util.Scanner;
import snipe.Snipe;

/**
 *
 * @author denisegoetz
 */
public class ChallengeMentalView {

    private String answerOption;

    
    public ChallengeMentalView() {
        
       Country currentCountry = Snipe.getPlayer().getCurrentCountry();
        
       switch ("currentCountry") {
            case "USA": //display the question
                System.out.println("\n This library holds the president’s book of secrets"
                                 + "\n and is heavily guarded. You will need to be  very"
                                 + "\n alert to collect your next clue. You have a special"
                                 + "\n key to enter the back rooms where you clue is located."
                                 + "\n Your clue will be inside a leather bound, 1788 first"
                                 + "\n edition, of the Federalists Papers. This book is to "
                                 + "\n the right, and 2 shelves down from the president’s book "
                                 + "\n of secrets. Remember, you are not to look inside the"
                                 + "\n president’s book. To get past the first guard you will "
                                 + "\n need a distraction that will draw him away from his post"
                                 + "\n at the stairwell. You find an enterprising 12-year old "
                                 + "\n and pay him $20 to pull the fire alarm. Once the alarm "
                                 + "\n sounds, the chaos and confusion has the guards running "
                                 + "\n around trying to get the tourists out of the building."
                                 + "\n Using your stealthy SNIPE powers, you slip past the guards"
                                 + "\n unnoticed, quickly climb the stairs, and use your key to"
                                 + "\n unlock the first of 3 doors. A few minutes later you are"
                                 + "\n searching the shelves for the leather-bound book holding your"
                                 + "\n next clue. You find the book and a tattered old paper falls "
                                 + "\n to the floor. You pick it up and read, “Is it legal for a man"
                                 + "\n in California to marry his widow’s sister?” You smile,"
                                 + "\n and bury the book back on the shelf."
                                 + "\n ==========================================================="
                                 + "\n Type Y for yes and N for no.  ");
                break;
            case "Germany": //display the question
                System.out.println("\n Beginning at the east end you walk along the wall"
                                 + "\n looking for your next clue that will lead you to "
                                 + "\n the secret passage. You notice the 32-foot tall wall"
                                 + "\n is casting a shadow in the warm afternoon sun. You "
                                 + "\n walk 20 paces from the wall to the end of the shadow."
                                 + "\n The secret passage will be located at a distance equal"
                                 + "\n to the missing side of the triangle, (the hypotenuse)"
                                 + "\n formed by the height of the wall, the shadow it is"
                                 + "\n casting, and an imaginary line from the end of the"
                                 + "\n shadow back to thetop of the wall. By determining the"
                                 + "\n missing length, you will find the entrance to the "
                                 + "\n secret passage and your next clue.  Math calculation is:"
                                 + "\n (wall height)^ + (shadow length)^ = slant^ ; square root of slant^ ="
                                 + "\n ==========================================================="
                                 + "\n Type 1 for 74"
                                 + "\n Type 2 for 68"
                                 + "\n Type 3 for 60");   
                break;
            
            case "Spain": //display the question
                System.out.println("\n The narrow streets and plazas are filled with vendors,"
                                 + "\n so you lose the suspicious man in the dark hat and coat"
                                 + "\n who may have been following you the past hour. It is"
                                 + "\n easy to blend in with the crowd. A young man dressed"
                                 + "\n in overalls and a tattered shirt, wearing a straw-hat"
                                 + "\n bumps into you and says, “I have a total of 30"
                                 + "\n animals, chickens and some cows, on my farm. The animals"
                                 + "\n have a total of 74 legs in all. I was told to give this"
                                 + "\n envelope to the one who can tell me how many chickens"
                                 + "\n and cows I have on my farm.” This sounds like a simple"
                                 + "\n algebra equation to you. Pulling out your secret spy"
                                 + "\n calculator, to do the math. What do you tell the farmer"
                                 + "\n so he will give hand you the next clue? The math problem:"
                                 + "\n x = number of cows; y = number of chickens; x + y = 30."
                                 + "\n cows have 4 legs each = 4x; chickens have 2 legs each"
                                 + "\n which is = 2y. Total legs = 74."
                                 + "\n ========================================================"
                                 + "\n Type 1 for 23 chickens & 7 cows,"
                                 + "\n Type 2 for 20 chickens & 3 cows "
                                 + "\n Type 3 for 16 chickens & 10 cows");                      
                break;
            case "Russia": //display the question
                System.out.println("\n This place is crawling with secret police. They really aren’t" 
                                 + "\n very secret, since you can spot them by their clothing and"
                                 + "\n earwigs. You will need to be very careful today and use all"
                                 + "\n your SNIPE training to retrieve your next clue. You will need"
                                 + "\n to calculate the total number of bricks used to pave the area."
                                 + "\n You can see that each brick is 3 inches wide, 2 inches tall,"
                                 + "\n and 6 inches long. You blend in the with tourists and walk"
                                 + "\n around the area taking note that the area is 150 feet wide"
                                 + "\n and 600 feet long. How many bricks were used to pave the area?" 
                                 + "\n The math problem:"
                                 + "\n total area = length * width / 12 inches = area in sq inches"
                                 + "\n Number of bricks ="
                                 + " total area in inches / area of one brick (3 * 6 = 18) sq inches"                      
                                 + "\n ========================================================"
                                 + "\n Type 1 for 31666"
                                 + "\n Type 2 for 10000 "
                                 + "\n Type 3 for 1666");                      
                break;
            default:
                System.out.println("\n*** Country not built out yet - call Programmer");
                break;
        }
  
    }

    
    public void displayMenuView() {

        boolean done = false; //set flag to not done
        do {
            String answerOption = this.getAnswerOption();

            //do the requested action and display the next view
            done = this.doAction(answerOption);

        } while (!done);
    }

    private String getAnswerOption() {
        Scanner keyboard = new Scanner(System.in); //get infile for Keyboard
        String value = ""; //value to be returned
        boolean valid = false; //initialize to not valid

        while (!valid) {
            System.out.println("\n" + this.answerOption);

            value = keyboard.nextLine(); //get next line typed on keyboard
            value = value.trim(); //trim off leading and trailing blanks

            if (value.length() < 1) { // value is blank
                System.out.println("\nInvalid: entry required.");
            }
            break; //end the loop
        }

        return value; //return entered value
    }

    private boolean doAction(String choice) {
      
        int var1=0;
        int var2=0;
        int var3=0;
        int var4=0;
       
        switch (answerOption) {
            case "1,2,3 && currentCountry == 'Germany'": //They chose an answer for Germany challenge
                if (answerOption == "1"){
                    var1=34;
                    var2=61;      
                    ChallengeControl.calcMathPuzzle1(var1, var2);
                }
                if (answerOption == "2"){
                    var1=32;
                    var2=68;      
                    ChallengeControl.calcMathPuzzle1(var1, var2);
                }
                if (answerOption == "3"){
                    var1=30;
                    var2=66;      
                    ChallengeControl.calcMathPuzzle1(var1, var2); 
                }
                //need to display the return value
                break;
            case "1,2,3 && currentCountry == 'Spain'":  //They chose an answer for Spain challenge
                if (answerOption == "1"){
                    var1=74;
                    var2=30;      
                    ChallengeControl.calcMathPuzzle2(var1, var2);
                }
                if (answerOption == "2"){
                    var1=68;
                    var2=20;      
                    ChallengeControl.calcMathPuzzle2(var1, var2);
                }
                if (answerOption == "3"){
                    var1=65;
                    var2=20;      
                    ChallengeControl.calcMathPuzzle2(var1, var2); 
                }
                //need to display the return value
                break;
            case "1,2,3 && currentCountry == 'Russia'": //They chose an answer for Russia challenge
                ChallengeControl.calcMathPuzzle3(0, 0, 0, 0);
                 if (answerOption == "1"){
                    var1=500;
                    var2=95;
                    var3=6;
                    var4=3;
                    ChallengeControl.calcMathPuzzle3(var1, var2, var3, var4);
                }
                if (answerOption == "2"){
                    var1=200;
                    var2=75;
                    var3=6;
                    var4=3;
                    ChallengeControl.calcMathPuzzle3(var1, var2, var3, var4);
                }
                if (answerOption == "3"){
                    var1=100;
                    var2=25;
                    var3=6;
                    var4=3;
                    ChallengeControl.calcMathPuzzle3(var1, var2, var3, var4); 
                }
                //need to display the return value
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
          
        }

        return false;
    }


}   
 


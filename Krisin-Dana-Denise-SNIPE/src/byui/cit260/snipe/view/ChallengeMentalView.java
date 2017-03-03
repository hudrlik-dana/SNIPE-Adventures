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
                    ChallengeControl.calcMathPuzzle1(var1, var2); //incorrect answer
                    System.out.println("\n Bummer, your checked the wall and didn't find the secret"
                                     + "\n passage. Consult your dossier for additional clues to solve"
                                     + "\n the equation. Recalculate and try again or travel to another"
                                     + "\n location and try a different challenge.");
                    
                }
                if (answerOption == "2"){   //correct answer
                    var1=32;
                    var2=68;      
                    ChallengeControl.calcMathPuzzle1(var1, var2);
                    System.out.println("\n Great job! You have your first clue. After carefully"
                                     + "\n checking to see if anyone is watching, you slip the clue"
                                     + "\n in your pocket and return to the Safe House to contact your"
                                     + "\n handler and receive the dossier for your next mission.");
                }
                if (answerOption == "3"){   //incorrect answer
                    var1=30;
                    var2=66;      
                    ChallengeControl.calcMathPuzzle1(var1, var2);
                    System.out.println("\n Bummer, your checked the wall and didn't find the secret"
                                     + "\n passage. Consult your dossier for additional clues to solve"
                                     + "\n the equation. Recalculate and try again or travel to another"
                                     + "\n location and try a different challenge.");
                }
                break;
                
            case "1,2,3 && currentCountry == 'Spain'":  //They chose an answer for Spain challenge
                if (answerOption == "1"){   //correct answer
                    var1=74;
                    var2=30;      
                    ChallengeControl.calcMathPuzzle2(var1, var2);
                    System.out.println("\n Great job! You have your clue. After carefully checking "
                                     + "\n to see if anyone is watching, you slip the clue in your"
                                     + "\n pocket and return to the Safe House to contact your"
                                     + "\n handler and receive the dossier for your next mission.");   
                }
                if (answerOption == "2"){    //incorrect answer
                    var1=68;
                    var2=20;      
                    ChallengeControl.calcMathPuzzle2(var1, var2);
                    System.out.println("\n Bummer, your answer is incorrect. Consult your dossier"
                                     + "\n for additional clues to solve the puzzle. Recalculate and"
                                     + "\n try again or travel to another location and try a"
                                     + "\n different challenge.");
                }
                if (answerOption == "3"){    //incorrect answer
                    var1=65;
                    var2=20;      
                    ChallengeControl.calcMathPuzzle2(var1, var2);
                    System.out.println("\n Bummer, your answer is incorrect. Consult your dossier"
                                     + "\n for additional clues to solve the puzzle. Recalculate and"
                                     + "\n try again or travel to another location and try a"
                                     + "\n different challenge.");
                }
                break;
                
            case "1,2,3 && currentCountry == 'Russia'": //They chose an answer for Russia challenge
                 if (answerOption == "1"){   //incorrect answer 31666
                    var1=500;
                    var2=95;
                    var3=6;
                    var4=3;
                    ChallengeControl.calcMathPuzzle3(var1, var2, var3, var4);
                    System.out.println("\n Bummer, your answer is incorrect. Consult your dossier"
                                     + "\n for additional clues to solve the puzzle. Recalculate and"
                                     + "\n try again or travel to another location and try a"
                                     + "\n different challenge.");
                }
                if (answerOption == "2"){    //correct answer 10000
                    var1=200;
                    var2=75;
                    var3=6;
                    var4=3;
                    ChallengeControl.calcMathPuzzle3(var1, var2, var3, var4);
                    System.out.println("\n Great job! You have your clue. After carefully checking "
                                     + "\n to see if anyone is watching, you slip the clue in your"
                                     + "\n pocket and return to the Safe House to contact your"
                                     + "\n handler and receive the dossier for your next mission.");   
                }
                if (answerOption == "3"){    //incorrect answer 1666
                    var1=100;
                    var2=25;
                    var3=6;
                    var4=3;
                    ChallengeControl.calcMathPuzzle3(var1, var2, var3, var4);
                    System.out.println("\n Bummer, your answer is incorrect. Consult your dossier"
                                     + "\n for additional clues to solve the puzzle. Recalculate and"
                                     + "\n try again or travel to another location and try a"
                                     + "\n different challenge.");
                }
                break;
                
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
          
        }

        return false;
    }


}   
 


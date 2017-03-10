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
public class ChallengeRiddleView extends View {
    
    private String answerOption;

    public ChallengeRiddleView() {
        super();
        Country currentCountry = Snipe.getPlayer().getCurrentCountry();
        
       switch (currentCountry.getName()) {
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
                                 + "\n Type 1 - Yes, It is legal in California and Colorado."
                                 + "\n Type 2 -  No, It is not legal to get married if you are dead.");
                break;
            case "Germany": //display the question
                System.out.println("\n You have arrived at a small cottage hidden along the mossy"
                                 + "\n covered hillside. This is the safe-house in Germany. You look"
                                 + "\n around the cottage for the key and find a riddle that contains"
                                 + "\n the code to the lock on the door. Once inside you can report"
                                 + "\n back to your handler and receive the next dossier for your"
                                 + "\n mission. Puzzle: What can run, but never walks, has a mouth,"
                                 + "\n but never talks, has a head but never weeps, has a bed but never"
                                 + "\n sleeps?"
                                 + "\n ==========================================================="
                                 + "\n Type 1 - River"
                                 + "\n Type 2 - Lucky Streak");
                break;
   
            case "England": //display the question
                System.out.println("\n Big Ben is the nickname for the Great Bell of the clock"
                                 + "\n at the north end of the palace of Westminster in London."
                                 + "\n It is one of London’s most famous landmarks. Blending"
                                 + "\n in with the tourists and locals here isn’t too difficult."
                                 + "\n You are watching for the man in the dark hat and gray scarf"
                                 + "\n that seems to be following you at times. The clock begins"
                                 + "\n to chime as a young man with dreadlocks, a black beard,"
                                 + "\n and a backpack, loses control of his skateboard and knocks"
                                 + "\n you to the ground. He apologizes, helps you to your feet, and"
                                 + "\n slips you a tattered envelope. With a sly smile, he winks at "
                                 + "\n you as he skates off into the crowded street. You open"
                                 + "\n the envelope and begin to decipher the clue."
                                 + "\n Puzzle: What are the only 4 words in the English language"
                                 + "\n that begin with the letters dw…? Please answer in alphabetic"
                                 + "\n order separated by commas."
                                 + "\n ==========================================================="
                                 + "\n Type 1 - Dwindel, Dwight, Dwarf, Dwane"
                                 + "\n Type 2 - Dwindle, Dwell, Dwarf, Dweeb");
           
                break;
            case "Spain": //display the question
                System.out.println("\n You step out of the taxi and into a blustery cold wind"
                                 + "\n that chills you to the bone. The largest Gothic style"
                                 + "\n Christian cathedral which took a century to build,"
                                 + "\n raises into the sky. This is the safe-house in Spain."
                                 + "\n You begin to walk around the great edifice and notice"
                                 + "\n an older gentleman wearing a black fedora, gray scarf,"
                                 + "\n and a trench coat pulled up tightly around his neck."
                                 + "\n You approach him cautiously, and he asks you a simple"
                                 + "\n question. “Which month has 28 days?” Answer this"
                                 + "\n correctly, and he will open the door to your safe"
                                 + "\n house. Once inside you can report back to your"
                                 + "\n handler and receive the next dossier for your mission."
                                 + "\n Puzzle: Which month has 28 days?"
                                 + "\n ========================================================"
                                 + "\n Type 1 - All the months"
                                 + "\n Type 2 - February");
                break;
 
            case "Russia": //display the question
                System.out.println("\n This old burial site has several monuments and you are"
                                 + "\n carefully examining each one as you try to look like a "
                                 + "\n tourist bundled up in your fur hooded coat. Lenin’s"
                                 + "\n Mausoleum is the safe house in Russia. On the west side"
                                 + "\n of the third statue, near the bottom, you notice what"
                                 + "\n looks like a scuff mark. As you examine it closely, you"
                                 + "\n pull out your magnifying glass to take a closer look."
                                 + "\n Scribbled in tiny letters is the code to unlock the safe"
                                 + "\n house door."
                                 + "\n Puzzle: What 5 letter word becomes shorter when you add"
                                 + "\n  2 letters to it?"
                                 + "\n ========================================================"
                                 + "\n Type 1 - litte"
                                 + "\n Type 2 - short");
                break;
            
            case "France": //display the question
                System.out.println("\n This museum is filled with tourists today. The paintings"
                                 + "\n are exquisite, and it is easy to lose the suspicious man"
                                 + "\n that seems to be tailing you. Now where is the painting of"
                                 + "\n Napoleon at Waterloo? You spot it as you walk among the"
                                 + "\n crowded hallways into through the north wing of the museum."
                                 + "\n The docent winks at you and begins to tell a story, all the"
                                 + "\n while looking at you. He is delivering your next clue with"
                                 + "\n with his story. The captain of the ship told an interesting"
                                 + "\n tale. “We had traveled the sea far and wide, and at one point"
                                 + "\n in time, two of my sailors were standing on opposite sides"
                                 + "\n of the ship. One was looking east and the other was looking"
                                 + "\n west. At this same time they could see each other clearly."
                                 + "\n 'How would this be possible?' The docent asks, as he leads the"
                                 + "\n tourists further down the corridor. Only a trained SNIPE agent"
                                 + "\n would know the answer to retrieve the next clue."
                                 + "\n ========================================================"
                                 + "\n Type 1 - X-Ray vision"
                                 + "\n Type 2 - Window");
                break;
            case "Canada": //display the question
                System.out.println("\n This is one big library, filled with hundreds of thousands"
                                 + "\n are exquisite, and it is easy to lose the suspicious man"
                                 + "\n of books. You need to find the one volume that contains "
                                 + "\n your next clue. You walk down the south corridor passing"
                                 + "\n many people who are silently reading. You look around and"
                                 + "\n see a librarian, who motions with her finger for you to"
                                 + "\n follow her. She hands you a paper with the number 10067.9D."
                                 + "\n You look through the long rows of shelves in library for"
                                 + "\n some time before finding row 10067.9D. You open the old leather"
                                 + "\n bound text and find this clue."
                                 + "\n Puzzle: What does December have that other months don’t have?"
                                 + "\n ========================================================"
                                 + "\n Type 1 - Christmas!"
                                 + "\n Type 2 - The letter D");
                break;
            case "Brazil": //display the question
                System.out.println("\n The capital city is filled with tourists haggling with the"
                                 + "\n street vendors over prices. You weave in and out of the crowd"
                                 + "\n looking for your contact at the fireworks stand. You spot him"
                                 + "\n near the bright pink adobe building. This is the safe house in"
                                 + "\n Brazil. As your contact shakes your hand, and begins speaking"
                                 + "\n Portuguese, he slips something into your pocket. Fortunately,"
                                 + "\n the clue inside the tattered envelope you receive is in English."
                                 + "\n You are anxious to get out of the heat and humidity, take a"
                                 + "\n shower, You are anxious to get out of the heat and humidity,"
                                 + "\n take a shower, and get some rest."
                                 + "\n Puzzle: I am the beginning of end, and the end of time and space."
                                 + "\n I am essential to creation, and I surround every place. Who am I?"
                                 + "\n ========================================================"
                                 + "\n Type 1 - The letter E"
                                 + "\n Type 2 - Heavenly Father");
                break; 
            case "Australia": //display the question
                System.out.println("\n Today has been exhausting and painful. You really need a break"
                                 + "\n to rest and recover. The most unlikely place for a safe-house"
                                 + "\n happens to be in the basement of the Old Melbourne Jail. This"
                                 + "\n is the safe-house for Australia. A nice comfy bed, hot shower"
                                 + "\n and air conditioning is sounding so good right about now.  The"
                                 + "\n only thing standing between you and the secret entrance door is"
                                 + "\n the answer to this clue."
                                 + "\n Puzzle: What kind of coat is always wet when you put it on?"
                                 + "\n ========================================================"
                                 + "\n Type 1 - A rain coat"
                                 + "\n Type 2 - A coat of wet paint");
                break; 
            default:
                System.out.println("\n*** Country not built out yet - call Programmer");
                break;
        }
  
    }

    public void displayMenuView() {

        boolean done = false; //set flag to not done
        do {
            String answerOption = this.getInput();

            //do the requested action and display the next view
            done = this.doAction(answerOption);

        } while (!done);
    }


    @Override
    public boolean doAction(String choice) {
        
        switch (answerOption) {
            case "1,2 && currentCountry == 'USA'":
                if (answerOption == "1"){
                    System.out.println("\n Bummer, your answer is incorrect. Consult your dossier"
                                     + "\n for additional clues to solve the puzzle. Recalculate and"
                                     + "\n try again or travel to another location and try a different"
                                     + "\n challenge.");
                     
                }
                if (answerOption == "2"){
                    System.out.println("\n Great job! You have your clue. After carefully checking "
                                    +  "\n to see if anyone is watching, you slip the clue in your"
                                    +  "\n pocket and return to the Safe House to contact your"
                                    +  "\n handler and receive the dossier for your next mission.");   
                }
                break;
                
            case "1,2 && currentCountry == 'Germany'": 
                if (answerOption == "1"){
                    System.out.println("\n Great job! You use the code to enter the safe-house. After"
                                     + "\n a  brief rest, you contact your handler and pick up the"
                                     + "\n dossier for your next mission. Good Luck!");
                }
                if (answerOption == "2"){
                    System.out.println("\n Bummer, your answer is incorrect and the door won’t open."
                                     + "\n Try checking your dossier for another hint and try again."
                                     + "\n Remember you are a SNIPE agent, you can do it!");
  
                }
                break;
                
            case "1,2 && currentCountry == 'England'":
                 if (answerOption == "1"){
                     System.out.println("\n Bummer, your answer is incorrect and the door won’t open."
                                      + "\n Try checking your dossier for another hint and try again."
                                      + "\n Remember you are a SNIPE agent, you can do it!");
   
                }
                if (answerOption == "2"){
                    System.out.println("\n Great job! You use the code to enter the safe-house."
                                     + "\n After a brief rest, you contact your handler and pick"
                                     + "\n up the dossier for your next mission. Good Luck!");
                }
                break;
                
            case "1,2 && currentCountry == 'Spain'":
                 if (answerOption == "1"){
                     System.out.println("\n Great job! You use the code to enter the safe-house."
                                      + "\n After a brief rest, you contact your handler and pick"
                                      + "\n up the dossier for your next mission. Good Luck!");
                }
                if (answerOption == "2"){
                    System.out.println("\n Bummer, your answer is incorrect and the door won’t open."
                                     + "\n Try checking your dossier for another hint and try again."
                                     + "\n again. Remember you are a SNIPE agent, you can do it!");
                }
                break;
                
            case "1,2 && currentCountry == 'Russia'":
                 if (answerOption == "1"){
                     System.out.println("\n Bummer, your answer is incorrect. Consult your dossier"
                                      + "\n for additional clues to solve the puzzle. Recalculate and"
                                      + "\n try again or travel to another location and try a"
                                      + "\n different challenge.");
                }
                if (answerOption == "2"){
                    System.out.println("\n Great job! You have your first clue. After carefully"
                                     + "\n checking to see if anyone is watching, you slip the clue"
                                     + "\n in your pocket and return to the Safe House to contact your"
                                     + "\n handler and receive the dossier for your next mission.");
                }
                break;
                    
            case "1,2 && currentCountry == 'France'":
                 if (answerOption == "1"){
                    System.out.println("\n Bummer, your answer is incorrect and the door won’t open."
                                     + "\n Try checking your dossier for another hint and try again."
                                     + "\n Remember you are a SNIPE agent, you can do it!");
                }
                if (answerOption == "2"){
                    System.out.println("\n Great job! You use the code to enter the safe-house."
                                     + "\n After a brief rest, you contact your handler and pick"
                                     + "\n up the dossier for your next mission. Good Luck!");
                }
                break;
                
            case "1,2 && currentCountry == 'Canada'": //They chose an answer for Russia challenge
                 if (answerOption == "1"){
                    System.out.println("\n Bummer, your answer is incorrect. Consult your dossier"
                                     + "\n for additional clues to solve the puzzle. Recalculate and"
                                     + "\n try again or travel to another location and try a"
                                     + "\n different challenge.");
                }
                if (answerOption == "2"){
                    System.out.println("\n Great job! You have your clue. After carefully"
                                     + "\n checking to see if anyone is watching, you slip the clue"
                                     + "\n in your pocket and return to the Safe House to contact your"
                                     + "\n handler and receive the dossier for your next mission.");
                }
                break;
                
            case "1,2 && currentCountry == 'Brazil'":
                 if (answerOption == "1"){
                    System.out.println("\n Great job! You use the code to enter the safe-house."
                                     + "\n After a brief rest, you contact your handler and pick"
                                     + "\n up the dossier for your next mission. Good Luck!");
                }
                if (answerOption == "2"){
                    System.out.println("\n Bummer, your answer is incorrect and the door won’t open."
                                     + "\n Try checking your dossier for another hint and try again."
                                     + "\n Remember you are a SNIPE agent, you can do it!");
                }
                break;
                
            case "1,2 && currentCountry == 'Australia'":
                 if (answerOption == "1"){
                    System.out.println("\n Bummer, your answer is incorrect and the door won’t open."
                                     + "\n Try checking your dossier for another hint and try again."
                                     + "\n Remember you are a SNIPE agent, you can do it!");
                }
                if (answerOption == "2"){
                    System.out.println("\n Great job! You use the code to enter the safe-house."
                                     + "\n After a brief rest, you contact your handler and pick"
                                     + "\n up the dossier for your next mission. Good Luck!");
                }
                break;
                
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
          
        }

        return false;
    }
    
    
}

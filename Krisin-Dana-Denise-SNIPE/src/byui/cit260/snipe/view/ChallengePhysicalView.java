/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.view;

import byui.cit260.snipe.model.Country;
import byui.cit260.snipe.control.GameControl;
import java.util.Scanner;
import snipe.Snipe;
import byui.cit260.snipe.model.Place;
/**
 *
 * @author danahudrlik
 */

/* 
constructor function

Challenge2Physical(): void
BEGIN
   display description of physical challenge
END
*/

public class ChallengePhysicalView extends View{
    
    private String displayDescription; 
    private String answerOption;
    
    public ChallengePhysicalView() {
        super();
        //identify the country player is in
    Country currentCountry = Snipe.getPlayer().getCurrentCountry();  
    

        this.displayDescription = "\n Welcome to  "+ currentCountry+".";
        //welcome player to the country
        
        //display the description of the challenge       
        this.displayDescription();
    }

    /**
     * display description of physical challenge
     */
    public static void displayDescription() {

       //case switch to identify country and display the description of the challenge 
        switch ("currentCountry"){
            case "USA":
                System.out.println(
                    "\n***********************************************************"
                  + "\n* The Gateway Arch in St. Louis, Missouri is world famous *"
                  + "\n* and tourists from all over the world come to see it.    *"
                  + "\n* Blending into the crowd will not be hard, but finding   *"
                  + "\n* the exact location of your next clue from the top of    *"
                  + "\n* the arch at sunrise, is going to be challenging. The    *"
                  + "\n* direction the sun bounces off the top of the arch at    *"
                  + "\n* this time of year will point you towards the location   *"
                  + "\n* of your next clue. You devise a plan and don a disguise *"
                  + "\n* as a maintenance man who will be cleaning the arch. You *"
                  + "\n* scale up the arch with your climbing gear, cleaning as  *"
                  + "\n* you go. It is quite slippery, but you are hanging on    *"
                  + "\n* tight, and moving ever so slowly as not to fall. You    *"
                  + "\n* finally make it to the top just as the sun is rising    *"
                  + "\n* and you see in the distance a large clock tower that is *"
                  + "\n* glowing in the reflection from the arch. You now know   *"
                  + "\n* where the clue is, but getting down is going to be a    *"
                  + "\n* challenge. Go slowly and try not to fall.               *"
                  + "\n***********************************************************"
                  + "\n* Press Z to continue.                                    *"
                  + "\n***********************************************************");
                break;
                
            case "Germany": 
                System.out.println(
                    "\n***********************************************************"
                  + "\n* You arrive in front of the majestic Cologne Cathedral.  *"
                  + "\n* The intricate detail of the building with spires        *"
                  + "\n* reaching for the heavens would suggest this massive     *"
                  + "\n* building has been around for centuries. You go inside   *"
                  + "\n* inside to see the beauty of the building amplifies with *"
                  + "\n* gorgeous arches, doors and stunning leaded glass        *"
                  + "\n* windows. You walk down a long arched hallway lined with *"
                  + "\n* marble columns to find a door at the end. You open it   *"
                  + "\n* and a stairway leads down to a lower level. You find    *"
                  + "\n* the painting of an old ship hanging on the wall in the  *"
                  + "\n* west wing. After looking around to ensure no one is     *"
                  + "\n* watching you, you carefully reach around the painting   *"
                  + "\n* and slide your hand down the back side of the frame.    *"
                  + "\n* You remove the tattered envelope and read your next     *"
                  + "\n* clue:                                                   *"
                  + "\n* A ladder is over the side of a ship anchored in port.   *"
                  + "\n* The bottom rung of the ladder touches the water. The    *"
                  + "\n* distance between rungs is 18 inches and the length of   *"
                  + "\n* the ladder is 180 inches. The tide is rising at a rate  *"
                  + "\n* of 6 inches per hour. When will the water reach the 7th *"
                  + "\n* rung from the top?                                      *"
                  + "\n***********************************************************"
                  + "\n* Choose your answer:                                     *"
                  + "\n***********************************************************");
                break;

            case "Germany": 
                System.out.println(
                    "\n***********************************************************"
                  + "\n* You arrive in front of the majestic Cologne Cathedral.  *"
                  + "\n* The intricate detail of the building with spires        *"
                  + "\n* reaching for the heavens would suggest this massive     *"
                  + "\n* building has been around for centuries. You go inside   *"
                  + "\n* inside to see the beauty of the building amplifies with *"
                  + "\n* gorgeous arches, doors and stunning leaded glass        *"
                  + "\n* windows. You walk down a long arched hallway lined with *"
                  + "\n* marble columns to find a door at the end. You open it   *"
                  + "\n* and a stairway leads down to a lower level. You find    *"
                  + "\n* the painting of an old ship hanging on the wall in the  *"
                  + "\n* west wing. After looking around to ensure no one is     *"
                  + "\n* watching you, you carefully reach around the painting   *"
                  + "\n* and slide your hand down the back side of the frame.    *"
                  + "\n* You remove the tattered envelope and read your next     *"
                  + "\n* clue:                                                   *"
                  + "\n* A ladder is over the side of a ship anchored in port.   *"
                  + "\n* The bottom rung of the ladder touches the water. The    *"
                  + "\n* distance between rungs is 18 inches and the length of   *"
                  + "\n* the ladder is 180 inches. The tide is rising at a rate  *"
                  + "\n* of 6 inches per hour. When will the water reach the 7th *"
                  + "\n* rung from the top?                                      *"
                  + "\n***********************************************************"
                  + "\n* Choose your answer:                                     *"
                  + "\n***********************************************************");
                break;                
                
            default:
                System.out.println("\n*** Country not built out yet.");
                break;        
    
// function to determine if success or failure
// 
        
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
    public boolean doAction(String value) {
        System.out.println("\n*** doAction stub function called ***");
        return false;
    }
    
    
    
}

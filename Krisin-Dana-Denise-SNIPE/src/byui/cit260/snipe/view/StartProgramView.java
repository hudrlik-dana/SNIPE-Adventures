/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.view;

import byui.cit260.snipe.control.GameControl;
import byui.cit260.snipe.model.Player;
import java.util.Scanner;

/**
 *
 * @author aingealfire@gmail.com (new16014@byui.edu)
 *
 * Welcome Screen / Start Screen
 */
public class StartProgramView {

    private String promptMessage;

    public StartProgramView() {
        //promptMessage = "Please enter your name"
        
        this.promptMessage = "\nPlease enter your name:";
        //display banner when view is created
        
        this.displayBanner();
    }

    private void displayBanner() {
        System.out.println(
                "\n******************************************************************************************"
                + "\n*                                                                                        *"
                + "\n*		 *******     |*    |     *      ********      **********                 *"
                + "\n*		| 	     | *   |     |     |	|     |                          *"
                + "\n*		 *******     |  *  |     |     |********      ********                   *"
                + "\n*			|    |   * |     |     |	      |                          *"
                + "\n*		 *******     |    *|     |     |	      **********                 *"
                + "\n*                                                                                        *"
                + "\n******************************************************************************************"
                + "\n*                         WHERE ADVENTURE AND DUTY MEET                                  *"
                + "\n*                                                                                        *"
                + "\n* S.N.I.P.E. Academy is the newest agency to join the alphabet club (FBI, CIA, ICU).     *"
                + "\n* They are a small, secret, highly sought after organization. They are also very picky   *"
                + "\n* about who they select, because they are invisible to the rest of the world. They have  *"
                + "\n* been hunted by many and found by only those they permit to find them.                  *"
                + "\n*                                                                                        *"
                + "\n* You have been selected to be one of these elite agents. You need to prove your         *"
                + "\n* knowledge and skills are worthy of this title. On completion of the final training     *"
                + "\n* mission, you will receive your credentials. You will need to collect pieces of a       *"
                + "\n* master code that has been divided and scattered across several countries.              *"
                + "\n*                                                                                        *"
                + "\n* <Please hit N enter your name and begin your first mission>                            *"
                + "\n*                                                                                        *"
                + "\n******************************************************************************************"
        );

    }
    
  /*  
    Basic template for displaying a view: 
    BEGIN
        do
            prompt for and get playersName
            if playersName =='X'  *typically 'Q', our game menu is 'X'
                return
        
        do  requested action and display next view
        
        while the veiw is not done
    END
*/      
    
    public void displayStartProgramView() { 
        //displays the start program view 
        
        boolean done = false; //set flag to not done
        do {
            //prompt for and get player's name
            String playerName = this.getPlayerName();
            if (playerName.toUpperCase().equals("X")) {//user wants to quit
            
                return; //exit the game
            }
            //do the requested action and display the next view
            done = this.doAction(playerName);

        } while (!done);
    }

    /*
    Template for getting user input - prompt for and get user input
        getInput(): value
        BEGIN
            WHILE a valid value has not been entered
                DISPLAY a message prompting the user to enter a value
                GET the value entered from the keyboard
                Trim front and trailing blanks off of the value
    
                IF the length of the value is blank or <1  THEN
                    DISPLAY "Invalid value: The value cannot be blank"
                    CONTINUE
                ENDIF
    
                BREAK
    
            ENDWHILE
    
            RETURN value
        END
    */
    
    private String getPlayerName() {
        Scanner keyboard = new Scanner(System.in); //get infile for Keyboard
        String value = ""; //value to be returned
        boolean valid = false; //initialize to not valid

        while (!valid) {
            System.out.println("\n" + this.promptMessage);

            value = keyboard.nextLine(); //get next line typed on keyboard
            value = value.trim(); //trim off leading and trailing blanks

            if (value.length() < 1) { // value is blank
                System.out.println("\nInvalid: name cannot be blank");
                continue;
            }
            break; //end the loop
        }
        return value; //return entered value
    }
    
    /*
    doAction(playersName): boolean
    BEGIN
        IF the length of the playersName < 2 THEN
            display "Invalid name: The name must be > 1 character"
            RETURN false
    
        create Player with specified name
        IF unsuccessful THEN
            display "Invalid name: The name is too short"
            RETURN false
    
        display customized welcome message
        display mainMenuView
    
        RETURN true
    END
    */
    
    private boolean doAction(String playerName) {

        if (playerName.length() < 2) {
            System.out.println("\nInvalid players name: Your name must be more than one character in length.");
            return false;
        }

        //call createPlayer() control function
        Player player = GameControl.createPlayer(playerName);

        if (player == null) {//if unsuccessful
            System.out.println("\nError creating the player");
            return false;
        }
        
        //display next view
        this.displayNextView(player);

        return true; //Success! 
    }
    
/*
    displayNextView(player): Player
    BEGIN
        Print a customized welcome message
    
        Create a MainMenuView
        Display the MainMenuView
    END
*/
    
    private void displayNextView(Player player) {
        
        //display a custom welcome message
        System.out.println("\n****************************************************************"
                          +"\n Welcome, " + player.getName() + " to your final training"
                          +"\n at the S.N.I.P.E. Academy. Successful completion is required"
                          +"\n for graduation to the status of a top-secret agent. This "
                          +"\n mission is not without risk."
                          +"\n"
                          +"\n Select New Game from the Menu to begin."
                          +"\n****************************************************************"
        );
        
        //Create MainMenuView object
        MainMenuView mainMenuView = new MainMenuView();
        
        //Display the main menu view
        mainMenuView.displayMenuView();
    }

//System.out.println("\n*** functionName() function called ***");
}

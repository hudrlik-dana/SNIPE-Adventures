package byui.cit260.snipe.view;

import byui.cit260.snipe.control.GameControl;
import byui.cit260.snipe.exceptions.GameControlException;
import byui.cit260.snipe.model.Player;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

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
                + "\n******************************************************************************************"
        );

    }

    public void displayStartProgramView() throws GameControlException {
        //displays the start program view 

        boolean done = false; //set flag to not done
        do {
            //prompt for and get player's name
            String playerName = this.getPlayerName();
            if (playerName.toUpperCase().equals("Q")) {//user wants to quit

                return; //exit the game
            }
            //do the requested action and display the next view
            done = this.doAction(playerName);

        } while (!done);
    }

    private String getPlayerName() {
        Scanner keyboard = new Scanner(System.in); //get infile for Keyboard
        String value = ""; //value to be returned
        boolean valid = false; //initialize to not valid

        while (!valid) {
            System.out.println("\n" + this.promptMessage);

            value = keyboard.nextLine(); //get next line typed on keyboard

            value = value.trim(); //trim off leading and trailing blanks

            if (value.length() < 1) { // value is blank
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid: name cannot be blank");
                continue;
            }
            break; //end the loop
        }
        return value; //return entered value
    }

    private boolean doAction(String playerName) throws GameControlException {

        if (playerName.length() < 2) {
            ErrorView.display(this.getClass().getName(),
                    "\n***Invalid players name: Your name must be more than one character in length. ");

            return false;
        }

        //call createPlayer() control function
        Player player = GameControl.createPlayer(playerName);

        if (player == null) {//if unsuccessful
            ErrorView.display(this.getClass().getName(),
                    "\n***Error creating the player ");
            return false;
        }

        //display next view
        this.displayNextView(player);

        return true; //Success! 
    }

    private void displayNextView(Player player) {

        //display a custom welcome message
        System.out.println("\n****************************************************************"
                + "\n Welcome, " + player.getName() + " to your final training"
                + "\n at the S.N.I.P.E. Academy. Successful completion is required"
                + "\n for graduation to the status of a top-secret agent. This "
                + "\n mission is not without risk."
                + "\n"
                + "\n Select an option from the Menu to begin."
                + "\n****************************************************************"
        );

        //Create MainMenuView object
        MainMenuView mainMenuView = new MainMenuView();

        //Display the main menu view
        mainMenuView.display();
    }

}

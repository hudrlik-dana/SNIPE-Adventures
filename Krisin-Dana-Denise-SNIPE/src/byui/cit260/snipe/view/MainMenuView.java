/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.view;

import byui.cit260.snipe.control.GameControl;
//import byui.cit260.snipe.view.GameMenuView;
import java.util.Scanner;
import snipe.Snipe;

/**
 *
 * @author aingealfire@gmail.com (new16014@byui.edu)
 */
public class MainMenuView {

    private String menu;

    public MainMenuView() {
        this.menu = "\n"
                + "\n--------------------------------"
                + "\n Main Menu                      "
                + "\n--------------------------------"
                + "\n L - Load Existing Game         " //(This will lose any unsaved progress in the current game)
                + "\n N - Start New Game             " //(This will lose any unsaved progress in the current game)
                + "\n S - Save Game                  "
                + "\n R - Return to Player Location  "
                + "\n H - Help Menu                  "
                + "\n X - Exit Game                  " //(This will lose any unsaved progress in the current game)
                + "\n--------------------------------";
    }

/*  
    Basic template for displaying a view: 
    BEGIN
        do
            prompt for and get input value/s
            if (value == "X") THEN
                exit
        
        do  the action and display the next view
        
        while the view is not done
    END
*/
    
    // displays the start program view
    public void displayMenuView() {

        boolean done = false; //set flag to not done
        do {
            // prompt for and get players name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("X")) {  //user wants to quit
                return;    //exit the game
            }

            //do the requested action and display the next view
            done = this.doAction(menuOption);

        } while (!done);
    }

    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in); //get infile for Keyboard
        String value = ""; //value to be returned
        boolean valid = false; //initialize to not valid

        while (!valid) {
            System.out.println("\n" + this.menu);

            value = keyboard.nextLine(); //get next line typed on keyboard
            value = value.trim(); //trim off leading and trailing blanks

            if (value.length() < 1) { // value is blank
                System.out.println("\nInvalid: entry required.");
                continue;
            }
            break; //end the loop
        }

        return value; //return entered value
    }

/*
doAction(choice): void
    BEGIN
        convert choice to uppercase
        SWITCH choice
            "A":  description();
                break; 
            "B":  description();
                break;
        DEFAULT:DISPLAY "Invalid selection"
        ENDSWITCH
        RETURN false
    END
*/
    private boolean doAction(String choice) {

        choice = choice.toUpperCase(); //convert choice to upper case

        switch (choice) {   
            case "L": //Load Saved Game
                this.startSavedGame();
                break;
            case "N": //Start New Game
                this.startNewGame();
                break;
            case "S": //Save Current Game
                this.saveGame();
                break;
            case "R": //Return to Player Location
                this.displayPlayerCurrentScene();
                break;
            case "H": //Display Help Menu
                this.displayHelpMenu();
                break;
            case "X": //Exit Game
                this.exitGame();
                break;
            default:      
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;   
        }

        return false;

    }

    private void startSavedGame() {
        System.out.println("\n*** startSavedGame() function called ***");
    }

    private void startNewGame() {
        //create new game
        GameControl.createNewGame(Snipe.getPlayer());
        
        //display the game menu view
        GameMenuView gameMenu = new GameMenuView();
        //display the game menu
        gameMenu.displayMenu();
    }

    private void saveGame() {
        System.out.println("\n*** saveGame() function called ***");
    }

    private void displayPlayerCurrentScene() {
        System.out.println("\n*** displayPlayerCurrentScene() function called ***");
    }

    private void displayHelpMenu() {
        //display the help menu
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayMenu();
    }

    private void exitGame() {
        System.out.println("\n*** exitGame() function called ***");
    }

    
//System.out.println("\n*** functionName() function called ***");
}

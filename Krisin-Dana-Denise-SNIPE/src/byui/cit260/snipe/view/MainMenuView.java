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

public class MainMenuView extends View {

    public MainMenuView() {
        super("\n"
                + "\n--------------------------------"
                + "\n Main Menu                      "
                + "\n--------------------------------"
                + "\n L - Load Existing Game         " 
                + "\n N - Start New Game             " 
                + "\n S - Save Game                  "
                + "\n R - Return to Player Location  "
                + "\n H - Help Menu                  "
                + "\n Q - Exit Game                  " 
                + "\n--------------------------------");
    }


    @Override
    public boolean doAction(String choice) {

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
            case "Q": //Exit Game
                return true;
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
        gameMenu.display();
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
        helpMenu.display();
    }


//System.out.println("\n*** functionName() function called ***");
}

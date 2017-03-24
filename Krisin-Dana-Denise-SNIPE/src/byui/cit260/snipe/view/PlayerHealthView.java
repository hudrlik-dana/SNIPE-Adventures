/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.view;

import byui.cit260.snipe.exceptions.GameControlException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import snipe.Snipe;

/**
 * @author dana.hudrlik
 */
public class PlayerHealthView extends View {

    public PlayerHealthView() {
        super("\n"
                + "\n-----------------------------------------------------------"
                + "\nPlayer Health"
                + "\n-----------------------------------------------------------"
                + "\n"
                + "\n* Your current Health Points: " + Snipe.getPlayer().getPlayerHealth() + " "
                + "\n"
                + "\n-----------------------------------------------------------"
                + "\n R - Return to Player Location                           "
                + "\n M - Main Menu                                           "
                + "\n H - Help Menu                                           "
                + "\n-----------------------------------------------------------");
    }

    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase(); //convert choice to upper case
        switch (choice) {
            case "R": {
                try {
                    //Return to Player Location
                    this.displayPlayerCurrentScene();
                } catch (GameControlException ex) {
                    Logger.getLogger(PlayerHealthView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;
            case "M": {
                try {
                    //Return to Main Menu
                    this.displayMainMenu();
                } catch (GameControlException ex) {
                    Logger.getLogger(PlayerHealthView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;
            case "H": {
                try {
                    //Display Help Menu
                    this.displayHelpMenu();
                } catch (GameControlException ex) {
                    Logger.getLogger(PlayerHealthView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;
            default:
                //              this.console.println("\n*** Invalid Selection *** Try Again");
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid Selection *** Try Again");
                break;
        }

        return false;
    }

    private void displayMainMenu() throws GameControlException {
        //display the main menu 
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
    }

    private void displayHelpMenu() throws GameControlException {
        //display the help menu 
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void displayPlayerCurrentScene() throws GameControlException {
        this.console.println(Snipe.getPlayer().getCurrentPlace().getPlaceScene());
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }
}

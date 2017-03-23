/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.view;

import byui.cit260.snipe.exceptions.GameControlException;
import java.util.Scanner;
import snipe.Snipe;
import byui.cit260.snipe.model.Dossier;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aingealfire@gmail.com (new16014@byui.edu)
 */
public class GameMenuView extends View {

    //private final String menu;
    public GameMenuView() {
        super("\n"
                + "\n-----------------------------------------------------------"
                + "\n Game Menu                                                "
                + "\n-----------------------------------------------------------"
                + "\n"
                + "\n D - View Dossier"
                + "\n C - View Collected Codes"
                + "\n P - View Player Health"
                + "\n T - Travel"
                + "\n V - View Map"
                + "\n M - Main Menu"
                + "\n H - Help Menu"
                + "\n-----------------------------------------------------------");
    }

    @Override
    public boolean doAction(String choice) {

        choice = choice.toUpperCase(); //convert choice to upper case

        switch (choice) {
            case "D": {
                try {
                    //Show current country Dossier
                    this.displayDossierView();
                } catch (GameControlException ex) {
                    Logger.getLogger(GameMenuView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;
            case "C": {
                try {
                    //Display list of collected codes
                    this.displayCollectedCodesView();
                } catch (GameControlException ex) {
                    Logger.getLogger(GameMenuView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;
            case "P": {
                try {
                    //display player health
                    this.displayPlayerHealthView();
                } catch (GameControlException ex) {
                    Logger.getLogger(GameMenuView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;
            case "T": {
                try {
 //                 if (ischallengeComplete and ispasscollected) {
 //                    this.displayTravelMenuView(); 
 //                  }
 //                 else{
 //                    this.console.println("\n-----------------------------------------------------------"
 //                                       + "You have not visied the safehouse. You  need to visit the "
 //                                       + "safehouse to collect your next dossier before traveling."); 
 //                         }    
                    //display the TravelMenu
                    this.displayTravelMenuView();
                } catch (GameControlException ex) {
                    Logger.getLogger(GameMenuView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;
            case "V": {
                try {
                    //display the map
                    this.displayMap();
                } catch (GameControlException ex) {
                    Logger.getLogger(GameMenuView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;
            case "M": {
                try {
                    //Return to Main Menu
                    this.displayMainMenu();
                } catch (GameControlException ex) {
                    Logger.getLogger(GameMenuView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;
            case "H": {
                try {
                    //Display Help Menu
                    this.displayHelpMenu();
                } catch (GameControlException ex) {
                    Logger.getLogger(GameMenuView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;
            default:
//                this.console.println("\n*** Invalid Selection *** Try Again");
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

    private void displayMap() throws GameControlException {
        //display the travel menu
        MapMenuView mapMenu = new MapMenuView();
        mapMenu.display();
    }

    private void displayTravelMenuView() throws GameControlException {
        //display the travel menu
        TravelMenuView travelMenu = new TravelMenuView();
        travelMenu.display();
    }

    private void displayPlayerHealthView() throws GameControlException {
        //display the player Health
        PlayerHealthView playerHealth = new PlayerHealthView();
        playerHealth.display();
    }

    private void displayCollectedCodesView() throws GameControlException {
        //display the Collected Codes
        CollectedCodesView collectedCodes = new CollectedCodesView();
        collectedCodes.display();
    }

    private void displayDossierView() throws GameControlException {
        DossierView dossierView = new DossierView();
        dossierView.display();
    }

}

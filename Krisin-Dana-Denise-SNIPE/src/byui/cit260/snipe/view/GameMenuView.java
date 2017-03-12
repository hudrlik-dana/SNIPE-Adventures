/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.snipe.view;

import java.util.Scanner;
import snipe.Snipe;
import byui.cit260.snipe.model.Dossier;

/**
 *
 * @author aingealfire@gmail.com (new16014@byui.edu)
 */
public class GameMenuView extends View{
    
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
            case "D": //Show current country Dossier
                this.displayDossierView();
                break;
            case "C": //Display list of collected codes
                this.displayCollectedCodesView();
                break;
            case "P": //display player health
                this.displayPlayerHealthView();
                break;
            case "T": //display the TravelMenu
                this.displayTravelMenuView();
                break;
            case "V": //display the map
                this.displayMap();
                break;
            case "M": //Return to Main Menu
                this.displayMainMenu();
                break;
            case "H": //Display Help Menu
                this.displayHelpMenu();
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
        }

        return false;
    }

    private void displayMainMenu() {
        //display the main menu
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
    }

    private void displayHelpMenu() {
        //display the help menu
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void displayMap() {
        //display the travel menu
        MapMenuView mapMenu = new MapMenuView();
        mapMenu.display();
    }

    private void displayTravelMenuView() {
        //display the travel menu
        TravelMenuView travelMenu = new TravelMenuView();
        travelMenu.display();
    }

    private void displayPlayerHealthView() {
        //display the player Health
        PlayerHealthView playerHealth = new PlayerHealthView();
        playerHealth.display();
    }

    private void displayCollectedCodesView() {
        System.out.println("\n*** displayCollectedCodesView stub function called ***");
        
        /*
        System.out.println("You have the following Codes: ");
        for (Challenge challenge : Snipe.getPlayer().getMasterCodePiece()) {
            System.out.println(challenge.getMasterCodePieceName());
        */
    }

    private void displayDossierView() {
        DossierView dossierView = new DossierView();
        dossierView.display();
    }        
     
    
    
//System.out.println("\n*** functionName stub function called ***");
}





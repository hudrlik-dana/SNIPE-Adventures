/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.snipe.view;

import java.util.Scanner;

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
                + "\n D - View Dossier List"
                + "\n C - View Collected Codes"
                + "\n P - View Player Health"
                + "\n T - Travel"
                + "\n V - View Map"
                + "\n M - Main Menu"
                + "\n H - Help Menu"
                + "\n-----------------------------------------------------------");
    }

    /*public void display() {

        boolean done = false; //set flag to not done
        do {
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("X")) {
                return;
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
            }
            break; //end the loop
        }

        return value; //return entered value
    }*/

    @Override
    public boolean doAction(String choice) {

        choice = choice.toUpperCase(); //convert choice to upper case

        switch (choice) {
            case "D": //Travel to first location
                this.displayDossierListView();
                break;
            case "C": //Travel to second location
                this.displayCollectedCodesView();
                break;
            case "P": //Travel to third location
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
        travelMenu.displayMenuView();
    }

    private void displayPlayerHealthView() {
        //display the player Health
        PlayerHealthView playerHealth = new PlayerHealthView();
        playerHealth.display();
    }

    private void displayCollectedCodesView() {
        System.out.println("\n*** displayCollectedCodesView stub function called ***");
    }

    private void displayDossierListView() {
        System.out.println("\n*** displayDossierListView stub function called ***");
    }
    
    
//System.out.println("\n*** functionName stub function called ***");
}





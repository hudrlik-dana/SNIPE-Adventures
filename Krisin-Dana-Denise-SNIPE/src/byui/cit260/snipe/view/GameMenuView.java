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
import byui.cit260.snipe.model.World;
import java.io.IOException;
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
                + "\n-----------------------------------------------------------"
                + "\n-----------------------------------------------------------"
                + "\n Print to File Functions"
                + "\n "
                + "\n 1 - Print Code List to File"
                + "\n 2 - Print Passport to File"
                + "\n 3 - Print List of Countries"
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
            case "1":
                this.writeCodeList();
                break;
            case "2":
                this.writePassport();
                break;
            case "3":
                this.writeCountries();
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

    private void writeCodeList() {
        String filePath = null;
        boolean valid = false;

        this.console.println("Enter the name you want to save your Code List as: ");
        while (!valid) {
            try {
                //prompt for player input

                filePath = this.keyboard.readLine();
                filePath = filePath.trim();

                if (filePath.length() < 1) {
                    ErrorView.display(this.getClass().getName(),
                            "\n***Invalid: entry required.!");
                } else {
                    valid = true;
                }

            } catch (IOException ex) {
                Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        try {
            //save inventory list to specified file
            WriteCodeList.writeCodeList(Snipe.getPlayer().getCodeList(), filePath);
            this.console.println("\nCode List successfully written to file " + filePath + ".");
        } catch (IOException ioe) {
            ErrorView.display("GameMenuView", ioe.getMessage());

        }
    }

    private void writePassport() {
        String filePath = null;
        boolean valid = false;

        this.console.println("Enter the name you want to save your Passport List as: ");
        while (!valid) {
            try {
                //prompt for player input

                filePath = this.keyboard.readLine();
                filePath = filePath.trim();

                if (filePath.length() < 1) {
                    ErrorView.display(this.getClass().getName(),
                            "\n***Invalid: entry required.!");
                } else {
                    valid = true;
                }

            } catch (IOException ex) {
                Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        try {
            //save inventory list to specified file
            WritePassportList.writePassportList(Snipe.getPlayer().getCodeList(), filePath);
            this.console.println("\nPassport List successfully written to file " + filePath + ".");
        } catch (IOException ioe) {
            ErrorView.display("GameMenuView", ioe.getMessage());

        }
    }

    private void writeCountries() {
        String filePath = null;
        boolean valid = false;
        World world = Snipe.getCurrentGame().getWorld();

        this.console.println("Enter the name you want to save your Country/Place List as: ");
        while (!valid) {
            try {
                //prompt for player input

                filePath = this.keyboard.readLine();
                filePath = filePath.trim();

                if (filePath.length() < 1) {
                    ErrorView.display(this.getClass().getName(),
                            "\n***Invalid: entry required.!");
                } else {
                    valid = true;
                }

            } catch (IOException ex) {
                Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        try {
            //save inventory list to specified file
            WriteCountryList.WriteCountryList(filePath);
            this.console.println("\nCountry/Place List successfully written to file " + filePath + ".");
        } catch (IOException ioe) {
            ErrorView.display("GameMenuView", ioe.getMessage());

        }
    }
}

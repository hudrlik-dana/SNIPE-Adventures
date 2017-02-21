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
public class TravelMenuView {

    private final String menu;

    public TravelMenuView() {
        this.menu = "\n"
                + "\n-----------------------------------------------------------"
                + "\n Travel Menu                                                "
                + "\n-----------------------------------------------------------"
                + "\n"
                + "\n 1 - <firstLocation>"
                + "\n 2 - <secondLocation>"
                + "\n 3 - <thirdLocation>"
                + "\n **************"
                + "\n V - View Map"
                + "\n M - Main Menu"
                + "\n H - Help Menu"
                + "\n-----------------------------------------------------------";
    }

    public void displayMenuView() {

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
    }

    private boolean doAction(String choice) {

        choice = choice.toUpperCase(); //convert choice to upper case

        switch (choice) {
            case "1": //Travel to first location
                this.displayPlaceOne();
                break;
            case "2": //Travel to second location
                this.displayPlaceTwo();
                break;
            case "3": //Travel to third location
                this.displayPlaceThree();
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
        mainMenu.displayMenuView();
    }

    private void displayHelpMenu() {
        //display the help menu
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayMenuView();
    }

    private void displayPlaceOne() {
        System.out.println("\n*** displayPlaceOne stub function called ***");
    }

    private void displayPlaceTwo() {
        System.out.println("\n*** displayPlaceTwo stub function called ***");
    }

    private void displayPlaceThree() {
        System.out.println("\n*** displayPlaceThree stub function called ***");
    }

    private void displayMap() {
        System.out.println("\n*** displayMap stub function called ***");
    }

//System.out.println("\n*** functionName stub function called ***");
}

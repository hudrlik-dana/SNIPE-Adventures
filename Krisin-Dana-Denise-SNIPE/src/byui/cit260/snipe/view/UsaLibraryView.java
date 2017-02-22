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
public class UsaLibraryView {

    private final String menu;

    public UsaLibraryView() {
        this.menu = "\n"
                + "\n-----------------------------------------------------------"
                + "\n USA - Library of Congress"
                + "\n-----------------------------------------------------------"
                + "\n "
                + "\n This library holds the president’s book of secrets and is"
                + "\n heavily guarded. You will need to be very alert to collect"
                + "\n your next clue. You have a special key to enter the back"
                + "\n rooms where you clue is located. Your clue will be inside"
                + "\n a leather bound, 1788 first edition, of the Federalists"
                + "\n Papers. This book is to the right, and 2 shelves down"
                + "\n from the president’s book of secrets. Remember, you are"
                + "\n not to look inside the president’s book. To get past the"
                + "\n first guard you will need a distraction that will draw"
                + "\n him away from his post at the stairwell. You find an"
                + "\n enterprising 12-year old and pay him $20 to pull the fire"
                + "\n alarm. Once the alarm sounds, the chaos and confusion has"
                + "\n the guards running around trying to get the tourists out"
                + "\n of the building. Using your stealthy SNIPE powers, you"
                + "\n slip past the guards unnoticed, quickly climb the stairs,"
                + "\n and use your key to unlock the first of 3 doors. A few"
                + "\n minutes later you are searching the shelves for the"
                + "\n leather-bound book holding your next clue. You find the"
                + "\n book and a tattered old paper falls to the floor. You"
                + "\n pick it up and read, "
                + "\n"
                + "\n“Is it legal for a man in California to marry his widow’s"
                + "\n sister?”  "
                + "\n"
                + "\nYou smile, and bury the book back on the shelf."
                + "\n-----------------------------------------------------------"
                + "\n"
                + "\n 1 - Yes"
                + "\n 2 - Only in San Freancisco"
                + "\n 3 - No"
                + "\n **************"
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
                this.displaySceneChoice1();
                break;
            case "2": //Travel to first location
                this.displaySceneChoice2();
                break;
            case "3": //Travel to first location
                this.displaySceneChoice3();
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

    private void displaySceneChoice1() {
        System.out.println("\n*** Incorrect Answer - <remove player health> & <Offer Retry> stub function called ***");
    }

    private void displaySceneChoice2() {
        System.out.println("\n*** Incorrect Answer - <remove player health> & <Offer Retry> stub function called ***");
    }

    private void displaySceneChoice3() {
        //reply to player, then display travel menu
        System.out.println("\n You got the Correct Answer! - <CollectCode> then <TravelMenuView> stub function called ***");
    }
    
    
    //System.out.println("\n*** functionName stub function called ***");
}





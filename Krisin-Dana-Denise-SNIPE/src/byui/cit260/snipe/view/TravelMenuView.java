/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.view;

import byui.cit260.snipe.control.GameControl;
import byui.cit260.snipe.exceptions.GameControlException;
import byui.cit260.snipe.model.Country;
import byui.cit260.snipe.model.Place;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import snipe.Snipe;

/**
 *
 * @author aingealfire@gmail.com (new16014@byui.edu)
 */
public class TravelMenuView extends View {

    private final String menu;

    public TravelMenuView() {
        super();
        Country currentCountry = Snipe.getPlayer().getCurrentCountry();

        String tempMenu = "\n"
                + "\n-----------------------------------------------------------"
                + "\n Travel Menu                                                "
                + "\n-----------------------------------------------------------"
                + "\n";

        for (int i = 0; i < currentCountry.getPlaces().size(); i++) {
            tempMenu += "\n " + (i + 1) + " - " + currentCountry.getPlaces().get(i).getPlaceName();
        }

        tempMenu += "\n **************"
                + "\n V - View Map"
                + "\n S - Save Game"
                + "\n H - Help Menu"
                + "\n-----------------------------------------------------------";

        this.menu = tempMenu;
    }

    @Override
    public void display() {

        boolean done = false; //set flag to not done
        do {
            String menuOption = this.getInput();

            if (menuOption.toUpperCase().equals("Q")) {
                return;
            }

            //do the requested action and display the next view
            done = this.doAction(menuOption);

        } while (!done);
    }

    @Override
    public String getInput() {
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

    @Override
    public boolean doAction(String choice) {

        choice = choice.toUpperCase(); //convert choice to upper case

        try {
            int numChoice = Integer.parseInt(choice);
            Snipe.getPlayer().setCurrentPlace(Snipe.getPlayer().getCurrentCountry().getPlaces().get(numChoice - 1));

            List<Place> passport = Snipe.getPlayer().getPassport();

            if (!passport.contains(Snipe.getPlayer().getCurrentPlace())) {
                passport.add(Snipe.getPlayer().getCurrentPlace());
            }

            //Output non-challenge description
            System.out.println(Snipe.getPlayer().getCurrentPlace().getPlaceScene());

            //IF PLAYER MOVEMENT TO A PLACE TRIGGERS CHALLENGE - OPEN THE CHALLENGE VIEW HERE
//            if(Snipe.getPlayer().getCurrentPlace().isChallenge()) {
            if (numChoice == 1) {
                //safe house 
                SafeHouseView safeHouse = new SafeHouseView();
                safeHouse.display();
            }
            if (numChoice == 2) {
                //First two lines don't work, why?  I don't know why? --Denise 
                //      It's fixed now! 
                //I learned I can't print all the stuff on Country object.  Doesn't know what you want. 
                //  Must specify the actual varable. Must be aware of the class and what you are asking for.
//              Country currentCountry = Snipe.getPlayer().getCurrentCountry();
//              System.out.println("\n this is second "  + currentCountry.getName());
// 
                //this line doesn't work also. don't know why --Denise
//              System.out.println("\n this is second " + Snipe.getPlayer().getCurrentCountry());
//
                //this line works
//              System.out.println("\n this is second " + Snipe.getPlayer().getCurrentPlace().getCountryCode());
//
                String countryCode;
                countryCode = Snipe.getPlayer().getCurrentPlace().getCountryCode();

                if (countryCode.matches("G|S|R")) {
                    //mental challenge-math (only Germany, Spain, Russia) 
                    ChallengeMentalView challenge2 = new ChallengeMentalView();
                    challenge2.display();
                } else {
                    //puzzle challenge
                    ChallengeRiddleView challenge2 = new ChallengeRiddleView();
                    challenge2.display();
                }
            }
            if (numChoice == 3) {
                //physical Challenges 
                ChallengePhysicalView challenge3 = new ChallengePhysicalView();
                challenge3.display();
            }
//         
            return true;
        } catch (IndexOutOfBoundsException ibe) {
            System.out.println("That place number doesn't exist!");
        } catch (Exception e) {
            //bury this
        }

        switch (choice) {
            case "V": //display the map
                System.out.println("You are at: " + Snipe.getPlayer().getCurrentPlace().getPlaceName());
//                this.displayMap();
                break;
            case "S": {
                try {
                    //Save Current Game
                    this.saveGame();
                } catch (GameControlException ex) {
                    Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
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

    private void saveGame() throws GameControlException {
        //prompt for and get the name of the file for saving
        SaveGameView saveGameView = new SaveGameView();
        String filePath = saveGameView.getInput();

        try {
            //save the game to the specified file
            GameControl.saveGame(Snipe.getCurrentGame(), filePath);

        } catch (GameControlException gce) {
            ErrorView.display("MainMenuView", gce.getMessage());
        }
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

//System.out.println("\n*** functionName stub function called ***");
}

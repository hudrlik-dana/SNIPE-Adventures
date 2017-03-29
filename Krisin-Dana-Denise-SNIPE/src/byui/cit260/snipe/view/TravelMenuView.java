package byui.cit260.snipe.view;

import byui.cit260.snipe.control.GameControl;
import byui.cit260.snipe.exceptions.GameControlException;
import byui.cit260.snipe.model.World;
import byui.cit260.snipe.model.Country;
import byui.cit260.snipe.model.Place;
import byui.cit260.snipe.model.Player;
import java.io.IOException;
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

        World world = Snipe.getCurrentGame().getWorld();
        Country currentCountry = Snipe.getPlayer().getCurrentCountry();

        if (Snipe.getPlayer().getCodeList() != null //not null means it does have a memory space avail for codelist. 
                && Snipe.getPlayer().getCodeList().size() == world.getCountries().indexOf(currentCountry) + 1
                //the below condition is checking for the current place within a country and making sure
                //it is safehouse=0 index or 1 on the menu. 
                && currentCountry.getPlaces().indexOf(Snipe.getPlayer().getCurrentPlace()) == 0) {
            //Get lastcode in Cyphercodes arraylist using size. Now you know how many codes are in the table. 
            int numOfCodesCollected = Snipe.getPlayer().getCodeList().size();

            //Taking the number of codes collected and setting it to current country. Updating it to currentCountry
            currentCountry = world.getCountries().get(numOfCodesCollected);
            //Setting the players currentCountry to the current country based on the above set currentCountry variable.
            Snipe.getPlayer().setCurrentCountry(currentCountry);
        }

        String tempMenu = "\n"
                + "\n-----------------------------------------------------------"
                + "\n Travel Menu"
                + "\n-----------------------------------------------------------"
                + "\n";
//spin thru  arraylist getting places and placenames from currentCountry
        for (int i = 0; i < currentCountry.getPlaces().size(); i++) {
            tempMenu += "\n " + (i + 1) + " - " + currentCountry.getPlaces().get(i).getPlaceName();
        }

        tempMenu += "\n-----------------------------------------------------------"
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
        String value = ""; //value to be returned
        boolean valid = false; //initialize to not valid

        while (!valid) {
            this.console.println("\n" + this.menu);

            try {
                value = keyboard.readLine(); //get next line typed on keyboard
            } catch (IOException ex) {
                Logger.getLogger(TravelMenuView.class.getName()).log(Level.SEVERE, null, ex);
            }
            value = value.trim(); //trim off leading and trailing blanks

            if (value.length() < 1) { // value is blank
                //               this.console.println("\nInvalid: entry required.");
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid: entry required.");
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
            this.console.println(Snipe.getPlayer().getCurrentPlace().getPlaceScene());

            //IF PLAYER MOVEMENT TO A PLACE TRIGGERS CHALLENGE - OPEN THE CHALLENGE VIEW HERE
            if (numChoice == 1) {
                //safe house 
                SafeHouseView safeHouse = new SafeHouseView();
                safeHouse.display();
            }
            if (numChoice == 2) {

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

            return true;
        } catch (IndexOutOfBoundsException ibe) {
            //           this.console.println("That place number doesn't exist!");
            ErrorView.display(this.getClass().getName(),
                    "\n*** That place number doesn't exist!");
        } catch (Exception e) {
            //bury this
        }

        switch (choice) {
            case "V": //display the map
                this.console.println("You are at: " + Snipe.getPlayer().getCurrentPlace().getPlaceName());
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
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid Selection *** Try Again");

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

}

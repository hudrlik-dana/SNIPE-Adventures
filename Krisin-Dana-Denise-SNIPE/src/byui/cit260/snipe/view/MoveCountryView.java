package byui.cit260.snipe.view;

import byui.cit260.snipe.exceptions.GameControlException;
import byui.cit260.snipe.model.Country;
import byui.cit260.snipe.model.Dossier;
import java.util.logging.Level;
import java.util.logging.Logger;
import snipe.Snipe;

/**
 *
 * @author aingealfire@gmail.com (new16014@byui.edu)
 */
public class MoveCountryView extends View {

    private final String menu;

    public MoveCountryView() {
        super();
        Country currentCountry = Snipe.getPlayer().getCurrentCountry();

        String tempMenu = "\n"
                + "\n-----------------------------------------------------------"
                + "\n Move to Next Country "
                + "\n-----------------------------------------------------------"
                + "\n You are currently in: " + Snipe.getPlayer().getCurrentCountry() + ""
                + "\n "
                + "\nYou will need to travel to a new Country. "
                + "\nPlease select from the countries below:";

        tempMenu += "\n-----------------------------------------------------------"
                + "\n 2 - Travel to: Germany"
                + "\n 3 - Travel to: England"
                + "\n 4 - Travel to: Spainn"
                + "\n 5 - Travel to: Russia"
                + "\n 6 - Travel to: France"
                + "\n 7 - Travel to: Canada"
                + "\n 8 - Travel to: Brazil"
                + "\n 9 - Travel to: Australia"
                + "\n-----------------------------------------------------------"
                + "\n R - Return to Player Location                           "
                + "\n M - Main Menu                                           "
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
    public boolean doAction(String choice) {

        choice = choice.toUpperCase(); //convert choice to upper case

        switch (choice) {
            case "1": //Show Dossier
                System.out.println(Dossier.values()[0]);
                break;
            case "2": //Show Dossier
                System.out.println(Dossier.values()[1]);
                break;
            case "3": //Show Dossier
                System.out.println(Dossier.values()[2]);
                break;
            case "4": //Show Dossier
                System.out.println(Dossier.values()[3]);
                break;
            case "5": //Show Dossier
                System.out.println(Dossier.values()[4]);
                break;
            case "6": //Show Dossier
                System.out.println(Dossier.values()[5]);
                break;
            case "7": //Show Dossier
                System.out.println(Dossier.values()[6]);
                break;
            case "8": //Show Dossier
                System.out.println(Dossier.values()[7]);
                break;
            case "9": //Show Dossier
                System.out.println(Dossier.values()[8]);
                break;
            case "G": {
                try {
                    //Return to Main Menu
                    this.displayGameMenu();
                } catch (GameControlException ex) {
                    Logger.getLogger(DossierView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;
            case "R": {
                try {
                    //Return to Player Location
                    this.displayPlayerCurrentScene();
                } catch (GameControlException ex) {
                    Logger.getLogger(DossierView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
        }
        return true;
    }

    private void displayGameMenu() throws GameControlException {
        //display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void displayPlayerCurrentScene() throws GameControlException {
        System.out.println(Snipe.getPlayer().getCurrentPlace().getPlaceScene());
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }
}

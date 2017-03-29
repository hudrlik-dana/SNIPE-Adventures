
package byui.cit260.snipe.view;

import byui.cit260.snipe.exceptions.GameControlException;
import byui.cit260.snipe.model.Country;
import java.util.logging.Level;
import java.util.logging.Logger;
import snipe.Snipe;

/**
 *
 * @author aingealfire@gmail.com (new16014@byui.edu)
 */
public class CollectedCodesView extends View {

    private final String menu;

    public CollectedCodesView() {
        super();
        Country currentCountry = Snipe.getPlayer().getCurrentCountry();

        String tempMenu = "\n"
                + "\n-----------------------------------------------------------"
                + "\n You Have Collected These Codes:"
                + "\n-----------------------------------------------------------"
                + "\n";

        this.console.println("You have the following Codes: ");
        for (String challenge : Snipe.getPlayer().getCodeList()) {
            this.console.println(challenge);
        }
        tempMenu += "\n -----------------------------------------------------------"
                + "\n R - Return to Player Location"
                + "\n G - Game Menu"
                + "\n-----------------------------------------------------------";

        this.menu = tempMenu;
    }

    public void display() {

    }

    @Override
    public boolean doAction(String choice) {

        choice = choice.toUpperCase(); //convert choice to upper case

        switch (choice) {
            case "G": {
                try {
                    //Return to Main Menu
                    this.displayGameMenu();
                } catch (GameControlException ex) {
                    Logger.getLogger(HelpMenuView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;
            case "R": {
                try {
                    //Return to Player Location
                    this.displayPlayerCurrentScene();
                } catch (GameControlException ex) {
                    Logger.getLogger(HelpMenuView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;
            default:
                //               this.console.println("\n*** Invalid Selection *** Try Again");
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid Selection *** Try Again");
                break;
        }
        return false;
    }

    private void displayGameMenu() throws GameControlException {
        //display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void displayPlayerCurrentScene() throws GameControlException {
        this.console.println(Snipe.getPlayer().getCurrentPlace().getPlaceScene());
    }

}

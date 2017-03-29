
package byui.cit260.snipe.view;

import byui.cit260.snipe.exceptions.GameControlException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import snipe.Snipe;

/**
 *
 * @author aingealfire@gmail.com (new16014@byui.edu)
 */
public class HelpMenuView extends View {

    public HelpMenuView() {
        super("\n"
                + "\n-----------------------------------------------------------"
                + "\n Help Menu                                                 "
                + "\n-----------------------------------------------------------"
                + "\n  ***Saving Your Game***"
                + "\n Saves the game to a file based on the player’s assigned"
                + "\n Agent Name. The player is in charge of knowing the Agent"
                + "\n name to find the saved game."
                + "\n "
                + "\n ***Travel Help***"
                + "\n Description of how the Travel feature works. Player will"
                + "\n select Travel option from game menu and be offered a list "
                + "\n of local locations that they can travel to. The player "
                + "\n can get hints about what each local location may have by "
                + "\n reading their dossier for that country."
                + "\n "
                + "\n ***Dossier Inventory Help***"
                + "\n Description of how the Dossier Inventory features work. "
                + "\n Opening the Dossier menu, the player can see a list of "
                + "\n the dossiers acquired. The player will be able to select "
                + "\n dossier, and it will show a description of the challenges "
                + "\n for his current country, hints for puzzles and riddles, "
                + "\n and the safe house location."
                + "\n "
                + "\n ***Collecting Codes***"
                + "\n Description of what codes are, and how they will be used "
                + "\n later. Player needs to collect all codes (one in each "
                + "\n country) to progress and complete game. The final dossier "
                + "\n will give directions for entering the secret codes and "
                + "\n decoding the message. All codes must be collected to "
                + "\n complete the final mission."
                + "\n "
                + "\n-----------------------------------------------------------"
                + "\n R - Return to Player Location"
                + "\n G - Game Menu"
                + "\n-----------------------------------------------------------");
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
                //              this.console.println("\n*** Invalid Selection *** Try Again");
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
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

}

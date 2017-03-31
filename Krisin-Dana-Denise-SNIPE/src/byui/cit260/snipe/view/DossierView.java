package byui.cit260.snipe.view;

import byui.cit260.snipe.exceptions.GameControlException;
import byui.cit260.snipe.model.Dossier;
import java.util.logging.Level;
import java.util.logging.Logger;
import snipe.Snipe;

/**
 *
 * @author aingealfire@gmail.com (new16014@byui.edu)
 */
public class DossierView extends View {

    public DossierView() {
        super("\n\n"
                + "\n-----------------------------------------------------------"
                + "\n Dossier Selection"
                + "\n-----------------------------------------------------------"
                + "\n"
                + "\n 1 - View Dossier for: United States of America"
                + "\n 2 - View Dossier for: Germany"
                + "\n 3 - View Dossier for: England"
                + "\n 4 - View Dossier for: Spain"
                + "\n 5 - View Dossier for: Russia"
                + "\n 6 - View Dossier for: France"
                + "\n 7 - View Dossier for: Canada"
                + "\n 8 - View Dossier for: Brazil"
                + "\n 9 - View Dossier for: Australia"
                + "\n-----------------------------------------------------------"
                + "\n R - Return to Player Location"
                + "\n G - Game Menu"
                + "\n-----------------------------------------------------------");
    }

    @Override
    public boolean doAction(String choice) {

        choice = choice.toUpperCase(); //convert choice to upper case

        switch (choice) {
            case "1": //Show Dossier
                this.console.println(Dossier.values()[0]);
                break;
            case "2": //Show Dossier
                this.console.println(Dossier.values()[1]);
                break;
            case "3": //Show Dossier
                this.console.println(Dossier.values()[2]);
                break;
            case "4": //Show Dossier
                this.console.println(Dossier.values()[3]);
                break;
            case "5": //Show Dossier
                this.console.println(Dossier.values()[4]);
                break;
            case "6": //Show Dossier
                this.console.println(Dossier.values()[5]);
                break;
            case "7": //Show Dossier
                this.console.println(Dossier.values()[6]);
                break;
            case "8": //Show Dossier
                this.console.println(Dossier.values()[7]);
                break;
            case "9": //Show Dossier
                this.console.println(Dossier.values()[8]);
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

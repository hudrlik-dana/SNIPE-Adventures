
package byui.cit260.snipe.view;

import byui.cit260.snipe.control.GameControl;
import byui.cit260.snipe.exceptions.GameControlException;
import java.util.logging.Level;
import java.util.logging.Logger;
import snipe.Snipe;

/**
 *
 * @author aingealfire@gmail.com (new16014@byui.edu)
 */
public class WinGameView extends View {

    public WinGameView() {
        super("\n------- Congratulations! --------"
                + "\n You are now a S.N.I.P.E Agent."
                + "\n---------------------------------"
                + "\n Take a well desevved vacation!  "
                + "\n--------------------------------*"
                + "\n N - Start New Game              "
                + "\n X - Exit Game                   "
                + "\n---------------------------------");
    }

    @Override
    public boolean doAction(String choice) {

        choice = choice.toUpperCase(); //convert choice to upper case

        switch (choice) {
            case "N": {
                try {
                    //Start New Game
                    this.startNewGame();
                } catch (GameControlException ex) {
                    Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            case "X": {
                try {
                    //Exit Game
                    this.exitGame();
                } catch (GameControlException ex) {
                    Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
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

    private void startNewGame() throws GameControlException {
        //create new game
        GameControl.createNewGame(Snipe.getPlayer());

        this.console.println(Snipe.getPlayer().getCodeName());

        //display the game menu view
        GameMenuView gameMenu = new GameMenuView();
        //display the game menu
        gameMenu.display();
    }

    private void exitGame() throws GameControlException {
        try {
            this.console.println("Do you wish to save the game before exiting?  Y/N");
            String value = "";
            value = keyboard.readLine();
            value.trim();
            if ((value.toUpperCase().charAt(0)) == 'Y') {
                this.saveGame();
            }
            System.exit(0);
        } catch (Exception ex) {
            Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
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
}

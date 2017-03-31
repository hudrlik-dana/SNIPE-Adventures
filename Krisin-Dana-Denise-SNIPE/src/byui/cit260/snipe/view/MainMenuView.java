package byui.cit260.snipe.view;

import byui.cit260.snipe.control.GameControl;
import byui.cit260.snipe.exceptions.GameControlException;
import byui.cit260.snipe.model.Game;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import snipe.Snipe;

/**
 *
 * @author aingealfire@gmail.com (new16014@byui.edu)
 */
public class MainMenuView extends View {

    public MainMenuView() {
        super("\n"
                + "\n-----------------------------------------------------------"
                + "\n Main Menu                      "
                + "\n-----------------------------------------------------------"
                + "\n L - Load Existing Game         "
                + "\n N - Start New Game             "
                + "\n S - Save Game                  "
                + "\n R - Return to Player Location  "
                + "\n H - Help Menu                  "
                + "\n Q - Exit Game                  "
                + "\n-----------------------------------------------------------");
    }

    @Override
    public boolean doAction(String choice) {

        choice = choice.toUpperCase(); //convert choice to upper case

        switch (choice) {
            case "L": {
                try {
                    //Load Saved Game
                    this.startSavedGame();
                } catch (GameControlException ex) {
                    Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;
            case "N": {
                try {
                    //Start New Game
                    this.startNewGame();
                } catch (GameControlException ex) {
                    Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
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
            case "R": {
                try {
                    //Return to Player Location
                    this.displayPlayerCurrentScene();
                } catch (GameControlException ex) {
                    Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;
            case "H": {
                try {
                    //Display Help Menu
                    this.displayHelpMenu();
                } catch (GameControlException ex) {
                    Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;
            case "Q": {
                try {
                    //Exit Game
                    this.exitGame();
                } catch (GameControlException ex) {
                    Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            default:
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid Selection *** Try Again");
                break;
        }
        return false;
    }
    
    private void startSavedGame() throws GameControlException, FileNotFoundException, IOException, ClassNotFoundException {
        // prompt for and get the name of the file to be saved
        StartSavedGameView startSavedGameView = new StartSavedGameView();
        String filePath = startSavedGameView.getInput();

        Game game = null;

        try (FileInputStream fips = new FileInputStream(filePath)) {
             ObjectInputStream input = new ObjectInputStream(fips);
             
             game = (Game) input.readObject();
        
            try {
                GameControl.getSavedGame(filePath);
            } catch (Exception e) {
                throw new GameControlException(e.getMessage());
            }

            Snipe.setCurrentGame(game);
            Snipe.setPlayer(Snipe.getCurrentGame().getPlayer());
            GameMenuView gameMenu = new GameMenuView();
            gameMenu.display();
        }
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

    private void displayPlayerCurrentScene() throws GameControlException {
        this.console.println(Snipe.getPlayer().getCurrentPlace().getPlaceScene());
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void displayHelpMenu() throws GameControlException {
        //display the help menu
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
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
}

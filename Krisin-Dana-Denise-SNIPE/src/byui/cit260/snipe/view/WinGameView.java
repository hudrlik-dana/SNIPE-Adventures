/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.snipe.view;

import byui.cit260.snipe.control.GameControl;
import byui.cit260.snipe.exceptions.GameControlException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import snipe.Snipe;

/**
 *
 * @author aingealfire@gmail.com (new16014@byui.edu)
 */
public class WinGameView extends View{
        

    public WinGameView (){
        super("\n------- Congratulations! --------"
                + "\n You are now a S.N.I.P.E Agent."
                + "\n---------------------------------"
                + "\n Take a well desevved vacation!  "
                + "\n--------------------------------*"
                + "\n N - Start New Game              "
                + "\n Q - Exit Game                   "
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
            case "Q": {
                try {
                    //Exit Game
                    this.exitGame();
                } catch (GameControlException ex) {
                    Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
        }
        return false;
    }

    private void startNewGame() throws GameControlException {
        //create new game
        GameControl.createNewGame(Snipe.getPlayer());

        System.out.println(Snipe.getPlayer().getCodeName());

        //display the game menu view
        GameMenuView gameMenu = new GameMenuView();
        //display the game menu
        gameMenu.display();
    }

    private void exitGame() throws GameControlException {
        Scanner keyboard = new Scanner(System.in); //get infile for Keyboard
        try {
            System.exit(0);
        } catch (Exception ex) {
            Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

}

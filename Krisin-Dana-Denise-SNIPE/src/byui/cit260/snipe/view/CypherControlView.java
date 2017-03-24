/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.view;

import byui.cit260.snipe.control.CypherControl;
import byui.cit260.snipe.control.GameControl;
import byui.cit260.snipe.exceptions.GameControlException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import snipe.Snipe;

/**
 *
 * @author danahudrlik
 */
public class CypherControlView extends View {

    private String answerOption;

    public CypherControlView() {
        super();
        CypherControl cypherDecoder = new CypherControl();

        //display cypher decoder  
        this.console.println(
                "\n---------------- Cypher Decoder -----------------"
                + "\n A = 6    G = T     M = N     S = H    Y = 1"
                + "\n B = Z    H = S     N = M     T = G    Z = B"
                + "\n C = X    I = 4     O = 3     U = 2         "
                + "\n D = W    J = Q     P = L     V = F         "
                + "\n E = 5    K = 8     Q = J     W = D         "
                + "\n F = V    L = P     R = 7     X = C         "
                + "\n-------------------------------------------------"
                + "\n Retrieve your master code pieces from the "
                + "\n Collected Codes list. Decode the secret message."
                + "\n Arrange the words in order to discover an "
                + "\n important message."
                + "\n"
                + "\n-------------------------------------------------"
                + "\n Press B to Begin Decoding"
                + "\n-------------------------------------------------"
        );

    }

    @Override
    public void display() {

        boolean done = false; //set flag to not done
        do {
            String answerOption = this.getInput();
            //do the requested action and display the next view
            done = this.doAction(answerOption);

        } while (!done);
    }

    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase(); //convert choice to upper case

        switch (choice) {
            case "B": {
                try {
                    this.displayWinGameView();
                } catch (GameControlException ex) {
                    Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            default:
                //               this.console.println("\n*** Invalid Selection *** Try Again");
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid Selection *** Try Again");

                break;
        }
        return false;
    }

    private void displayWinGameView() throws GameControlException {
        //display the game menu
        WinGameView winGameView = new WinGameView();
        winGameView.display();
    }
}

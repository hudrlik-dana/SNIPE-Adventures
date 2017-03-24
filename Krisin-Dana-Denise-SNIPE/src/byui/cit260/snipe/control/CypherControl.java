/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.control;

import byui.cit260.snipe.view.View;
import java.util.Scanner;

/**
 *
 * @author danahudrlik
 */
public class CypherControl extends View {

    private String answerOption;

    public CypherControl() {
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
                + "\n-------------------------------------------------"
        //                  + "\n _ _ _ _    _ _ _   _ _   _   _ _ _   _ _ "
        //                  + "\n _ _ _ _ _ _ _ _   _ _ _   _ _ _  "
        //                  + "\n _ _ _ _ _ _ _ _ _    _ _ _ _ _ _ _ _ _ "
        //                  + "\n _ _ _    _ _ _ _ _ _ _."
        //                  + "\n _ _ _ _ _    _ _    _ _ _    _ _ _ _ _ _ _ _"
        //                  + "\n _ _ _   _ _ _ _.  _ _   _ _ _ _ _ _"              
        );

    }

    public void displayMenuView() {

        boolean done = false; //set flag to not done
        do {
            String answerOption = this.getInput();

            //do the requested action and display the next view
            done = this.doAction(answerOption);

        } while (!done);
    }

    public boolean doAction(String choice) {

        choice = choice.toUpperCase(); //convert choice to upper case
        this.console.println(
                "\n------- Congratulations! --------"
                + "\n You are now a S.N.I.P.E Agent."
                + "\n---------------------------------"
                + "\n Take a well desevved vacation!  "
                + "\n--------------------------------*"
                + "\n N - Start New Game              "
                + "\n Q - Exit Game                   "
                + "\n---------------------------------"
        );
        return true;
    }

}

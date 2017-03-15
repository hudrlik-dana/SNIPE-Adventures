/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.view;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import byui.cit260.snipe.control.GameControl;
import byui.cit260.snipe.exceptions.GameControlException;
import java.util.Scanner;

/**
 *
 * @author aingealfire@gmail.com (new16014@byui.edu)
 */
public class StartSavedGameView extends View {

    public StartSavedGameView() throws GameControlException {
        super("\nLoad Game:\n");
    }

    @Override
    public String getInput() {
        Scanner keyboard = new Scanner(System.in); //get infile for Keyboard
        boolean valid = false; //initialize to not valid
        String value = ""; //value to be returned

        while (!valid) {
            try {
                //prompt for player input
                System.out.println("\n\nWhat is the name of your save file? ");

                value = keyboard.nextLine(); //get next line typed on keyboard
                value = value.trim(); //trim off leading and trailing blanks

                if (value.length() < 1) { // value is blank
                    System.out.println("\nInvalid: entry required.");
                } else {
                    break; //end the loop
                }
            } catch (Exception ex) {
                Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return value; //return entered value

    }

    @Override
    public boolean doAction(String value) {
        return true;

    }

}

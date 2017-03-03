/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.view;

import java.util.Scanner;

/**
 *
 * @author aingealfire@gmail.com (new16014@byui.edu)
 */
public abstract class View implements ViewInterface {

    protected String displayMessage;

    public View() {
    }

    public View(String message) {
        this.displayMessage = message;
    }

    @Override
    public void display() {
        boolean done = false; //set flag to not done
        do {
            // prompt for and get players name
            String value = this.getInput();
            if (value.toUpperCase().equals("Q")) {  //user wants to quit
                return;    //exit the game
            }
            //do the requested action and display the next view
            done = this.doAction(value);

        } while (!done);
    }

    @Override
    public String getInput() {
        Scanner keyboard = new Scanner(System.in); //get infile for Keyboard
        boolean valid = false; //initialize to not valid
        String value = ""; //value to be returned

        while (!valid) {
            System.out.println("\n" + this.displayMessage);

            value = keyboard.nextLine(); //get next line typed on keyboard
            value = value.trim(); //trim off leading and trailing blanks

            if (value.length() < 1) { // value is blank
                System.out.println("\nInvalid: entry required.");
                continue;
            }
            break; //end the loop
        }
        return value; //return entered value

    }

}

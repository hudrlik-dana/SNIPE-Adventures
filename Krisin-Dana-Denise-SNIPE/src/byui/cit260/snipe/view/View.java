package byui.cit260.snipe.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import snipe.Snipe;

/**
 *
 * @author aingealfire@gmail.com (new16014@byui.edu)
 */
public abstract class View implements ViewInterface {

    protected String displayMessage;

    protected final BufferedReader keyboard = Snipe.getInFile();
    protected final PrintWriter console = Snipe.getOutFile();

    public View() {
        this.displayMessage = "";
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

        boolean valid = false; //initialize to not valid
        String value = ""; //value to be returned

        while (!valid) {
            this.console.println("\n" + this.displayMessage);

            try {
                value = keyboard.readLine(); //get next line typed on keyboard
            } catch (IOException ex) {
                Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
            }
            value = value.trim(); //trim off leading and trailing blanks

            if (value.length() < 1) { // value is blank
                ErrorView.display(this.getClass().getName(),
                        "\n***Invalid: entry required.!");
                continue;
            }
            break; //end the loop
        }
        return value; //return entered value
    }
}

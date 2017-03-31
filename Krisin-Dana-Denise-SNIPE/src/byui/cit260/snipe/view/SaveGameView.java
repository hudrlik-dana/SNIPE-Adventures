package byui.cit260.snipe.view;

import byui.cit260.snipe.exceptions.GameControlException;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aingealfire@gmail.com (new16014@byui.edu)
 */
public class SaveGameView extends View {

    public SaveGameView() throws GameControlException {
        super("\nSave Game:\n");
    }

    @Override

    public String getInput() {
        boolean valid = false; //initialize to not valid
        String value = null; //value to be returned

        while (!valid) {
            try {
                //prompt for player input
                this.console.println("\n\nWhat do you want to call your save file? ");

                value = this.keyboard.readLine(); //get next line typed on keyboard
                value = value.trim(); //trim off leading and trailing blanks

                if (value.length() < 1) { // value is blank
                    ErrorView.display(this.getClass().getName(),
                            "\n*** Invalid Selection *** Try Again");
                } else {
                    break; //end the loop
                }
            } catch (IOException ex) {
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

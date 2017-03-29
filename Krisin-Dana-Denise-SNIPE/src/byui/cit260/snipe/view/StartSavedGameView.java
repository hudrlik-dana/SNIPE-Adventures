
package byui.cit260.snipe.view;

import java.util.logging.Level;
import java.util.logging.Logger;
import byui.cit260.snipe.exceptions.GameControlException;

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
        boolean valid = false; //initialize to not valid
        String value = ""; //value to be returned

        while (!valid) {
            try {
                //prompt for player input
                this.console.println("\n\nWhat is the name of your save file? ");

                value = keyboard.readLine(); //get next line typed on keyboard
                value = value.trim(); //trim off leading and trailing blanks

                if (value.length() < 1) { // value is blank
                    ErrorView.display(this.getClass().getName(),
                            "\n*** Invalid: entry required.");

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

package byui.cit260.snipe.view;

import byui.cit260.snipe.model.Place;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import snipe.Snipe;

/**
 *
 * @author aingealfire@gmail.com (new16014@byui.edu)
 */
class WritePassportList extends View {

    public static void writePassportList(ArrayList<String> passport, String filepath) throws IOException {

        try (PrintWriter output = new PrintWriter(filepath)) {

            //write header
            String header = "You have visited the following Places:";
            output.println(header);
            //if itemList is not empty, write each item on a new line
            if (passport.isEmpty()) {
                //do nothing
            } else {   //write list
                for (Place place : Snipe.getPlayer().getPassport()) {
                    output.println(place.getPlaceName());
                }
            }
            output.flush();
        } catch (Exception e) {
            throw new IOException(e.getMessage());
        }
    }

    @Override
    public boolean doAction(String value) {
        return false;
    }
}

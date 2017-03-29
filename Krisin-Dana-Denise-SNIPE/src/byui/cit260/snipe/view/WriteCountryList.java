package byui.cit260.snipe.view;

import byui.cit260.snipe.model.Country;
import byui.cit260.snipe.model.Place;
import byui.cit260.snipe.model.World;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import snipe.Snipe;

/**
 *
 * @author denisegoetz
 */
public class WriteCountryList extends View {

    public static void WriteCountryList(String filepath) throws IOException {

        try (PrintWriter output = new PrintWriter(filepath)) {

            //write header
            String header = "These are all the countries & places you can visit, lucky you!:";
            output.println(header);
            //if itemList is not empty, write each item on a new line
            World world = Snipe.getCurrentGame().getWorld();
            List<Country> countries = world.getCountries();
            if (countries.isEmpty()) {
                //do nothing
            } else {   //write list
                for (int i = 0; i < countries.size(); i++) {
                    Country map = countries.get(i);
                    output.println(map.getName());

                    List<Place> places = map.getPlaces();
                    for (int j = 0; j < places.size(); j++) {
                        output.println("\t" + places.get(j).getPlaceName());
                    }
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

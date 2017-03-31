package byui.cit260.snipe.view;

import byui.cit260.snipe.exceptions.GameControlException;
import byui.cit260.snipe.model.Country;
import byui.cit260.snipe.model.Place;
import byui.cit260.snipe.model.World;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import snipe.Snipe;

/**
 *
 * @author aingealfire@gmail.com (new16014@byui.edu)
 */
public class MapMenuView extends View {

    public MapMenuView() {
        super();
        this.console.print("\n"
                + "\n------------------------------------------------------------------------------"
                + "\n S.N.I.P.E Adventures Places"
                + "\n------------------------------------------------------------------------------"
                + "\n");

        World world = Snipe.getCurrentGame().getWorld();
        List<Country> countries = world.getCountries();

        for (int i = 0; i < countries.size(); i++) {
            Country map = countries.get(i);
            this.console.println(map.getName());

            List<Place> places = map.getPlaces();
            for (int j = 0; j < places.size(); j++) {
                this.console.println("\t" + places.get(j).getPlaceName());
            }
        }

        this.console.print("\n-----------------------------------------------------------"
                + "\n");

        this.console.print("\tYou are at: " + Snipe.getPlayer().getCurrentPlace().getPlaceName());

        this.console.print("\n"
                + "\n-----------------------------------------------------------");

        this.console.print("\n"
                + "\n T - Travel"
                + "\n P - View Passport"
                + "\n R - Return to Player Location"
                + "\n H - Help Menu"
                + "\n-----------------------------------------------------------");
    }

    @Override
    public boolean doAction(String choice) {

        choice = choice.toUpperCase(); //convert choice to upper case

        switch (choice) {
            case "T": //display the Travel Menu
                this.displayTravelMenuView();
                break;
            case "P": //display the passport list
                this.displayPassportList();
                break;
            case "R": {
                try {
                    //Return to Player Location
                    this.displayPlayerCurrentScene();
                } catch (GameControlException ex) {
                    Logger.getLogger(HelpMenuView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;
            case "H": //Display Help Menu
                this.displayHelpMenu();
                break;
            default:
//               this.console.println("\n*** Invalid Selection *** Try Again");
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid Selection *** Try Again");
                break;
        }

        return false;
    }

    private void displayTravelMenuView() {
        //display the travel menu
        TravelMenuView travelMenu = new TravelMenuView();
        travelMenu.display();
    }

    private void displayPassportList() {
        this.console.println("You have visited: ");
        for (Place place : Snipe.getPlayer().getPassport()) {
            this.console.println(place.getPlaceName());
        }
    }

    private void displayPlayerCurrentScene() throws GameControlException {
        this.console.println(Snipe.getPlayer().getCurrentPlace().getPlaceScene());
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void displayHelpMenu() {
        //display the help menu
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }
}

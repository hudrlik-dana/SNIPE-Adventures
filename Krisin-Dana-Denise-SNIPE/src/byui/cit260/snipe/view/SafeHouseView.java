/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.view;

import byui.cit260.snipe.exceptions.GameControlException;
import byui.cit260.snipe.model.Country;
import byui.cit260.snipe.model.SafeHouse;
import snipe.Snipe;

/**
 *
 * @author denisegoetz
 */
public class SafeHouseView extends View {

    public SafeHouseView() {
        super("\n"
                + "\n-----------------------------------------------------------"
                + "\n             Safe house - Get some rest!"
                + "\n-----------------------------------------------------------"
                + "\nPress any key to see more details about this safe house.   "
                + "\n-----------------------------------------------------------"
                + "\n"
        );
    }

    @Override
    public boolean doAction(String choice) {

        choice = choice.toUpperCase(); //convert choice to upper case

//What I want to do here is dynamically set the country where is currently says USA and then it will automatically 
// call the correct enum variable.  It won't let me, at least how I am trying to do it.
        String countryName = Snipe.getPlayer().getCurrentCountry().getName();

        for (SafeHouse safeHouse : SafeHouse.values()) {
            if (countryName.equals(safeHouse.getSafeHouseCountry())) {
                System.out.println("\n" + safeHouse.getSafeHouseDesc());
            }
        }
//        SafeHouse safeHouseDesc = SafeHouse.USA;
//        System.out.println("\n" + SafeHouse.USA.getSafeHouseDesc());

        return true;
    }

    private void displayPlayerCurrentScene() throws GameControlException {
        System.out.println(Snipe.getPlayer().getCurrentPlace().getPlaceScene());
    }
}

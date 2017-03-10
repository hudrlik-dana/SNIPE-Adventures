/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.snipe.view;

import byui.cit260.snipe.model.Country;
import byui.cit260.snipe.model.Game;
import byui.cit260.snipe.model.Place;
import byui.cit260.snipe.model.World;
import java.util.List;
import java.util.Scanner;
import snipe.Snipe;

/**
 *
 * @author aingealfire@gmail.com (new16014@byui.edu)
 */
public class MapMenuView extends View {

    public MapMenuView() {
        super();
        System.out.print("\n"
            + "\n------------------------------------------------------------------------------"
            + "\n Map of Places"
            + "\n------------------------------------------------------------------------------"
            + "\n");

        World world = Snipe.getCurrentGame().getWorld();
        List<Country> countries = world.getCountries();
        
        for(int i=0; i < countries.size(); i++){
            Country map = countries.get(i);
            System.out.println(map.getName());
            
            List<Place> places = map.getPlaces();
            for(int j=0; j < places.size(); j++) {
                System.out.println("\t" + places.get(j).getPlaceName());

                }
            }
        
        System.out.print("\n"
                + "\n-----------------------------------------------------------"
                + "\n");

        System.out.print("\tYou are at: " + Snipe.getPlayer().getCurrentPlace().getPlaceName());
            
        System.out.print("\n"
                + "\n-----------------------------------------------------------");
        
        System.out.print("\n"
                + "\n T - Travel"
                + "\n P - View Passport"
                + "\n M - Main Menu"
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
            case "M": //Return to Main Menu
                this.displayMainMenu();
                break;
            case "H": //Display Help Menu
                this.displayHelpMenu();
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
        }

        return false;
    }

    private void displayMainMenu() {
        //display the main menu
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
    }

    private void displayHelpMenu() {
        //display the help menu
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void displayTravelMenuView() {
        //display the travel menu
        TravelMenuView travelMenu = new TravelMenuView();
        travelMenu.display();
    }

    private void displayPassportList() {
        System.out.println("You have visited: ");
        for(Place place : Snipe.getPlayer().getPassport()){
                    System.out.println(place.getPlaceName());
                }
    }
       
    
//System.out.println("\n*** functionName stub function called ***");
}

 
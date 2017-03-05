/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.view;

import byui.cit260.snipe.model.Country;
import byui.cit260.snipe.model.Place;
import java.util.Scanner;
import snipe.Snipe;

/**
 *
 * @author aingealfire@gmail.com (new16014@byui.edu)
 */
public class TravelMenuView extends View {

    private final String menu;

    public TravelMenuView() {
        super();
        Country currentCountry = Snipe.getPlayer().getCurrentCountry();
        
        String tempMenu = "\n"
                + "\n-----------------------------------------------------------"
                + "\n Travel Menu                                                "
                + "\n-----------------------------------------------------------"
                + "\n";
                
        
        for(int i = 0; i < currentCountry.getPlaces().size(); i++) {
            tempMenu += "\n " + (i+1) + " - " + currentCountry.getPlaces().get(i).getPlaceName();
        }
        
        tempMenu += "\n **************"
                + "\n V - View Map"
                + "\n M - Main Menu"
                + "\n H - Help Menu"
                + "\n-----------------------------------------------------------";
        
        this.menu = tempMenu;
    }

    @Override
    public void display() {

        boolean done = false; //set flag to not done
        do {
            String menuOption = this.getInput();
            if (menuOption.toUpperCase().equals("X")) {
                return;
            }

            //do the requested action and display the next view
            done = this.doAction(menuOption);

        } while (!done);
    }

    @Override
    public String getInput() {
        Scanner keyboard = new Scanner(System.in); //get infile for Keyboard
        String value = ""; //value to be returned
        boolean valid = false; //initialize to not valid

        while (!valid) {
            System.out.println("\n" + this.menu);

            value = keyboard.nextLine(); //get next line typed on keyboard
            value = value.trim(); //trim off leading and trailing blanks

            if (value.length() < 1) { // value is blank
                System.out.println("\nInvalid: entry required.");
            }
            break; //end the loop
        }

        return value; //return entered value
    }

    @Override
    public boolean doAction(String choice) {

        choice = choice.toUpperCase(); //convert choice to upper case

        try {
            int numChoice = Integer.parseInt(choice);
            Snipe.getPlayer().setCurrentPlace(Snipe.getPlayer().getCurrentCountry().getPlaces().get(numChoice - 1));
            
            //Output non-challenge description
            System.out.println(Snipe.getPlayer().getCurrentPlace().getPlaceScene());
            
            //IF PLAYER MOVEMENT TO A PLACE TRIGGERS CHALLENGE - OPEN THE CHALLENGE VIEW HERE
//            if(Snipe.getPlayer().getCurrentPlace().isChallenge()) {

               if (numChoice == 1){
                 System.out.println("\n this is first" + Snipe.getPlayer().getCurrentPlace().getPlaceScene()); 
              }
               if (numChoice == 2){
                 System.out.println("\n this is second " + Snipe.getPlayer().getCurrentPlace().getPlaceScene()); 
              }
               if (numChoice == 3){
                 System.out.println("\n this is third" + Snipe.getPlayer().getCurrentPlace().getPlaceScene()); 
              }
//            }
            return true;
        } catch(IndexOutOfBoundsException ibe) {
            System.out.println("That place number doesn't exist!");
        } catch (Exception e) {
            //bury this
        }
        
        switch (choice) {
            case "V": //display the map
                System.out.println("You are at: " + Snipe.getPlayer().getCurrentPlace().getPlaceName());
//                this.displayMap();
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
    
        private void displayMap() {
        //display the travel menu
        MapMenuView mapMenu = new MapMenuView();
        mapMenu.display();
    }

    private void displayPlaceOne() {
        System.out.println("\n*** displayPlaceOne stub function called ***");
    }

    private void displayPlaceTwo() {
        System.out.println("\n*** displayPlaceTwo stub function called ***");
    }

    private void displayPlaceThree() {
        System.out.println("\n*** displayPlaceThree stub function called ***");
    }



//System.out.println("\n*** functionName stub function called ***");
}

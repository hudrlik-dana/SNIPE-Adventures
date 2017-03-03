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
public class MapMenuView extends View {

    public MapMenuView() {
        super("\n"
                + "\n-----------------------------------------------------------"
                + "\n Map Menu                                                "
                + "\n-----------------------------------------------------------"
                + "\n"
                + "Countries to Choose\n" +
                    "________________ _______________ _______________ _______________ _______________ _______________ _______________ _______________ ________________\n" +
                    "|*USA		|Germany	|England	|Spain	 	|France		|Canada		|Brazil		|Australia	|Russia		|\n" +
                    "|		|		|		|		|		|		|		|		|		|\n" +
                    "|		|		|		|		|		|		|		|		|		|\n" +
                    "________________ _______________ _______________ _______________ _______________ _______________ _______________ _______________ ________________\n" +
                    "\n" +
                    "Locations within Countries\n" +
                    "________________ _______________ _______________ _______________ _______________ _______________ _______________ _______________ ________________\n" +
                    "|*USA - Snipe	|Germany -	|England - 	|Spain	- 	|France - 	|Canada -	|Brazil - 	|Australia - 	|Russia - 	|\n" +
                    "|Academy	|Berlin Wall	|Big Ben	|Tarragona	|Eiffel Tower	|Montreal	|Beach (Rio de	|Sydney Opera	|St Peter's	|\n" +
                    "|		|		|		|		|		|Olympic Stadium|Janeiro)	|House		|Square		|\n" +
                    "---------------- --------------- --------------- --------------- --------------- --------------- --------------- --------------- ---------------- \n" +
                    "|*USA - 	|Germany -	|England -	|Spain -  	|France - 	|Canada -	|Brazil - 	|Australia - 	|Russia - 	|\n" +
                    "|Library of	|Cologne 	|Westminster	|Cathedral of	|The Louvre	|Library of	|Amazon Forest	|Old Melbourne	|Lenin's	|\n" +
                    "|Congress	|Cathedral	|Abbey		|Seville	|		|Parliament	|		|Jail		|Mausoleum	|\n" +
                    "---------------- --------------- --------------- --------------- --------------- --------------- --------------- --------------- ----------------\n" +
                    "|*USA - 	|Germany - 	|England -	|Spain -  	|France - 	|Canada -	|Brazil - 	|Australia - 	|Russia - 	|\n" +
                    "|Gateway Arch	|Rhine River	|Buckingham	|Valencia	|A Sidewalk	|CN Tower	|Sao Paulo	|Bridge		|St Basil's	|\n" +
                    "|		|		|Palace		|		|Cafe		|		|(Capital)	|		|Cathedral	|\n" +
                    "________________ _______________ _______________ _______________ _______________ _______________ _______________ _______________ ________________\n" +
                    "\n" +
                    "\n"
                + "\n "
                + "\n **************"
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
        System.out.println("\n*** displayPassportList stub function called ***");
    }
       
    
//System.out.println("\n*** functionName stub function called ***");
}

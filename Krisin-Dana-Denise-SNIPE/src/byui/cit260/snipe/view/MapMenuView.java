/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.snipe.view;

import byui.cit260.snipe.model.Country;
import byui.cit260.snipe.model.Game;
import byui.cit260.snipe.model.Place;
import java.util.Scanner;
import snipe.Snipe;

/**
 *
 * @author aingealfire@gmail.com (new16014@byui.edu)
 */
public class MapMenuView extends View {

    //private final String menu;

    public MapMenuView() {
        super();
        Place currentPlace = Snipe.getPlayer().getCurrentPlace();
        
        String tempMenu = "\n"
                + "\n-----------------------------------------------------------"
                + "\n Map of Places"
                + "\n-----------------------------------------------------------"
                + "\n";

        StringBuilder line;

        Game game = Snipe.getCurrentGame();
        
        
        System.out.println();
        line = new StringBuilder("                     ");
        line.insert(0,"USA");
        line.insert(06,"GERMANY");
        line.insert(15,"ENGLAND");
        line.insert(25,"SPAIN");
        line.insert(32,"RUSSIA");
        line.insert(40,"FRANCE");
        line.insert(47,"CANADA");
        line.insert(55,"BRAZIL");
        line.insert(62,"AUSTRALIA");
        System.out.println(line.toString());
        
        //For each Place

        final String[][] places = {
            {"Library of Congress", "Berlin Wall", "Big Ben", "Valencia", "St. Peter's Square", "The Louvre", "Library of Parliament", "Rio De Janeiro", "Sydney Opera House"},
            {"Gateway Arch", "Cologne Cathedral", "Buckingham Palace", "Tarragona", "Saint Basil's Cathedral", "Eiffel Tower", "Montreal Olympic Stadium", "Amazon Forest", "Australia Bridge"},
            {"S.N.I.P.E Academy", "Rhine River", "Westminster Abbey", "Cathedral of Seville", "Lenin's Mausoleum", "Sidewalk Cafe", "CN Tower", "Sao Paulo", "Old Melbourne Jail"}
        };   
        

        for (int i = 0; i < places.length; i++) {
            for (int j = 0; j < places[i].length; j++) {
                
                System.out.print(places[i][j] + " ");
             
                if (j == 8) {
                   System.out.print("\n");
                }     
            }
        }

/*       
        final int[][] matrix = {
  { 1, 2, 3 },
  { 4, 5, 6 },
  { 7, 8, 9 }
};

for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
    }
    System.out.println();
}
        
*/
        
/*        tempMenu +="\n **************"
                + "\n T - Travel"
                + "\n P - View Passport"
                + "\n M - Main Menu"
                + "\n H - Help Menu"
                + "\n-----------------------------------------------------------");
        
        this.menu = tempMenu;
*/        
    }
        
        
 /*   displayMap(): void
BEGIN
get the 2-D locations array in the map in the current game
    PRINT the title 
    PRINT the column numbers in the header
    FOR every row in map 
        PRINT a row divider 
        PRINT the row number on a new line 
        FOR every column in row
            PRINT a column divider
            location  = locations[row][column]
            IF location has been visited 
                ADD TO PASSPORT ARRAYLIST
    ENDIF 
        PRINT the ending column divider
    ENDFOR 
    PRINT ending row divider 
    END   
             
    }*/
    
/*    String[][] places = {
            {"Library of Congress", "Berlin Wall", "Big Ben", "Valencia", "St. Peter's Square", "The Louvre", "Library of Parliament", "Rio De Janeiro", "Sydney Opera House"},
            {"Gateway Arch", "Cologne Cathedral", "Buckingham Palace", "Tarragona", "Saint Basil's Cathedral", "Eiffel Tower", "Montreal Olympic Stadium", "Amazon Forest", "Australia Bridge"},
            {"S.N.I.P.E Academy", "Rhine River", "Westminster Abbey", "Cathedral of Seville", "Lenin's Mausoleum", "Sidewalk Cafe", "CN Tower", "Sao Paulo", "Old Melbourne Jail"}
        };
 */   
    
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

/*    
    
        Place currentPlace = Snipe.getPlayer().getCurrentPlace();
        
        String tempMenu = "\n"
                + "\n-----------------------------------------------------------"
                + "\n Map                                                "
                + "\n-----------------------------------------------------------"
                + "\n";
                
        displayMap(): void;
            Snipe.getPlace(places) 
        
        
        tempMenu +="\n **************"
                + "\n T - Travel"
                + "\n P - View Passport"
                + "\n M - Main Menu"
                + "\n H - Help Menu"
                + "\n-----------------------------------------------------------");
        
        this.menu = tempMenu;


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
                + "\n-----------------------------------------------------------");*/

/*public void displayMap(String[][] places){  
            for(String i = 0; i < places.length; i++){  
                for(String j = 0; j < 20; j++){  
                    if(in[i][j] == 1)  
                        System.out.print('X' + "\t");
                    else
                        System.out.print(in[i][j] + "\t");
                }
            System.out.print("\n");
            }
        }*/
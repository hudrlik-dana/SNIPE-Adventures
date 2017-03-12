/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.snipe.view;

import byui.cit260.snipe.model.Country;
import byui.cit260.snipe.model.Dossier;
import snipe.Snipe;

/**
 *
 * @author aingealfire@gmail.com (new16014@byui.edu)
 */
public class DossierView extends View{

    public DossierView() {
        super("\n"
                + "\n-----------------------------------------------------------"
                + "\n Dossier Selection"
                + "\n-----------------------------------------------------------"
                + "\n"
                + "\n 1 - View Dossier for: United States of America"
                + "\n 2 - View Dossier for: Germany"
                + "\n 3 - View Dossier for: England"
                + "\n 4 - View Dossier for: Spain"
                + "\n 5 - View Dossier for: Russia"
                + "\n 6 - View Dossier for: France"                
                + "\n 7 - View Dossier for: Canada"
                + "\n 8 - View Dossier for: Brazil"
                + "\n 9 - View Dossier for: Australia"
                + "\n-----------------------------------------------------------"
                + "\n R - Return to Player Location"
                + "\n G - Game Menu"
                + "\n-----------------------------------------------------------");        
    }
    

    @Override
    public boolean doAction(String choice) {

        choice = choice.toUpperCase(); //convert choice to upper case

        switch (choice) {
            case "1": //Show Dossier
                System.out.println(Dossier.values()[0]);
                break;
            case "2": //Show Dossier
                System.out.println(Dossier.values()[1]);
                break;
            case "3": //Show Dossier
                System.out.println(Dossier.values()[2]);
                break;
            case "4": //Show Dossier
                System.out.println(Dossier.values()[3]);
                break;
            case "5": //Show Dossier
                System.out.println(Dossier.values()[4]);
                break;
            case "6": //Show Dossier
                System.out.println(Dossier.values()[5]);
                break;
            case "7": //Show Dossier
                System.out.println(Dossier.values()[6]);
                break;
            case "8": //Show Dossier
                System.out.println(Dossier.values()[7]);
                break;
            case "9": //Show Dossier
                System.out.println(Dossier.values()[8]);
                break;
            case "G": //Return to Main Menu
                this.displayGameMenu();
                break;
            case "R": //Return to Player Location
                this.displayPlayerCurrentScene();
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
        }
        return false;
    }
    
    private void displayGameMenu() {
        //display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void displayPlayerCurrentScene() {
        System.out.println("\n*** displayPlayerCurrentScene stub function called ***");
    }
    
    
}



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.snipe.view;

import java.util.Scanner;
import snipe.Snipe;

/**
 * @author dana.hudrlik
 */

public class PlayerHealthView extends View{

 //Not using this anymore - Denise
    //private final String menu;
    //call menu with data listed 
 
 //  Not using this anymore - Denise
 //   private final int playerHealth = 100;  
 //    how to pull this from player adjust health ?
    
    public PlayerHealthView() {
           super("\n"
                + "\n***********************************************************" 
                + "\n* Player Health                                           *" 
                + "\n***********************************************************" 
                + "\n*                                                         *"
                + "\n* Your current Health Points: " + Snipe.getPlayer().getPlayerHealth() + " "
                + "                          *"
                + "\n*                                                         *" 
                + "\n***********************************************************" 
                + "\n* R - Return to Player Location                           *" 
                + "\n* M - Main Menu                                           *" 
                + "\n* H - Help Menu                                           *" 
                + "\n***********************************************************");
        }
      
        @Override
        public boolean doAction(String choice) {
            choice = choice.toUpperCase(); //convert choice to upper case
                switch (choice) { 
                case "R": //Return to Player Location 
                    this.displayPlayerCurrentScene(); 
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

        private void displayPlayerCurrentScene() { 
            System.out.println("\n*** displayPlayerCurrentScene() function called ***"); 
        }          
    }


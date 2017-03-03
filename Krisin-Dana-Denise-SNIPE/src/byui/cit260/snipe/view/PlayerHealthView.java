/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.snipe.view;

import java.util.Scanner;

/**
 * @author dana.hudrlik
 */

public class PlayerHealthView {

    private final String menu;
    //call menu with data listed 
    
    private final int playerHealth = 100;  
    // how to pull this from player adjust health ?
    
    public PlayerHealthView() {
        this.menu = "\n"
                + "\n***********************************************************" 
                + "\n* Player Health                                           *" 
                + "\n***********************************************************" 
                + "\n*                                                         *"
                + "\n* Your current Health Points: " + playerHealth + ".       *" 
                + "\n*                                                         *" 
                + "\n***********************************************************" 
                + "\n* R - Return to Player Location                           *" 
                + "\n* M - Main Menu                                           *" 
                + "\n* H - Help Menu                                           *" 
                + "\n***********************************************************";
    }
     /**
     * verifies the player selection 
     */

    public void display() {
        
        boolean done = false;  //set flag to not done
            do {
                String menuOption = this.getInput();
                if (menuOption.toUpperCase().equals("R")) {
                    return;  // return to player location
                }
                //do the requested action and display the next view
                done = this.doAction(menuOption); 
                
            }
            while (!done);         
     }
/*
   player input 
*/    
    private String getInput() {
        Scanner keyboard = new Scanner(System.in);  //get infile from keyboard
        String value = ""; //value to be returned
        boolean valid = false; //initialize to not valid to allow input
        
        while (!valid) {   // while not valid input
            System.out.println("\n" + this.menu);
            
            value = keyboard.nextLine(); //get next line typed on keyboard
            value = value.trim();  //trim off leading and trailing blanks
            
            if (value.length() < 1) {  //blank value entered
                System.out.print("\nInvalid: entry required.");
                continue;
            }
            break;  //end the loop  
        }
        return value;  //return entered value
    }
/*
    display limited game menu functions
*/
        private boolean doAction(String choice) {
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


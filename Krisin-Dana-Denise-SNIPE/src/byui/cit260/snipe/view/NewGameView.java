/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.snipe.view;

import byui.cit260.snipe.control.GameControl;
import byui.cit260.snipe.model.Player;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author aingealfire@gmail.com (new16014@byui.edu)
 */
public class NewGameView extends View {
    
    
/*
    pull playerName
    
    generate codeName
    
    display codeName to player
    
    display gameMenuView
    */
    
    @Override
    public boolean doAction(String codeName) {

        //call getCodeName() control function
        String player = GameControl.getCodeName(codeName);

        if (player == null) {//if unsuccessful
            System.out.println("\nError creating the player");
            return false;
        }
        
        //display next view
        this.displayNextView();

        return true; //Success! 
    }
    
       
    
    private void displayNextView() {
        
                
        //Create MainMenuView object
        GameMenuView gameMenuView = new GameMenuView();
        
        //Display the main menu view
        gameMenuView.display();
    }    

}

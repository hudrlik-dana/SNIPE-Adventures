package byui.cit260.snipeAdventures.model;

import byui.cit260.snipeAdventures.model.Player;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Randstad
 */
public class SnipeAdventures {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Fred");
        playerOne.setPlayerHealth(100);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
                
    }
    
}

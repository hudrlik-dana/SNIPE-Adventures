/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snipe.adventures;

import byui.cit260.snipeAdventures.model.Challenge;

/**
 *
 * @author danahudrlik
 */
public class SnipeAdventures {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Challenge challengeOne = new Challenge();
      
      challengeOne.setInjuryPoints(5);
      challengeOne.setMasterCodePiece("masterCodePiece");
      
      String challengeInfo = challengeOne.toString();
      System.out.println(challengeInfo);
      
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snipe;

import byui.cit260.snipe.model.Challenge;

/**
 *
 * @author danahudrlik
 */
public class Snipe {

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

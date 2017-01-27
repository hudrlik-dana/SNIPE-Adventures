/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snipe;

import byui.cit260.snipe.model.Challenge;
import byui.cit260.snipe.model.Item;
import byui.cit260.snipe.model.Player;

/**
 *
 * @author danahudrlik
 */
public class Snipe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //player class
        Player player1 = new Player();
        player1.setName("Fred");

        System.out.println("Player: " + player1.toString());

        //challenge class
        Challenge challengeOne = new Challenge();

        challengeOne.setInjuryPoints(5);
        challengeOne.setMasterCodePiece("masterCodePiece");

        String challengeInfo = challengeOne.toString();
        System.out.println(challengeInfo);

        //item class
        Item d1 = new Item();
        d1.setType("USA Dossier");

        System.out.println("You have the " + d1.toString());

    }

}

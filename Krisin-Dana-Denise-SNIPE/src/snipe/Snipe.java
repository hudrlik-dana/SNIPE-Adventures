/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snipe;

import byui.cit260.snipe.model.Challenge;
import byui.cit260.snipe.model.Item;
import byui.cit260.snipe.model.Player;
import byui.cit260.snipe.model.MathPuzzle;
import byui.cit260.snipe.model.MentalChallenge;
import byui.cit260.snipe.model.PhysicalChallenge;

/**
 *
 * @author danahudrlik
 */
public class Snipe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // this is the test for our team class of player
        
        Player player = new Player();
        player.setName("Fred");

        System.out.println("Player: " + player.toString());

        // these are the tests Dana coded for the classes 
        Challenge challengeOne = new Challenge();

        challengeOne.setInjuryPoints(5);
        challengeOne.setMasterCodePiece("masterCodePiece");

        String challengeInfo = challengeOne.toString();
        System.out.println(challengeInfo);

        MathPuzzle var1 = new MathPuzzle();

        var1.setMathAnswer("7");
        System.out.println();

        PhysicalChallenge success = new PhysicalChallenge();

        success.setPhysicalSuccess(true);
        System.out.println();

        MentalChallenge choice = new MentalChallenge();

        choice.setMentalAnswer('a');
        System.out.println();

        //item class
        Item d1 = new Item();
        d1.setType("USA Dossier");

        System.out.println("You have the " + d1.toString());


    }

}

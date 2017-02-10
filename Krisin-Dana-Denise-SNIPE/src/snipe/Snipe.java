/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snipe;

import byui.cit260.snipe.model.Challenge;
import byui.cit260.snipe.model.Country;
import byui.cit260.snipe.model.Item;
import byui.cit260.snipe.model.Map;
import byui.cit260.snipe.model.Player;
import byui.cit260.snipe.model.MathPuzzle;
import byui.cit260.snipe.model.MentalChallenge;
import byui.cit260.snipe.model.PhysicalChallenge;
import byui.cit260.snipe.model.Place;
import byui.cit260.snipe.model.World;
import byui.cit260.snipe.control.ChallengeControl;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;
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

        // These lines are testing classes that Denise added
        Map playerMap = new Map();
        playerMap.setNumCols(7);
        playerMap.setNumCols(4);
        playerMap.setVisited(true);
        //map has a list I couldn't get to work
        System.out.println("Map fields " + playerMap);

        Country usaCountry = new Country();
        usaCountry.setEntryPointCode("G1");
        usaCountry.setEntryPointDesc("You have arrived at SNIPE Academy");
        //country has a list i couldn't get to work
        System.out.println("Country fields " + usaCountry);

        Place placeOne = new Place();
        placeOne.setCountryCode("U1");
        placeOne.setChallenge(true);
        placeOne.setMasterCodePiece("7-15-15-4");
        placeOne.setPlaceCode("P");
        placeOne.setPlaceName("Washington DC");
        placeOne.setPlaceScene("You are standing in front of...");
        System.out.println("Place fields " + placeOne);

        World gameWorld = new World();
        //Couldn't get the list to work and that is all world contains.

        // Call the calcMathPuzzle2 function in ChallengeControl 

 //       String animals = ChallengeControl.calcMathPuzzle2();
        
        //prints outs the number chickens and cows 
       
 //       System.out.println(animals);
        String animals = ChallengeControl.calcMathPuzzle2(74, 30);
        
        //prints outs the number chickens and cows 
       
        System.out.println(animals);

    }
}


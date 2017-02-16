/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.control;

import byui.cit260.snipe.model.Player;
import java.util.Random;
import snipe.Snipe;

/**
 *
 * @author danahudrlik
 */

/*
createPlayer(name): Player
BEGIN
    IF (name == null ) THEN
        RETURN null

    Create Player object
    Set the name in the player object
    Save the Player as a global variable
END

null value is used for String; -1 is used for int
*/

public class GameControl {

    public static Player createPlayer(String name) {

        if (name == null) {
            return null;
        }

        Player player = new Player();
        player.setName(name);

        Snipe.setPlayer(player); // save the player        

        return player;
    }

    public static String getCodeName(String[] args) {

        String[] names1 = {"Speedy", "Bright", "Stealthy", "Silent", "Brave", "Dizzy", "Neon", "Red", "Diamond", "Silver"};
        String[] names2 = {"Unicorn", "Snake", "Ninja", "Lizard", "King", "Tabasco", "Cockroach", "Ladybug", "Dancer", "Tuna"};

        Random random = new Random();
        String firstName = names1[random.nextInt(names1.length)];
        String lastName = names2[random.nextInt(names2.length)];

        return "Your SNIPE code name is " + firstName + " " + lastName + ".";
    }

    public static void createNewGame(Player player) {
        System.out.println("\n*** createNewGame stub function called ***");
    }
}

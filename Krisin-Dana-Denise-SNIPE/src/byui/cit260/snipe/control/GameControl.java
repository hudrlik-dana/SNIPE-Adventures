/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.control;

import byui.cit260.snipe.model.Country;
import byui.cit260.snipe.model.Game;
import byui.cit260.snipe.model.Place;
import byui.cit260.snipe.model.Player;
import byui.cit260.snipe.model.World;
import java.util.List;
import java.util.Random;
import snipe.Snipe;

/**
 *
 * @author dana.hudrlik
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

        Game game = new Game();
        
        World world = setupWorld();
        
        game.setWorld(world);
        game.setPlayer(player);

        player.setCurrentCountry(world.getCountries().get(0));
        player.setCurrentPlace(world.getCountries().get(0).getPlaces().get(0));
    }

    private static World setupWorld() {

        World world = new World();

        //USA
        Country usa = new Country();
        usa.setName("USA");

        Place snipeAcademy = new Place();
        snipeAcademy.setChallenge(false);
        snipeAcademy.setCountryCode("U");
        snipeAcademy.setPlaceScene("You're at the snipe academy...");
        snipeAcademy.setPlaceName("Snipe Academy");
        usa.addPlace(snipeAcademy);

        Place libraryCongress = new Place();
        libraryCongress.setChallenge(false);
        libraryCongress.setCountryCode("U");
        libraryCongress.setPlaceName("Library of Congress");
        libraryCongress.setPlaceScene("You're at the Library of Congress...");
        usa.addPlace(libraryCongress);

        world.addCountry(usa);

        //Germany
        Country germany = new Country();
        germany.setName("Germany");

        Place berlin = new Place();
        berlin.setChallenge(false);
        berlin.setCountryCode("G");
        berlin.setPlaceName("Berlin");
        berlin.setPlaceScene("You're at the berlin...");
        germany.addPlace(berlin);

        Place cologne = new Place();
        cologne.setChallenge(false);
        cologne.setCountryCode("G");
        cologne.setPlaceName("Cologne");
        cologne.setPlaceScene("You're at the cologne...");
        germany.addPlace(cologne);

        world.addCountry(germany);

        return world;
    }
}

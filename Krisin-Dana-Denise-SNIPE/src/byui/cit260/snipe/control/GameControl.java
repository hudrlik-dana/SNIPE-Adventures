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
        snipeAcademy.setPlaceName("Snipe Academy");
        snipeAcademy.setPlaceScene("\n You're at the Snipe Academy. This is where all secret "
                                 + "\n agents begin training, graduate upon completion of their"
                                 + "\n training graduate upon completion of their training mission,"
                                 + "\n and recover from death defying accidents. The exact "
                                 + "\n location of the S.N.I.P.E. academy is classified. This is"
                                 + "\n the safe-house in the USA. Your trainers and handlers are"
                                 + "\n here to help you become the best of the best, unseen by most,"
                                 + "\n invisible in plain sight. The code to enter is your secret spy"
                                 + "\n name and passport.");
        usa.addPlace(snipeAcademy);
         
   
        Place libraryCongress = new Place();
        libraryCongress.setChallenge(false);
        libraryCongress.setCountryCode("U");
        libraryCongress.setPlaceName("Library of Congress");
        libraryCongress.setPlaceScene("\n You're at the Library of Congress now. This is a very"
                                    + "\n secure building and you will need to be sharp to "
                                    + "\n accomplish your mission!");
        usa.addPlace(libraryCongress);
        
        Place gatewayArch = new Place();
        gatewayArch.setChallenge(false);
        gatewayArch.setCountryCode("U");
        gatewayArch.setPlaceName("Gateway Arch");
        gatewayArch.setPlaceScene("\n You have arrived at the Gateway Arch in St. Louis Missouri."
                                + "\n The Arch is a spectacular sight, but you quickly remember"
                                + "\n you are on a mission!");
        usa.addPlace(gatewayArch);
        
        world.addCountry(usa);

        //Germany
        Country germany = new Country();
        germany.setName("Germany");

        Place berlin = new Place();
        berlin.setChallenge(false);
        berlin.setCountryCode("G");
        berlin.setPlaceName("Berlin");
        berlin.setPlaceScene("\n After passing through part of the bustling city, you"
                           + "\n are dropped off at the Berlin Wall and get out the taxi"
                           + "\n cab. The Brandenburg Gate, the iconic triumphal arch"
                           + "\n straddling East and West Berlin is to your right. You"
                           + "\n notice a man dressed in a trench coat and hat near"
                           + "\n the Berlin memorial on your left. A tourist group is now"
                           + "\n approaching and you see the man go over to the section of"
                           + "\n the wall, take something out of his pocket and seemingly"
                           + "\n put it in one of the cracks in the wall. The tourist group"
                           + "\n gets in the way of your view and you can only assume"
                           + "\n the man went out the gate near the end of the wall.");
        germany.addPlace(berlin);

        Place cologne = new Place();
        cologne.setChallenge(false);
        cologne.setCountryCode("G");
        cologne.setPlaceName("Cologne Cathedral");
        cologne.setPlaceScene("\n You arrive in front of the majestic Cologne Cathedral. The"
                            + "\n intricate detail of the building with spires reaching for"
                            + "\n the heavens would suggest this massive building has been around"
                            + "\n for centuries. You go inside to see the beauty of the building"
                            + "\n amplifies with gorgeous arches, doors and stunning leaded"
                            + "\n glass windows. You walk down a long arched hallway lined with"
                            + "\n marble columns to find a door at the end. You open"
                            + "\n it and a stairway leads down to a lower level.");
        germany.addPlace(cologne);
        
        Place rhineRiver = new Place();
        rhineRiver.setChallenge(false);
        rhineRiver.setCountryCode("G");
        rhineRiver.setPlaceName("Rhine River");
        rhineRiver.setPlaceScene("\n You take a boat on the Rhine River and the city seems to"
                            + "\n get smaller and smaller the further south the boat sails. A"
                            + "\n thick border of trees line the river and you are entering"
                            + "\n the country side. Along the river, you see what looks like"
                            + "\n a spectacular castle jutting out of the greenery along the"
                            + "\n river. The sun bathes the masonry of the castle, illuminating"
                            + "\n all the details of the peaks, windows and a rustic cylinder"
                            + "\n that looks like a farming silo that is directly behind the"
                            + "\n main building.");
        germany.addPlace(rhineRiver);
        
        world.addCountry(germany);

        //England
        Country england = new Country();
        england.setName("England");
        
        Place bigBen = new Place();
        bigBen.setChallenge(false);
        bigBen.setCountryCode("E");
        bigBen.setPlaceName("Big Ben");
        bigBen.setPlaceScene("You are standing in front of Big Ban.");
        england.addPlace(bigBen);
        
        Place buckinghamPalace = new Place();
        buckinghamPalace.setChallenge(false);
        buckinghamPalace.setCountryCode("E");
        buckinghamPalace.setPlaceName("Buckingham Palace");
        buckinghamPalace.setPlaceScene("\n You are driving up to Buckingham Palace and see the large memorial"
                                     + "\n statue of Queen Victoria in the center of the circle drive. Buckingham"
                                     + "\n Palace, looks like an enormous rectangular building with perfect"
                                     + "\n symmetry. Every window perfectly placed with a main entryway adorned"
                                     + "\n with marble columns in the middle and smaller copycat entries on each"
                                     + "\n side. You step out onto the faded red pavement to start your mission here.");
        england.addPlace(buckinghamPalace);
        
        Place westminsterAbby = new Place();
        westminsterAbby.setChallenge(false);
        westminsterAbby.setCountryCode("E");
        westminsterAbby.setPlaceName("Westminster Abby");
        westminsterAbby.setPlaceScene("\n You arrived at the Westminster Abby, a gothic styled church of"
                                    + "\n the 13th century. Steeped deep in history this building has witnessed"
                                    + "\n every coronation of since the 10th century and sixteen royal"
                                    + "\n weddings. Recalling history, you remember that the Abby is a"
                                    + "\n burial place of kings, statesmen, poets, scientists, warriors and musicians."
                                    + "\n This regal, magnificent building has the most gorgeous details."
                                    + "\n The windows are a work of geometric art with their varying shapes"
                                    + "\n and patterns of leaded glass. People are bustling around, both"
                                    + "\n inside and outside of the church.");
        england.addPlace(westminsterAbby);
        
        world.addCountry(england);
        
        //Spain
        Country spain = new Country();
        spain.setName("Spain");
        
        Place tarragona = new Place();
        tarragona.setChallenge(false);
        tarragona.setCountryCode("S");
        tarragona.setPlaceName("Tarragona");
        tarragona.setPlaceScene("You are in Spain tarragona");
        spain.addPlace(tarragona);
        
        Place valencia = new Place();
        valencia.setChallenge(false);
        valencia.setCountryCode("S");
        valencia.setPlaceName("Valencia");
        valencia.setPlaceScene("This is valencia");
        spain.addPlace(valencia);
        
        Place cathedralSeville = new Place();
        cathedralSeville.setChallenge(false);
        cathedralSeville.setCountryCode("S");
        cathedralSeville.setPlaceName("Cathedral of Seville");
        cathedralSeville.setPlaceScene("You are at the cathedral of seville");
        spain.addPlace(cathedralSeville);
        
        world.addCountry(spain);
        
        
        //Russia
        Country russia = new Country();
        russia.setName("Russia");
        
        Place stPetersSquare = new Place();
        stPetersSquare.setChallenge(false);
        stPetersSquare.setCountryCode("R");
        stPetersSquare.setPlaceName("St. Peter's Square");
        stPetersSquare.setPlaceScene("You are at St. Peters Square");
        russia.addPlace(stPetersSquare);
        
        Place stBasilsCathedral = new Place();
        stBasilsCathedral.setChallenge(false);
        stBasilsCathedral.setCountryCode("R");
        stBasilsCathedral.setPlaceName("Saint Basil's Cathedral");
        stBasilsCathedral.setPlaceScene("You are at the Saint Basil's Cathedral");
        russia.addPlace(stBasilsCathedral);
        
        Place leninsMausoleum = new Place();
        leninsMausoleum.setChallenge(false);
        leninsMausoleum.setCountryCode("R");
        leninsMausoleum.setPlaceName("Lenin's Mausoleum");
        leninsMausoleum.setPlaceScene("You are at Lenin's Mausoleum");
        russia.addPlace(leninsMausoleum);
        
        world.addCountry(russia);
        
         //France
        Country france = new Country();
        france.setName("France");
        
        Place eiffelTower = new Place();
        eiffelTower.setChallenge(false);
        eiffelTower.setCountryCode("F");
        eiffelTower.setPlaceName("Eiffel Tower");
        eiffelTower.setPlaceScene("You are at the Eiffle Tower");
        france.addPlace(eiffelTower);
        
        Place louvre = new Place();
        louvre.setChallenge(false);
        louvre.setCountryCode("F");
        louvre.setPlaceName("The Louvre");
        louvre.setPlaceScene("You are at the Louvre in France!");
        france.addPlace(louvre);
        
        Place cafeFrance = new Place();
        cafeFrance.setChallenge(false);
        cafeFrance.setCountryCode("F");
        cafeFrance.setPlaceName("Sidewalk Cafe in France");
        cafeFrance.setPlaceScene("You are at a French sidewalk cafe");
        france.addPlace(cafeFrance);
        
        world.addCountry(france);
        
        
        
        return world;
    }
}

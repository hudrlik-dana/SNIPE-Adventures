package byui.cit260.snipe.control;

import byui.cit260.snipe.exceptions.GameControlException;
import byui.cit260.snipe.model.Country;
import byui.cit260.snipe.model.Game;
import byui.cit260.snipe.model.Place;
import byui.cit260.snipe.model.Player;
import byui.cit260.snipe.model.World;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Random;
import snipe.Snipe;

/**
 *
 * @author danahudrlik
 */
public class GameControl {

    public static Player createPlayer(String name) throws GameControlException {

        if (name == null) {
            return null;
        }

        Player player = new Player();
        player.setName(name);

        Snipe.setPlayer(player); // save the player        

        return player;
    }

    public static String getCodeName() throws GameControlException {

        String[] names1 = {"Speedy", "Bright", "Stealthy", "Silent", "Brave", "Dizzy", "Neon", "Red", "Diamond", "Silver"};
        String[] names2 = {"Unicorn", "Snake", "Ninja", "Lizard", "King", "Tabasco", "Cockroach", "Ladybug", "Dancer", "Tuna"};

        Random random = new Random();
        String firstName = names1[random.nextInt(names1.length)];
        String lastName = names2[random.nextInt(names2.length)];

        return "\n" + "\nYour SNIPE code name is " + firstName + " " + lastName + ".";
    }

    public static void createNewGame(Player player) throws GameControlException {

        Game game = new Game();

        World world = setupWorld();

        game.setWorld(world);
        game.setPlayer(player);

        player.setCurrentCountry(world.getCountries().get(0));
        player.setCurrentPlace(world.getCountries().get(0).getPlaces().get(0));
        player.setPlayerHealth(100);
        player.setCodeName(getCodeName());

        Snipe.setCurrentGame(game);
    }

    private static World setupWorld() throws GameControlException {

        World world = new World();
//*********************************************************************************************
//* For the logic to work in this game it is critical that the places are built in this order.
//*
//* 1st) Safe house
//* 2nd) Puzzle or Mental Challenge
//* 3rd) Physical Challenge
//*
//* The logic is found in the TravelMenuView.  Also, ChallengeMentalView, ChallengePhysicalView
//* and ChallengeRiddleView search for country name, formated like this (Germany, USA, Spain, England)
//  If you change the values of the model, the programs will need to change as well.  
//*
//*********************************************************************************************
        //USA  
        Country usa = new Country();
        usa.setName("USA");

        Place snipeAcademy = new Place();
        snipeAcademy.setChallenge(false);
        snipeAcademy.setCountryCode("U");
        snipeAcademy.setPlaceName("Snipe Academy");
        snipeAcademy.setPlaceScene("\n You're at the Snipe Academy.");
        snipeAcademy.setMasterCodePiece("327 W5HG4M1.");
        usa.addPlace(snipeAcademy);

        Place libraryCongress = new Place();
        libraryCongress.setChallenge(true);
        libraryCongress.setCountryCode("U");
        libraryCongress.setPlaceName("Library of Congress");
        libraryCongress.setPlaceScene("\n You're at the Library of Congress now. This is a very"
                + "\n secure building and you will need to be sharp to "
                + "\n accomplish your mission!");
        libraryCongress.setMasterCodePiece("327 W5HG4M1.");
        usa.addPlace(libraryCongress);

        Place gatewayArch = new Place();
        gatewayArch.setChallenge(true);
        gatewayArch.setCountryCode("U");
        gatewayArch.setPlaceName("Gateway Arch");
        gatewayArch.setPlaceScene("\n You have arrived at the Gateway Arch in St. Louis Missouri."
                + "\n The Arch is a spectacular sight, but you quickly remember"
                + "\n you are on a mission!");
        gatewayArch.setMasterCodePiece("327 W5HG4M1.");
        usa.addPlace(gatewayArch);

        world.addCountry(usa);

        //Germany
        Country germany = new Country();
        germany.setName("Germany");

        Place rhineRiver = new Place();
        rhineRiver.setChallenge(false);
        rhineRiver.setCountryCode("G");
        rhineRiver.setPlaceName("Rhine River");
        rhineRiver.setPlaceScene("\n You take a boat on the Rhine River.");
        rhineRiver.setMasterCodePiece("6MG4W3G5 V37 V567.");
        germany.addPlace(rhineRiver);

        Place berlin = new Place();
        berlin.setChallenge(true);
        berlin.setCountryCode("G");
        berlin.setPlaceName("Berlin Wall");
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
        berlin.setMasterCodePiece("6MG4W3G5 V37 V567.");
        germany.addPlace(berlin);

        Place cologne = new Place();
        cologne.setChallenge(true);
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
        cologne.setMasterCodePiece("6MG4W3G5 V37 V567.");
        germany.addPlace(cologne);

        world.addCountry(germany);

        //England
        Country england = new Country();
        england.setName("England");

        Place westminsterAbbey = new Place();
        westminsterAbbey.setChallenge(false);
        westminsterAbbey.setCountryCode("E");
        westminsterAbbey.setPlaceName("Westminster Abbey");
        westminsterAbbey.setPlaceScene("\n You grab a taxi and head to Westminster Abbey");
        westminsterAbbey.setMasterCodePiece("W5X4H43M");
        england.addPlace(westminsterAbbey);

        Place bigBen = new Place();
        bigBen.setChallenge(true);
        bigBen.setCountryCode("E");
        bigBen.setPlaceName("Big Ben");
        bigBen.setPlaceScene("\n A taxi takes you to Westminster, in Central London. The cab drops"
                + "\n you off practically under Big Ben, the iconic clock that is a"
                + "\n tourist magnet. There is no shortage of tourists today. They are"
                + "\n easily spotted with their british flag t-shirts and phones taking"
                + "\n selfies everywhere. You arrive at 11:57, which is just before Big"
                + "\n Ben will strike 12 to indicate it is noon. Gong. You can feel the"
                + "\n vibrations from the 13 ton bell. Gong...");
        bigBen.setMasterCodePiece("W5X4H43M");
        england.addPlace(bigBen);

        Place buckinghamPalace = new Place();
        buckinghamPalace.setChallenge(true);
        buckinghamPalace.setCountryCode("E");
        buckinghamPalace.setPlaceName("Buckingham Palace");
        buckinghamPalace.setPlaceScene("\n You are driving up to Buckingham Palace and see the large memorial"
                + "\n statue of Queen Victoria in the center of the circle drive. Buckingham"
                + "\n Palace, looks like an enormous rectangular building with perfect"
                + "\n symmetry. Every window perfectly placed with a main entryway adorned"
                + "\n with marble columns in the middle and smaller copycat entries on each"
                + "\n side. You step out onto the faded red pavement to start your mission here.");
        buckinghamPalace.setMasterCodePiece("W5X4H43M");
        england.addPlace(buckinghamPalace);

        world.addCountry(england);

        //Spain
        Country spain = new Country();
        spain.setName("Spain");

        Place cathedralSeville = new Place();
        cathedralSeville.setChallenge(false);
        cathedralSeville.setCountryCode("S");
        cathedralSeville.setPlaceName("Cathedral of Seville");
        cathedralSeville.setPlaceScene("\n A taxi drops you off at the Cathedral of Seville.");
        cathedralSeville.setMasterCodePiece("56XS W61 4H");
        spain.addPlace(cathedralSeville);

        Place valencia = new Place();
        valencia.setChallenge(true);
        valencia.setCountryCode("S");
        valencia.setPlaceName("Valencia");
        valencia.setPlaceScene("\n You have made your way to the city of Valencia, Spain. The"
                + "\n buildings are very densely spaced in rows and patterns. This"
                + "\n city is an eclectic view of modern and very old buildings rich"
                + "\n in history. Beautiful hotels span the beaches but deeper in you"
                + "\n see complex of modern buildings called Cludada de las Artes las"
                + "\n Ciencias. You soon see that the buildings are so tightly packed"
                + "\n it would be easy to get confused and get disorientated.");
        valencia.setMasterCodePiece("56XS W61 4H");
        spain.addPlace(valencia);

        Place tarragona = new Place();
        tarragona.setChallenge(true);
        tarragona.setCountryCode("S");
        tarragona.setPlaceName("Tarragona");
        tarragona.setPlaceScene("\n After you fly into Spain you are taken to Tarragona city."
                + "\n This city is ancient and has many ruins. The old warm tan "
                + "\n stone buildings are built into the hillside and the sea meets"
                + "\n the edge of the lower buildings. You see the stains on the"
                + "\n lower buildings from when the tide comes in and rolls up on"
                + "\n them. The sun is hot and it is apparent you have arrived in"
                + "\n the Mediterranean.");
        tarragona.setMasterCodePiece("56XS W61 4H");
        spain.addPlace(tarragona);

        world.addCountry(spain);

        //Russia
        Country russia = new Country();
        russia.setName("Russia");

        Place leninsMausoleum = new Place();
        leninsMausoleum.setChallenge(false);
        leninsMausoleum.setCountryCode("R");
        leninsMausoleum.setPlaceName("Lenin's Mausoleum");
        leninsMausoleum.setPlaceScene("\n After arriving in Red Square in Moscow, you see Lenin’s Mausoleum.");
        leninsMausoleum.setMasterCodePiece("7N M5PH3M");
        russia.addPlace(leninsMausoleum);

        Place stPetersSquare = new Place();
        stPetersSquare.setChallenge(true);
        stPetersSquare.setCountryCode("R");
        stPetersSquare.setPlaceName("St. Peter's Square");
        stPetersSquare.setPlaceScene("\n You arrive at St. Peter’s Square in Moscow Russia. In the center of"
                + "\n the square is a statue of an angel with a cross that stands at least"
                + "\n 5 stories tall. The square is surrounded with enormous stately"
                + "\n rectangular stone buildings. The stone payment going up to each"
                + "\n building looks to be 2 times a Walmart supercenter parking lot."
                + "\n A mint green building with white trim and statues all across the"
                + "\n edge of rooftop seems more like an enormous wall rather than a building."
                + "\n You realize that is Hermitage museum.");
        stPetersSquare.setMasterCodePiece("7N M5PH3M");
        russia.addPlace(stPetersSquare);

        Place stBasilsCathedral = new Place();
        stBasilsCathedral.setChallenge(true);
        stBasilsCathedral.setCountryCode("R");
        stBasilsCathedral.setPlaceName("Saint Basil's Cathedral");
        stBasilsCathedral.setPlaceScene("\n You arrive at Saint Basil’s Cathedral, an unmistakable Russian"
                + "\n building. The multi-colored puffed onion domes top this mainly"
                + "\n red colored 16th century building. You see the 2-story high statue"
                + "\n of two warriors in front as you walk toward the gate.");
        stBasilsCathedral.setMasterCodePiece("7N M5PH3M");
        russia.addPlace(stBasilsCathedral);

        world.addCountry(russia);

        //France
        Country france = new Country();
        france.setName("France");

        Place cafeFrance = new Place();
        cafeFrance.setChallenge(false);
        cafeFrance.setCountryCode("F");
        cafeFrance.setPlaceName("Sidewalk Cafe in France");
        cafeFrance.setPlaceScene("\n You walk to the Cafe De Flore as instructed.");
        cafeFrance.setMasterCodePiece("W5X4H43MH W5G57N4M5");
        france.addPlace(cafeFrance);

        Place louvre = new Place();
        louvre.setChallenge(true);
        louvre.setCountryCode("F");
        louvre.setPlaceName("The Louvre");
        louvre.setPlaceScene("\n You arrive at the Louvre Museum. Buildings surround the glass pyramid"
                + "\n and fountains. The glass of the Louvre Pyramid is glowing with this"
                + "\n beautiful gold light making the diamond pattern of the framework stand"
                + "\n out. You start walking toward the museum entry.");
        louvre.setMasterCodePiece("W5X4H43MH W5G57N4M5");
        france.addPlace(louvre);

        Place eiffelTower = new Place();
        eiffelTower.setChallenge(true);
        eiffelTower.setCountryCode("F");
        eiffelTower.setPlaceName("Eiffel Tower");
        eiffelTower.setPlaceScene("\n You take bus line 82 and get off at BRANLY. As your bus nears"
                + "\n you can see the iconic trademark of Paris, the Eiffel tower. "
                + "\n You see people walking up the stairs inside the legs of the tower."
                + "\n You get off the bus and start walking toward it.   People are all"
                + "\n around. The elevator lifts shoot up the curved metal structure."
                + "\n The first deck has people peering out at the views. Then you look"
                + "\n further up to see the other two decks with people taking pictures"
                + "\n and taking in the view. ");
        eiffelTower.setMasterCodePiece("W5X4H43MH W5G57N4M5");
        france.addPlace(eiffelTower);

        world.addCountry(france);

        //Canada
        Country canada = new Country();
        canada.setName("Canada");

        Place cnTower = new Place();
        cnTower.setChallenge(false);
        cnTower.setCountryCode("C");
        cnTower.setPlaceName("CN Tower");
        cnTower.setPlaceScene("\n You travel to Toronto, Ontario in Canada.");
        cnTower.setMasterCodePiece("6MW 327");
        canada.addPlace(cnTower);

        Place libraryParliament = new Place();
        libraryParliament.setChallenge(true);
        libraryParliament.setCountryCode("C");
        libraryParliament.setPlaceName("Library of Parliament");
        libraryParliament.setPlaceScene("\n You are now in Ottawa, Canada making your way to the Library of Parliament."
                + "\n The light-tan colored stone building  is circular in shape, in the Victorian"
                + "\n Gothic style adorned with pointed arches, spires and dark brown slate roofs."
                + "\n You get out of the car and proceed to the door. ");
        libraryParliament.setMasterCodePiece("6MW 327");
        canada.addPlace(libraryParliament);

        Place montrealStadium = new Place();
        montrealStadium.setChallenge(true);
        montrealStadium.setCountryCode("C");
        montrealStadium.setPlaceName("Montreal Olympic Stadium");
        montrealStadium.setPlaceScene("\n From a distance you see the Montreal Olympic Stadium with its unmistakable"
                + "\n hoisting tower that looks like a modern lamp for the spaceship looking"
                + "\n building. You can see that the stadium has it’s white roof on right now."
                + "\n You are dropped off ready for your mission.  ");
        montrealStadium.setMasterCodePiece("6MW 327");
        canada.addPlace(montrealStadium);

        world.addCountry(canada);

        //Brazil
        Country brazil = new Country();
        brazil.setName("Brazil");

        Place saoPaulo = new Place();
        saoPaulo.setChallenge(false);
        saoPaulo.setCountryCode("B");
        saoPaulo.setPlaceName("Sao Paulo");
        saoPaulo.setPlaceScene("\n You are headed for Brazil’s largest city, Sao Paulo.");
        saoPaulo.setMasterCodePiece("V64GS 4H GS5");
        brazil.addPlace(saoPaulo);

        Place rioDeJaneiro = new Place();
        rioDeJaneiro.setChallenge(true);
        rioDeJaneiro.setCountryCode("B");
        rioDeJaneiro.setPlaceName("Rio De Janeiro");
        rioDeJaneiro.setPlaceScene("\n Traveling to Rio De Janeiro, Brazil is easy on the eyes. The clear aqua"
                + "\n colored beaches and sunny days will have  you thinking vacation. Hotels"
                + "\n line the sandy beaches but the city is densely populated with buildings."
                + "\n Beach life is clearly a passion here as you see so many people on the"
                + "\n beach soaking up the sun.  ");
        rioDeJaneiro.setMasterCodePiece("V64GS 4H GS5");
        brazil.addPlace(rioDeJaneiro);

        Place amazonForest = new Place();
        amazonForest.setChallenge(true);
        amazonForest.setCountryCode("B");
        amazonForest.setPlaceName("Amazon Forest");
        amazonForest.setPlaceScene("\n You are in a Jeep traveling along and through the forest at times. The dirt"
                + "\n roads mainly go along the side.  You see children ahead and are dropped off"
                + "\n at a small town of wooden shack structures. The smell of burning firewood is"
                + "\n in the air. Clothes hang on a line swaying in the wind ");
        amazonForest.setMasterCodePiece("V64GS 4H GS5");
        brazil.addPlace(amazonForest);

        world.addCountry(brazil);

        //Australia
        Country australia = new Country();
        australia.setName("Australia");

        Place melbourneJail = new Place();
        melbourneJail.setChallenge(false);
        melbourneJail.setCountryCode("A");
        melbourneJail.setPlaceName("Old Melbourne Jail");
        melbourneJail.setPlaceScene("\n You are headed to the Old Melbourne Jail in Victoria, Australia.");
        melbourneJail.setMasterCodePiece("6 W61 3V");
        australia.addPlace(melbourneJail);

        Place sydneyOpHouse = new Place();
        sydneyOpHouse.setChallenge(true);
        sydneyOpHouse.setCountryCode("A");
        sydneyOpHouse.setPlaceName("Sydney Opera House");
        sydneyOpHouse.setPlaceScene("\n You are on your way to the Sydney Opera House in Sydney, Australia."
                + "\n The architecture of this iconic modern building is constructed of"
                + "\n concave triangles looking like layered dog ears standing on end."
                + "\n The building is on a small peninsula that protrudes out into the"
                + "\n ocean. Coming from the city you pass the greenery of the park and"
                + "\n see the opera house perfectly positioned for the view of the ocean.");
        sydneyOpHouse.setMasterCodePiece("6 W61 3V");
        australia.addPlace(sydneyOpHouse);

        Place australiaBridge = new Place();
        australiaBridge.setChallenge(true);
        australiaBridge.setCountryCode("A");
        australiaBridge.setPlaceName("Australia Bridge");
        australiaBridge.setPlaceScene("\n Traveling to the Sydney Harbor, you can see the Sydney Harbor"
                + "\n bridge. You see the steel constructed arch and supporting cables."
                + "\n This iconic bridge is also known as the “coat hanger” As you get"
                + "\n closer you see there are 4 lanes going each way and a pedestrian"
                + "\n walkway. You get out and ready yourself for your mission.");
        australiaBridge.setMasterCodePiece("6 W61 3V");
        australia.addPlace(australiaBridge);

        world.addCountry(australia);

        return world;
    }

    public static void saveGame(Game game, String filepath) throws GameControlException {

        try (FileOutputStream fops = new FileOutputStream(filepath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);

            output.writeObject(game); //write the game object out to file
        } catch (Exception e) {
            throw new GameControlException(e.getMessage());
        }

    }

    public static void getSavedGame(String filePath) throws GameControlException {

        Game game = null;

        try (FileInputStream fips = new FileInputStream(filePath)) {
            ObjectInputStream input = new ObjectInputStream(fips);

            game = (Game) input.readObject();
        } catch (Exception e) {
            throw new GameControlException(e.getMessage());
        }

        Snipe.setCurrentGame(game);
    }

}

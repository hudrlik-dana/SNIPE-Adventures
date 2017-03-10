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
import byui.cit260.snipe.view.GameMenuView;
import byui.cit260.snipe.view.MainMenuView;
import java.util.Random;
import java.util.ArrayList;
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

    public static String getCodeName() {

        String[] names1 = {"Speedy", "Bright", "Stealthy", "Silent", "Brave", "Dizzy", "Neon", "Red", "Diamond", "Silver"};
        String[] names2 = {"Unicorn", "Snake", "Ninja", "Lizard", "King", "Tabasco", "Cockroach", "Ladybug", "Dancer", "Tuna"};

        Random random = new Random();
        String firstName = names1[random.nextInt(names1.length)];
        String lastName = names2[random.nextInt(names2.length)];

        return "\n" + "\nYour SNIPE code name is " + firstName + " " + lastName + ".";
    }

    public static void createNewGame(Player player) {

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

        Place berlin = new Place();
        berlin.setChallenge(false);
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
        cologne.setMasterCodePiece("6MG4W3G5 V37 V567.");
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
        buckinghamPalace.setChallenge(false);
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
        
        Place westminsterAbbey = new Place();
        westminsterAbbey.setChallenge(false);
        westminsterAbbey.setCountryCode("E");
        westminsterAbbey.setPlaceName("Westminster Abbey");
        westminsterAbbey.setPlaceScene("\n You arrived at the Westminster Abbey, a gothic styled church of"
                                    + "\n the 13th century. Steeped deep in history this building has witnessed"
                                    + "\n every coronation of since the 10th century and sixteen royal"
                                    + "\n weddings. Recalling history, you remember that the Abbey is a"
                                    + "\n burial place of kings, statesmen, poets, scientists, warriors and musicians."
                                    + "\n This regal, magnificent building has the most gorgeous details."
                                    + "\n The windows are a work of geometric art with their varying shapes"
                                    + "\n and patterns of leaded glass. People are bustling around, both"
                                    + "\n inside and outside of the church.");
        england.addPlace(westminsterAbbey);
        
        world.addCountry(england);
        
        //Spain
        Country spain = new Country();
        spain.setName("Spain");
              
        Place valencia = new Place();
        valencia.setChallenge(false);
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
        tarragona.setChallenge(false);
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
        
        Place cathedralSeville = new Place();
        cathedralSeville.setChallenge(false);
        cathedralSeville.setCountryCode("S");
        cathedralSeville.setPlaceName("Cathedral of Seville");
        cathedralSeville.setPlaceScene("\n A taxi drops you off at the Cathedral of Seville. The building"
                                     + "\n is adorned  with rich detail of centuries past architecture. The"
                                     + "\n stone detail is so fine the patterns in parts could be described"
                                     + "\n as lace.  You step out onto the paver street and see this 2-story"
                                     + "\n high gate entryway made of stone and rod iron. Next you see the"
                                     + " Triumph of Faith statue tarnished with a grey-blue patina.");
        spain.addPlace(cathedralSeville);
        
        world.addCountry(spain);
        
        
        //Russia
        Country russia = new Country();
        russia.setName("Russia");
        
        Place stPetersSquare = new Place();
        stPetersSquare.setChallenge(false);
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
        stBasilsCathedral.setChallenge(false);
        stBasilsCathedral.setCountryCode("R");
        stBasilsCathedral.setPlaceName("Saint Basil's Cathedral");
        stBasilsCathedral.setPlaceScene("\n You arrive at Saint Basil’s Cathedral, an unmistakable Russian"
                                      + "\n building. The multi-colored puffed onion domes top this mainly"
                                      + "\n red colored 16th century building. You see the 2-story high statue"
                                      + "\n of two warriors in front as you walk toward the gate.");
        stBasilsCathedral.setMasterCodePiece("7N M5PH3M");
        russia.addPlace(stBasilsCathedral);
        
        Place leninsMausoleum = new Place();
        leninsMausoleum.setChallenge(false);
        leninsMausoleum.setCountryCode("R");
        leninsMausoleum.setPlaceName("Lenin's Mausoleum");
        leninsMausoleum.setPlaceScene("\n After arriving in Red Square in Moscow, you see Lenin’s Mausoleum."
                                    + "\n The mainly red stone building contrasts nicely with the charcoal"
                                    + "\n grey accent stones and grey paver brick streets. The overall look of"
                                    + "\n the building is masculine due to its color and multileveled rectangular"
                                    + "\n shapes. The red brick wall behind the building stretches upward the"
                                    + "\n the Mausoleum, serving as a background.");
        russia.addPlace(leninsMausoleum);
        
        world.addCountry(russia);
        
        //France
        Country france = new Country();
        france.setName("France");
        
        Place louvre = new Place();
        louvre.setChallenge(false);
        louvre.setCountryCode("F");
        louvre.setPlaceName("The Louvre");
        louvre.setPlaceScene("\n You arrive at the Louvre Museum. Buildings surround the glass pyramid"
                           + "\n and fountains. The glass of the Louvre Pyramid is glowing with this"
                           + "\n beautiful gold light making the diamond pattern of the framework stand"
                           + "\n out. You start walking toward the museum entry.");
        louvre.setMasterCodePiece("W5X4H43MH W5G57N4M5");
        france.addPlace(louvre);
        
        Place eiffelTower = new Place();
        eiffelTower.setChallenge(false);
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
        
        Place cafeFrance = new Place();
        cafeFrance.setChallenge(false);
        cafeFrance.setCountryCode("F");
        cafeFrance.setPlaceName("Sidewalk Cafe in France");
        cafeFrance.setPlaceScene("\n You walk to the Cafe De Flore as instructed. It’s easy to find because"
                               + "\n of its white lettering mounted  to the edge the roof just above the "
                               + "\n building. It’s a corner cafe with large round glass windows. Small"
                               + "\n bistro tables outside form a semicircle around the rounded building."
                               + "\n People are dining while reading the newspaper or talking to friends.");
        france.addPlace(cafeFrance);
        
        world.addCountry(france);
        
         //Canada
        Country canada = new Country();
        canada.setName("Canada");
                
        Place libraryParliament = new Place();
        libraryParliament.setChallenge(false);
        libraryParliament.setCountryCode("C");
        libraryParliament.setPlaceName("Library of Parliament");
        libraryParliament.setPlaceScene("\n You are now in Ottawa, Canada making your way to the Library of Parliament."
                                      + "\n The light-tan colored stone building  is circular in shape, in the Victorian"
                                      + "\n Gothic style adorned with pointed arches, spires and dark brown slate roofs."
                                      + "\n You get out of the car and proceed to the door. ");
        libraryParliament.setMasterCodePiece("6MW 327");
        canada.addPlace(libraryParliament);
        
        Place montrealStadium = new Place();
        montrealStadium.setChallenge(false);
        montrealStadium.setCountryCode("C");
        montrealStadium.setPlaceName("Montreal Olympic Stadium");
      
        
        montrealStadium.setPlaceScene("\n From a distance you see the Montreal Olympic Stadium with its unmistakable"
                                    + "\n hoisting tower that looks like a modern lamp for the spaceship looking"
                                    + "\n building. You can see that the stadium has it’s white roof on right now."
                                    + "\n You are dropped off ready for your mission.  ");
        montrealStadium.setMasterCodePiece("6MW 327");
        canada.addPlace(montrealStadium);
        
        Place cnTower = new Place();
        cnTower.setChallenge(false);
        cnTower.setCountryCode("C");
        cnTower.setPlaceName("CN Tower");
        cnTower.setPlaceScene("\n You travel to Toronto, Ontario in Canada. The city has many tall buildings"
                            + "\n but the CN tower is close to double of the tallest building from the naked"
                            + "\n eye. The building has pole like structure and the main living space near"
                            + "\n the top revolving 360 degrees like a doughnut slowly turning on a stick.");
        canada.addPlace(cnTower);
        
        world.addCountry(canada);
                
        //Brazil
        Country brazil = new Country();
        brazil.setName("Brazil");
        
        Place rioDeJaneiro = new Place();
        rioDeJaneiro.setChallenge(false);
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
        amazonForest.setChallenge(false);
        amazonForest.setCountryCode("B");
        amazonForest.setPlaceName("Amazon Forest");
        amazonForest.setPlaceScene("\n You are in a Jeep traveling along and through the forest at times. The dirt"
                                 + "\n roads mainly go along the side.  You see children ahead and are dropped off"
                                 + "\n at a small town of wooden shack structures. The smell of burning firewood is"
                                 + "\n in the air. Clothes hang on a line swaying in the wind ");
        amazonForest.setMasterCodePiece("V64GS 4H GS5");
        brazil.addPlace(amazonForest);
        
        Place saoPaulo = new Place();
        saoPaulo.setChallenge(false);
        saoPaulo.setCountryCode("B");
        saoPaulo.setPlaceName("Sao Paulo");
        saoPaulo.setPlaceScene("\n You are headed for Brazil’s largest city, Sao Paulo. The tropical to"
                             + "\n subtropical climate makes it warm year-round but have unpredictable"
                             + "\n monsoons. This is a well-established city densely populated with "
                             + "\n skyscrapers and building of all kinds. Even from the air the view"
                             + "\n is a landscape of tall buildings covering the earth. In the far of"
                             + "\n distance there are mountains that can only be seen by air.");
        brazil.addPlace(saoPaulo);
        
        world.addCountry(brazil);
        
        //Australia
        Country australia = new Country();
        australia.setName("Australia");
        
        Place sydneyOpHouse = new Place();
        sydneyOpHouse.setChallenge(false);
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
        australiaBridge.setChallenge(false);
        australiaBridge.setCountryCode("A");
        australiaBridge.setPlaceName("Australia Bridge");
        australiaBridge.setPlaceScene("\n Traveling to the Sydney Harbor, you can see the Sydney Harbor"
                                    + "\n bridge. You see the steel constructed arch and supporting cables."
                                    + "\n This iconic bridge is also known as the “coat hanger” As you get"
                                    + "\n closer you see there are 4 lanes going each way and a pedestrian"
                                    + "\n walkway. You get out and ready yourself for your mission.");
        australiaBridge.setMasterCodePiece("6 W61 3V");
        australia.addPlace(australiaBridge);
        
        Place melbourneJail = new Place();
        melbourneJail.setChallenge(false);
        melbourneJail.setCountryCode("A");
        melbourneJail.setPlaceName("Old Melbourne Jail");
        melbourneJail.setPlaceScene("\n You are headed to the Old Melbourne Jail in Victoria, Australia."
                                  + "\n It is a museum now but has quite of history and some say it is"
                                  + "\n haunted. You pull up and see a thick two-story brick wall with"
                                  + "\n an archway. You enter and see the complex. The jail is constructed"
                                  + "\n of charcoal grey colored cinder block. The building itself looks"
                                  + "\n a bit like a saltbox construction where it is one large rectangle"
                                  + "\n atop another. Each small window has metal bars. The whole scene is"
                                  + "\n dreary and feels like you could be trapped.");
        australia.addPlace(melbourneJail);
        
        world.addCountry(australia);
        
        return world;
    }
    
    
    
}

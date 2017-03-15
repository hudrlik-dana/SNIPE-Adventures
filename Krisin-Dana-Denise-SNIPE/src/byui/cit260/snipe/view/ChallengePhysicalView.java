/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.view;

import byui.cit260.snipe.control.ChallengeControl;
import byui.cit260.snipe.model.Country;
import byui.cit260.snipe.control.GameControl;
import java.util.Scanner;
import snipe.Snipe;
import byui.cit260.snipe.model.Place;

/**
 *
 * @author danahudrlik
 */
public class ChallengePhysicalView extends View {

    private String displayDescription;
    private String answerOption;

    public ChallengePhysicalView() {
        super();
        //identify the country player is in
        Country currentCountry = Snipe.getPlayer().getCurrentCountry();

        this.displayDescription = "\n Welcome to  " + currentCountry + ".";
        //welcome player to the country

        //display the description of the challenge       
        this.displayDescription();
    }

    /**
     * display description of physical challenge
     */
    public static void displayDescription() {

        Country currentCountry = Snipe.getPlayer().getCurrentCountry();

        //case switch to identify country and display the description of the challenge 
        switch (currentCountry.getName()) {
            case "USA":
                System.out.println(
                        "\n---------------------------------------------------------"
                        + "\n The Gateway Arch in St. Louis, Missouri is world famous "
                        + "\n and tourists from all over the world come to see it.    "
                        + "\n Blending into the crowd will not be hard, but finding   "
                        + "\n the exact location of your next clue from the top of    "
                        + "\n the arch at sunrise, is going to be challenging. The    "
                        + "\n direction the sun bounces off the top of the arch at    "
                        + "\n this time of year will point you towards the location   "
                        + "\n of your next clue. You devise a plan and don a disguise "
                        + "\n as a maintenance man who will be cleaning the arch. You "
                        + "\n scale up the arch with your climbing gear, cleaning as  "
                        + "\n you go. It is quite slippery, but you are hanging on    "
                        + "\n tight, and moving ever so slowly as not to fall. You    "
                        + "\n finally make it to the top just as the sun is rising    "
                        + "\n and you see in the distance a large clock tower that is "
                        + "\n glowing in the reflection from the arch. You now know   "
                        + "\n where the clue is, but getting down is going to be a    "
                        + "\n challenge. Go slowly and try not to fall.               "
                        + "\n---------------------------------------------------------"
                        + "\n Press any key to start your descent.                    "
                        + "\n---------------------------------------------------------");
                break;

            case "Germany":
                System.out.println(
                        "\n---------------------------------------------------------"
                        + "\n You arrive in front of the majestic Cologne Cathedral.  "
                        + "\n The intricate detail of the building with spires        "
                        + "\n reaching for the heavens would suggest this massive     "
                        + "\n building has been around for centuries. You go inside   "
                        + "\n inside to see the beauty of the building amplifies with "
                        + "\n gorgeous arches, doors and stunning leaded glass        "
                        + "\n windows. You walk down a long arched hallway lined with "
                        + "\n marble columns to find a door at the end. You open it   "
                        + "\n and a stairway leads down to a lower level. You find    "
                        + "\n the painting of an old ship hanging on the wall in the  "
                        + "\n west wing. After looking around to ensure no one is     "
                        + "\n watching you, you carefully reach around the painting   "
                        + "\n and slide your hand down the back side of the frame.    "
                        + "\n You remove the tattered envelope and read your next     "
                        + "\n clue:                                                   "
                        + "\n A ladder is over the side of a ship anchored in port.   "
                        + "\n The bottom rung of the ladder touches the water. The    "
                        + "\n distance between rungs is 18 inches and the length of   "
                        + "\n the ladder is 180 inches. The tide is rising at a rate  "
                        + "\n of 6 inches per hour. When will the water reach the 7th "
                        + "\n rung from the top?                                      "
                        + "\n---------------------------------------------------------"
                        + "\n Choose your answer:                                     "
                        + "\n Enter 1 - 3 hours                                       "
                        + "\n Enter 2 - 1.5 hours                                     "
                        + "\n Enter 3 - Never                                         "
                        + "\n---------------------------------------------------------");
                break;

            case "England":
                System.out.println(
                        "\n---------------------------------------------------------"
                        + "\n Buckingham Palace, this is your stop. Stepping out onto "
                        + "\n the faded red pavement, your mission begins here.       "
                        + "\n It is going to be challenging to get past the palace    "
                        + "\n guards to retrieve your next clue, but you are a SNIPE  "
                        + "\n agent, and you know how to be invisible in a crowd. You "
                        + "\n carefully slip behind the guard while tourists are      "
                        + "\n taking photos with him as he stands at attention.       "
                        + "\n Wearing your dark gray jacket and pants, you blend into "
                        + "\n the shadows on the stone walls and begin your ascent to "
                        + "\n the top of the west tower. This is a free climb, so you "
                        + "\n are moving slowly and carefully to not draw attention   "
                        + "\n to yourself. One stone at a time, your right hand       "
                        + "\n reaches out and grabs onto the cold stone, while your   "
                        + "\n left foot pushes off the toe hold, and you press your   "
                        + "\n body ever so tightly to the wall. You can see the       "
                        + "\n weathered clue just about arms-length away, tied to     "
                        + "\n the base of the pole holding the pendent.               "
                        + "\n You almost have it...                                   "
                        + "\n---------------------------------------------------------"
                        + "\n  Press any key to stretch out and reach for the clue.   "
                        + "\n---------------------------------------------------------");
                break;
            case "Spain":
                System.out.println(
                        "\n---------------------------------------------------------"
                        + "\n Roman history collides with beaches, nightlife, and     "
                        + "\n freshly grilled seafood in Tarragona. This Spain's      "
                        + "\n second most important Roman site filled with ruins and  "
                        + "\n museums. The Forum de la Colonia occupies what is now   "
                        + "\n old town, a maze of narrow streets and stone buildings  "
                        + "\n dating back several centuries. As you search for your   "
                        + "\n next clue, you notice a familiar figure wearing a dark  "
                        + "\n hat and coat. You blend in with tourists in the crowded "
                        + "\n narrow streets, hoping to shake the man who is now      "
                        + "\n definitely following you. You hear 2 shots; bang, bang! "
                        + "\n The people aroudn you are screaming, and trying to      "
                        + "\n leave the area. You see the man who was following you   "
                        + "\n lying face down, in the street as the sirens of         "
                        + "\n of approaching police cars grow louder. You can't get   "
                        + "\n caught up in whatever just happened. You need to get    "
                        + "\n out of there fast! You look around and see your contact "
                        + "\n running toward you. He thrusts a weathered brown        "
                        + "\n envelope into your hands, and tells you to run!         "
                        + "\n---------------------------------------------------------"
                        + "\n  Press any key to run as fast as the wind.              "
                        + "\n---------------------------------------------------------");
                break;
            case "Russia":
                System.out.println(
                        "\n---------------------------------------------------------"
                        + "\n This is a beautiful Cathedral. Your dossier mentioned   "
                        + "\n stacking 12 chairs behind the veiled area in the east   "
                        + "\n wing to reach the location of the next clue. You look   "
                        + "\n around and notice a large banquet type table near the   "
                        + "\n area and slowly and carefully begin taking one chair at "
                        + "\n a time from the table to the area behind the veil.      "
                        + "\n there are very few tourists in teh Cathedral today so   "
                        + "\n you can move more quickly and quietly without being     "
                        + "\n noticed. After moving all the chairs, you begin the     "
                        + "\n stacking process. You will only have one chance to get  "
                        + "\n this right and retrieve the clue. You work quickly so   "
                        + "\n you are not discovered. As you climb the stack of       "
                        + "\n chairs, you can finally see where the clue has been     "
                        + "\n hidden. Reaching out as far as you can with your right  "
                        + "\n hand, from atop the wobbly stack of chairs, you can     "
                        + "\n just about reach the clue.                              "
                        + "\n---------------------------------------------------------"
                        + "\n  Press any key carefully so you don't fall and get hurt."
                        + "\n---------------------------------------------------------");
                break;
            case "France":
                System.out.println(
                        "\n---------------------------------------------------------"
                        + "\n You board bus line 82 heading to Branly. As the bus     "
                        + "\n nears your stop, you can see the iconic trademark of    "
                        + "\n Paris, the Eiffel tower. People are walking up the      "
                        + "\n stairs inside the legs of the tower. You get off the    "
                        + "\n bus and join the crowd walking toward the monument.     "
                        + "\n The elevator lifts shoot up the curved metal structure. "
                        + "\n The first deck is crowded with people peering out at    "
                        + "\n the views. You look up and see two additional decks of  "
                        + "\n sightseers taking pictures and admiring the view. You   "
                        + "\n carefully carry your climbing gear and parachute inside "
                        + "\n your messenger bag. No one knows what you are about to  "
                        + "\n attempt. You must blend in to slip past the guards and  "
                        + "\n the tourists. Your next clue is tied to the pigeon      "
                        + "\n perched on the top of the Eiffel tower. Your parachute  "
                        + "\n is ready, in case the police catch up to you before you "
                        + "\n retrieve your next clue. Blending in with the tourists  "
                        + "\n you climb up the thousand steps to the top, then        "
                        + "\n quietly slip through a small access panel to reach the  "
                        + "\n last flight of stairs that will take you to the top of  "
                        + "\n the tower. Just as you reach the pigeon, you hear the   "
                        + "\n police yelling in French for you to stop. You quickly   "
                        + "\n strap on your parachute and jump toward the pigeon.     "
                        + "\n---------------------------------------------------------"
                        + "\n  Press any key to see if you got away with the clue.    "
                        + "\n---------------------------------------------------------");
                break;
            case "Canada":
                System.out.println(
                        "\n---------------------------------------------------------"
                        + "\n The weather in Montreal is bone-chilling cold and the   "
                        + "\n snow is blowing in flurries today as you arrive at      "
                        + "\n the Olympic Stadium. Your next clue will be found as    "
                        + "\n you descend 1500 meters down the steep two-man bobsled  "
                        + "\n run. This is going to take courage, skill, and          "
                        + "\n determineation. These bobsleds have been crashing far   "
                        + "\n to often lately, within the last 200 meters of the      "
                        + "\n finish line. You strap on your helmet, take a deep      "
                        + "\n breath, and pray you will retrieve your next clue on    "
                        + "\n the first run. Your heart skips a beat as you feel the  "
                        + "\n bobsled begin its descent.                              "
                        + "\n---------------------------------------------------------"
                        + "\n Press any key to for the final result of your first run."
                        + "\n---------------------------------------------------------");
                break;
            case "Brazil":
                System.out.println(
                        "\n---------------------------------------------------------"
                        + "\n This is a jungle cruise like no other. You will need to "
                        + "\n retrieve your next clue from an area known to be        "
                        + "\n infested with alligator filled swamps and jungles       "
                        + "\n thriving with jaugars and poisonous snakes and insects. "
                        + "\n You are wearing protective clothing, mosquito netting,  "
                        + "\n guide is a little hesitant to journey further into the  "
                        + "\n jungle, but you knkow the only way to get yoru next     "
                        + "\n is to find the old ruins where the clue is hidden. You  "
                        + "\n see what looks like a gian stone wall up ahead. There   "
                        + "\n is something poking out from a large vertical crack in  "
                        + "\n between two large stones about 6 feet above the jungle  "
                        + "\n floor. The silence is broken when all of a sudden you   "
                        + "\n hear the roar of a large angry jaguar! You race toward  "
                        + "\n the wall to get the clue, risking becoming lunch for    "
                        + "\n the hungry cat.                                         "
                        + "\n---------------------------------------------------------"
                        + "\n Press any key to see who outran the jaguar.             "
                        + "\n---------------------------------------------------------");
                break;
            case "Australia":
                System.out.println(
                        "\n --------------------------------------------------------"
                        + "\n Your last clue is located at the top of the Sydney      "
                        + "\n gateway bridge under the uppermost deck. It is a steep  "
                        + "\n 2-mile uphill climb, one step at a time, to the very    "
                        + "\n top of the bridge. Very few tourists make it all the    "
                        + "\n way there. You will need to count your steps and find   "
                        + "\n number 14,582 and reach around under the step to find   "
                        + "\n your last clue. Remember, blend in and keep going even  "
                        + "\n when the going gets tough. Start climbing and counting, "
                        + "\n 1, 2, 3, 4, 5... and try not to fall or pass out from   "
                        + "\n exhaustion.                                             "
                        + "\n west wing. After looking around to ensure no one is     "
                        + "\n watching you, you carefully reach around the painting   "
                        + "\n and slide your hand down the back side of the frame.    "
                        + "\n You remove the tattered envelope and read your next     "
                        + "\n clue:                                                   "
                        + "\n A ladder is over the side of a ship anchored in port.   "
                        + "\n The bottom rung of the ladder touches the water. The    "
                        + "\n distance between rungs is 18 inches and the length of   "
                        + "\n the ladder is 180 inches. The tide is rising at a rate  "
                        + "\n of 6 inches per hour. When will the water reach the 7th "
                        + "\n rung from the top?                                      "
                        + "\n---------------------------------------------------------"
                        + "\n Press any key when you think you are at step 14,582.    "
                        + "\n---------------------------------------------------------");
                break;
            default:
                System.out.println("\n Invalid answer. Try again.");
                break;
        }
    }

    @Override
    public boolean doAction(String choice) {

        Country currentCountry = Snipe.getPlayer().getCurrentCountry();

        switch (currentCountry.getName()) {
            case "Germany":
                if (choice.equals("1")) {

                    System.out.println(
                            "\n Bummer, your answer is incorrect consult your dossier"
                            + "\n for additional clues to solve the challenge."
                            + "\n Recalculate your answer and try again or travel to"
                            + "\n another location and try a different challenge."
                            + "\n Snipe Agents never give in, give out, nor give up!");
                }
                if (choice.equals("2")) {

                    System.out.println(
                            "\n Bummer, your answer is incorrect consult your dossier"
                            + "\n for additional clues to solve the challenge."
                            + "\n Recalculate your answer and try again or travel to"
                            + "\n another location and try a different challenge."
                            + "\n Snipe Agents never give in, give out, nor give up!");
                }
                if (choice.equals("3")) {

                    System.out.println(
                            "\n Great job! The tide is rising water, so the ship will also "
                            + "\n rise with the tide. The water will never reach past the"
                            + "\n first rung."
                            + "\n"
                            + "\n After carefully checking to see if anyone is watching, you"
                            + "\n slip the clue into your pocket and return to the Safe House"
                            + "\n to contact your handler and receive the dossier for your"
                            + "\n next mission.");
                }
                if (choice != "3" || choice != "2" || choice != "1") {

                    System.out.println("\n Invalid entry. Please select answer 1, 2, or 3");
                }
                break;

            default:
                ChallengeControl.performPhysicalChallenge();
                 {
                    if (true) {
                        System.out.println(
                                "\n Congratulations you made it!"
                                + "\n After carefully checking to see if anyone is watching,"
                                + "\n you slip the clue into your pocket and return to the "
                                + "\n Safe House to contact your handler and receive the  "
                                + "\n dossier for your next mission.");

                    } else {
                        System.out.println(
                                "\n Bummer, you fell and were injured in your attempt."
                                + "\n Return to the Safe House to rest and recover. Then consult "
                                + "\n your dossier for the location of your next challenge.");

                    }
                    return true;
                }
        }
        return false;
    }

    public void displayMenuView() {

        boolean done = false; //set flag to not done
        do {
            String answerOption = this.getInput();

            //do the requested action and display the next view
            done = this.doAction(answerOption);

        } while (!done);
    }
}

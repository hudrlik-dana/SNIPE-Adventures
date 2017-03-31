package byui.cit260.snipe.control;

import byui.cit260.snipe.exceptions.LoseGameException;
import java.util.Random;
import snipe.Snipe;

/**
 *
 * @author dana.hudrlik
 */
public class ChallengeControl {

    public boolean checkAnswer(double playerAnswer, double correctAnswer) {
        return playerAnswer == correctAnswer;
    }

//Team Assignment
    public static String calcMathPuzzle2(double totalLegs, double totalAnimals) {
        double numChickens = Math.round(((4 * totalAnimals) - totalLegs) / 2);
        double numCows = Math.round(totalAnimals - numChickens);

        String response = "You have " + numChickens + " chickens and " + numCows + " cows.";

        return response;

    }

    public void performMathPuzle1() {
        int wallHeight = 10;
        int shadowLength = 10;

        double distance = calcMathPuzzle1(wallHeight, shadowLength);

    }

    //Denise's Individual Assignment
    public static double calcMathPuzzle1(int wallHeight, int shadowLength) {
        double distance = 0;
        distance = Math.round(Math.sqrt((wallHeight * wallHeight) + (shadowLength * shadowLength)));

        return distance;
    }

//Dana's Individual Assignment
    public static double calcMathPuzzle3(int lengthA, int widthA, int lengthB, int widthB) {

        double totalBricks = Math.round(((lengthA * widthA) * 12) / (lengthB * widthB));

        return totalBricks;
    }

    public static boolean performPhysicalChallenge() {
        Random rand = new Random();
        int randomValue = rand.nextInt(100);
        return physicalChallengeCheck(randomValue, 50);
    }

    //Kristin's Individual Assignment
    public static boolean physicalChallengeCheck(int randomNumber, int challengeNumber) {
        if (randomNumber > challengeNumber) {
            return true;
        } else {
            return false;
        }
    }

//Other functions 
//Apply Damage
    public int adjustPlayerHealth() throws LoseGameException {
        try {
            int playerHealth = Snipe.getPlayer().getPlayerHealth();

            if (10 < playerHealth) {
                int currentHealth = playerHealth - 10;
                System.out.println(
                        "\n Bummer, you were injured in your attempt."
                        + "\n Return to the Safe House to rest and recover. Then consult "
                        + "\n your dossier for the location of your next challenge.");
                return currentHealth;
            }
        } catch (LoseGameException lge) {
            System.out.println(lge.getMessage());
        }
        int currentHealth;
        return currentHealth = 0;
    }

//Results of Player Answer
    String result = null;

    public String playerAnswer(char playerAnswer, char correctAnswer, char otherAnswer1, char otherAnswer2, char otherAnswer3) {

        if (playerAnswer == correctAnswer) {
            return result = "Correct";
        } else if (playerAnswer == otherAnswer1 || playerAnswer == otherAnswer2 || playerAnswer == otherAnswer3) {
            return result = "Incorrect";
        } else {
            return result = "Invalid Entry, Try Again";
        }
    }

    // Get an integer between 1 and 100.
    public int randomWithRange(int min, int max, int number) {
        int range = (max - min) + 1;
        return number = (int) (Math.random() * range) + min;

    }
}

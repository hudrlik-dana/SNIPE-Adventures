/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.view;

import java.util.Scanner;

/**
 *
 * @author aingealfire@gmail.com (new16014@byui.edu)
 */
public abstract class Challenge implements ChallengeInterface {

    protected String answerOption;

    public Challenge() {
    }

    public Challenge(String answer) {
        this.answerOption = answer;
    }

    @Override
    public void displayAnswers() {

        boolean done = false; //set flag to not done
        do {
            String answerOption = this.getAnswerOption();

            //do the requested action and display the next view
            done = this.doAction(answerOption);

        } while (!done);
    }

    @Override
    public String getAnswerOption() {
        Scanner keyboard = new Scanner(System.in); //get infile for Keyboard
        String value = ""; //value to be returned
        boolean valid = false; //initialize to not valid

        while (!valid) {
            System.out.println("\n" + this.answerOption);

            value = keyboard.nextLine(); //get next line typed on keyboard
            value = value.trim(); //trim off leading and trailing blanks

            if (value.length() < 1) { // value is blank
                System.out.println("\nInvalid: entry required.");
            }
            break; //end the loop
        }

        return value; //return entered value
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.view;

/**
 *
 * @author aingealfire@gmail.com (new16014@byui.edu)
 */
public interface ChallengeInterface {

    public void displayAnswers();

    public double injuryPoints();

    public String masterCodePiece();

    public String getAnswerOption();

    public boolean doAction(String value);

}

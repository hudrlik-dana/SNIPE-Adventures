/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snipe;

import byui.cit260.snipe.model.Game;
import byui.cit260.snipe.model.Player;
import byui.cit260.snipe.view.StartProgramView;

/**
 *
 * @author danahudrlik
 */
public class Snipe {

    private static Game currentGame = null;
    private static Player player = null;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        Snipe.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        Snipe.player = player;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Create StartProgramViewOrig and display the start program view (welcome scene)
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.displayStartProgramView();

    }
}

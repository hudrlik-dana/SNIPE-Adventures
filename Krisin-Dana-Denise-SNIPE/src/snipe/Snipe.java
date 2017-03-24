/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snipe;

import byui.cit260.snipe.exceptions.GameControlException;
import byui.cit260.snipe.model.Game;
import byui.cit260.snipe.model.Player;
import byui.cit260.snipe.view.ErrorView;
import byui.cit260.snipe.view.StartProgramView;
import byui.cit260.snipe.view.PlayerHealthView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author danahudrlik
 */
public class Snipe {

    private static Game currentGame = null;
    private static Player player = null;

    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;

    private static PrintWriter logFile = null;

    public static PrintWriter getLogfile() {
        return logFile;
    }

    public static void setLogfile(PrintWriter logfile) {
        Snipe.logFile = logfile;
    }

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

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        Snipe.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        Snipe.inFile = inFile;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws GameControlException, IOException {

        try {
            //open character stream files for end user input and output
            Snipe.inFile
                    = new BufferedReader(new InputStreamReader(System.in));
            Snipe.outFile
                    = new PrintWriter(System.out, true);

            //open log file
            String filePath = "log.txt";
            Snipe.logFile = new PrintWriter(filePath);

            //create StartProgramView and start the program
            StartProgramView startProgramView = new StartProgramView();
            startProgramView.displayStartProgramView();
            return;

        } catch (Throwable e) {

            System.out.println("Exception: " + e.toString()
                    + "\nCause: " + e.getCause()
                    + "\nMessage " + e.getMessage());
            e.printStackTrace();;
        } //       catch (Exception e) {
        //   
        //                System.out.println("Exception: " + e.toString() +
        //                                  "\nCause: "   + e.getCause() +
        //                                  "\nMessage "  + e.getMessage());
        //        }
        finally {

            try {
                if (Snipe.inFile != null) {
                    Snipe.inFile.close();
                }
                if (Snipe.outFile != null) {
                    Snipe.outFile.close();
                }
                if (Snipe.logFile != null) {
                    Snipe.logFile.close();
                }

            } catch (IOException ex) {
                System.out.println("Error Closing Files");
                return;
            }
        }

        //Create StartProgramView and display the start program view (welcome scene)
        StartProgramView startProgramView = new StartProgramView();

        try {
            startProgramView.displayStartProgramView();
        } catch (Throwable te) {
            System.out.println(te.getMessage());
            te.printStackTrace();
            startProgramView.displayStartProgramView();
        }

    }
}

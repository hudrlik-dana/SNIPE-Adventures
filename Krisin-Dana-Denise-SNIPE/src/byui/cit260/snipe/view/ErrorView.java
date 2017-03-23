/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.view;

import snipe.Snipe;
import java.io.PrintWriter;

/**
 *
 * @author aingealfire@gmail.com (new16014@byui.edu)
 */
public class ErrorView{

    private static final PrintWriter errorFile = Snipe.getOutFile();
    private static final PrintWriter logFile = Snipe.getOutFile();
    public static void display(String className, String errorMessage) {

//        System.out.println(
          errorFile.println(
                "------------------------------------------------------"
                + "\n- ERROR - " + errorMessage
                + "\n-----------------------------------------------------");

        // log error
        logFile.println(className + " - " + errorMessage);
 //       System.out.println(className + " - " + errorMessage);
    }
}

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
public class ErrorView {

    public static void display(String className, String errorMessage) {

        System.out.println(
                "------------------------------------------------------"
                + "\n- ERROR - " + errorMessage
                + "\n-----------------------------------------------------");

        // log error
        System.out.println(className + " - " + errorMessage);
    }
}

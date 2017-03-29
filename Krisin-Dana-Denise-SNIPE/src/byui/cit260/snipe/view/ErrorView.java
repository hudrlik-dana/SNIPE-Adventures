package byui.cit260.snipe.view;

import snipe.Snipe;
import java.io.PrintWriter;

/**
 *
 * @author aingealfire@gmail.com (new16014@byui.edu)
 */
public class ErrorView {

    private static final PrintWriter errorFile = Snipe.getOutFile();
    private static final PrintWriter logFile = Snipe.getOutFile();

    public static void display(String className, String errorMessage) {

        errorFile.println(
                "------------------------------------------------------"
                + "\n- ERROR - " + errorMessage
                + "\n-----------------------------------------------------");

        // log error
        logFile.println(className + " - " + errorMessage);
    }
}

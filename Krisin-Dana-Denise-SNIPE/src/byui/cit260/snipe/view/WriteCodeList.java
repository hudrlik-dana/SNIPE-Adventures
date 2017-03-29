
package byui.cit260.snipe.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import snipe.Snipe;

/**
 *
 * @author danahudrlik
 */
class WriteCodeList extends View {

    public static void writeCodeList(ArrayList<String> codeList, String filepath) throws IOException {

        try (PrintWriter output = new PrintWriter(filepath)) {

            //write header
            String header = "You have collected the following Codes:";
            output.println(header);
            //if itemList is not empty, write each item on a new line
            if (codeList.isEmpty()) {
                //do nothing
            } else {   //write list
                for (String challenge : Snipe.getPlayer().getCodeList()) {
                    output.println(challenge);
                }
            }
            output.flush();
        } catch (Exception e) {
            throw new IOException(e.getMessage());
        }
    }

    @Override
    public boolean doAction(String value) {
        return false;
    }
}

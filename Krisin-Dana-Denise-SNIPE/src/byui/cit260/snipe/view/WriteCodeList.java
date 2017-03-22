/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import snipe.Snipe;

/**
 *
 * @author aingealfire@gmail.com (new16014@byui.edu)
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

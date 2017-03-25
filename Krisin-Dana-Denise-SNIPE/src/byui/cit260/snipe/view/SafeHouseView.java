/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.view;

import byui.cit260.snipe.exceptions.GameControlException;
import byui.cit260.snipe.model.Country;
import byui.cit260.snipe.model.Dossier;
import byui.cit260.snipe.model.SafeHouse;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import snipe.Snipe;

/**
 *
 * @author denisegoetz
 */
//public class SafeHouseView extends View {
public class SafeHouseView {

    //   public SafeHouseView() {
    public void display() throws GameControlException {
        //      super("\n"
        /*System.out.println("\n"         
                + "\n-----------------------------------------------------------"
                + "\n             Safe house - Get some rest!"
                + "\n-----------------------------------------------------------"
                + "\nEnter any value to see more details about this safe house."
                + "\n-----------------------------------------------------------"
                + "\n" );*/
        String countryName = Snipe.getPlayer().getCurrentCountry().getName();

        for (SafeHouse safeHouse : SafeHouse.values()) {
            if (countryName.equals(safeHouse.getSafeHouseCountry())) {
                System.out.println("\n" + safeHouse.getSafeHouseDesc());
            }
        }
        List<String> codeList = Snipe.getPlayer().getCodeList();
        if (!codeList.contains(Snipe.getPlayer().getCurrentPlace().getMasterCodePiece())) {
            System.out.println("\n-----------------------------------------------------------"
                    + "\n You have not yet obtained the code needed to move on. You "
                    + "\n will need to travel back to another location and complete"
                    + "\n a challenge to obtain a code. Once you have a code, you "
                    + "\n will return here to obtain your next Dossier and move on.");
        } else {

            switch (countryName) {
                case "USA": //Show Dossier
                    System.out.println("\n\nYour mission in the " + countryName + " is complete, you will continue in a new country.\n\n" + Dossier.values()[1]);
                    break;
                case "Germany": //Show Dossier
                    System.out.println("\n\nYour mission in " + countryName + " is complete, you will continue in a new country.\n\n" + Dossier.values()[2]);
                    break;
                case "England": //Show Dossier
                    System.out.println("\n\nYour mission in " + countryName + " is complete, you will continue in a new country.\n\n" + Dossier.values()[3]);
                    break;
                case "Spain": //Show Dossier
                    System.out.println("\n\nYour mission in " + countryName + " is complete, you will continue in a new country.\n\n" + Dossier.values()[4]);
                    break;
                case "Russia": //Show Dossier
                    System.out.println("\n\nYour mission in " + countryName + " is complete, you will continue in a new country.\n\n" + Dossier.values()[5]);
                    break;
                case "France": //Show Dossier
                    System.out.println("\n\nYour mission in " + countryName + " is complete, you will continue in a new country.\n\n" + Dossier.values()[6]);
                    break;
                case "Canada": //Show Dossier
                    System.out.println("\n\nYour mission in " + countryName + " is complete, you will continue in a new country.\n\n" + Dossier.values()[7]);
                    break;
                case "Brazil": //Show Dossier
                    System.out.println("\n\nYour mission in " + countryName + " is complete, you will continue in a new country.\n\n" + Dossier.values()[8]);
                    break;
                case "Australia": {
                    this.displayCypherControlView();
                }
                break;
                default:
                    ErrorView.display(this.getClass().getName(),
                            "\n*** Invalid Selection *** Try Again");
                    break;
            }
        }

    }

    private void displayCypherControlView() throws GameControlException {
        CypherControlView cypherControlView = new CypherControlView();
        cypherControlView.display();
    }
}

//    @Override
//    public boolean doAction(String choice) {
//        choice = choice.toUpperCase(); //convert choice to upper case
//      String countryName = Snipe.getPlayer().getCurrentCountry().getName();
//       for (SafeHouse safeHouse : SafeHouse.values()) {
//           if (countryName.equals(safeHouse.getSafeHouseCountry())) {
//               this.console.println("\n" + safeHouse.getSafeHouseDesc());
//           }
//       }
//       List<String> codeList = Snipe.getPlayer().getCodeList();
//       if (!codeList.contains(Snipe.getPlayer().getCurrentPlace().getMasterCodePiece())) {
//            System.out.println("\n-----------------------------------------------------------"
//                    + "\n You have not yet obtained the code needed to move on. You "
//                    + "\n will need to travel back to another location and complete"
//                    + "\n a challenge to obtain a code. Once you have a code, you "
//                    + "\n will return here to obtain your next Dossier and move on.");
//        }
//        return true;
//    }

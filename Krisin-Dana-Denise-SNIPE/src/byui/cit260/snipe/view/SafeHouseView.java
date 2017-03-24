/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.view;

import byui.cit260.snipe.exceptions.GameControlException;
import byui.cit260.snipe.model.Country;
import byui.cit260.snipe.model.SafeHouse;
import java.util.List;
import snipe.Snipe;

/**
 *
 * @author denisegoetz
 */
//public class SafeHouseView extends View {
public class SafeHouseView {

 //   public SafeHouseView() {
    public void display() {
  //      super("\n"
        System.out.println("\n"         
                + "\n-----------------------------------------------------------"
                + "\n             Safe house - Get some rest!"
                + "\n-----------------------------------------------------------"
                + "\nEnter any value to see more details about this safe house."
                + "\n-----------------------------------------------------------"
                + "\n" );
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

    private void displayPlayerCurrentScene() throws GameControlException {
        System.out.println(Snipe.getPlayer().getCurrentPlace().getPlaceScene());
    }

    private void displayMoveCountry() {
        MoveCountryView moveCountry = new MoveCountryView();
        moveCountry.display();
    }
}

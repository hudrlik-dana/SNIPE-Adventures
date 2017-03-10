/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.snipe.view;

import byui.cit260.snipe.model.Place;
import snipe.Snipe;

/**
 *
 * @author aingealfire@gmail.com (new16014@byui.edu)
 */
public class CollectedCodesView extends View{
    
    public void display() {
        /*System.out.println("You have visited: ");
        for (Item codeList : Snipe.getPlayer().getCodeList()) {
            System.out.println(item.getCodeList());
        }*/
    }

    @Override
    public boolean doAction(String value) {
        System.out.println("\n*** doAction stub function called ***");
        return false;
    }

}

/*
List<Codes> codeList = Snipe.getPlayer().getPassport();
            
            if(!passport.contains(Snipe.getPlayer().getCurrentPlace())){
                    passport.add(Snipe.getPlayer().getCurrentPlace());
                }
*/
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.control;

import java.util.Random;
import org.junit.Test;

/**
 *
 * @author Daniel
 */
public class PlaygroundTests {
    
    @Test
    public void Danas() {
        
        String[] names1 = { "Dana", "Kristen", "Denise", "Bro G" };
        String[] names2 = { "Micky", "Donald", "Goofy" };
        
        Random random = new Random();
        
        String test = names1[2];
        
        String name1 = names1[random.nextInt(names1.length)];
        String name2 = names2[random.nextInt(names2.length)];
        
        System.out.println(name1 + " " + name2);
    }
    
}

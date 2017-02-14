/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.control;

import java.util.Random;

/**
 *
 * @author denisegoetz
 */
public class GameControl {
    
    public static String getCodeName(String[] args) {

        String[] names1 = {"Speedy", "Bright", "Stealthy", "Silent", "Brave", "Dizzy", "Neon", "Red", "Diamond", "Silver"};
        String[] names2 = {"Unicorn", "Snake", "Ninja", "Lizard", "King", "Tabasco", "Cockroach", "Ladybug", "Dancer", "Tuna"};

        Random random = new Random();
        String firstName = names1[random.nextInt(names1.length)];
        String lastName = names2[random.nextInt(names2.length)];

        return "Your SNIPE code name is " + firstName + " " + lastName + ".";

    }
}

    
    
    
    
    


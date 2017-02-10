/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.control;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 *
 * @author danahudrlik
 */

/**
public class SandboxTest {

    import java.util.Random ;
    import java.util.ArrayList ;
    import java.util.Collections ;
    import java.util.LinkedList ;
    import java.util.List ;

    /**
     *
     * @author danahudrlik
     */
/*    public class RandomGenerator {

// a list to hold all the names
        List<String> namesList = new ArrayList<>();

// create the full list of names
        String[] names = {"Awesome", "Dragon", "LadyBug", "Fiercesome", "Iguana", "Sleepy"};

// store them into the List
        namesList  = new ArrayList(Arrays.asList(names));
        //   randomly get the first part of the name

        int randomIndex = new Random().nextInt(names.length - 1);
        String firstName = namesList.get(randomIndex);
        String lastName = null;

// figure out the size remaining
        int remainSize = 12 - firstName.length();

// remove the element from the List so I don't get "DragonDragon"
        namesList.remove (randomIndex);

// randomly shuffle the list
        long seed = System.nanoTime();

        Collections.shuffle (namesList,
                
        new Random(seed));

// for each name, grab the first one that will complete the size 12
for (String name : namesList

        
            ) {
    int nameSize = name.length();

            if (nameSize <= remainSize) {
                lastName = name;
                break;
            }
        }

        String newName = firstName + lastName;

        System.out.println (
                
    

"Generated name: " + newName + ", with size " + newName.length());    
    
   
}  

/*    public static String[] random() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
// generate spy name
String names1[] = {"Fierce" , "Sleepy" , "Angry" , "Awesome"};
// String names2[] = {"Juguar" , "LadyBug" , "Iguana" , "Dragon"};
public void random(String[] args) {
    System.out.println(names1[new Random().nextInt(names1.length)]);
}
}  
    
    
// randomly generate strings together 
//    public static String getRandomString() {int n
/*
public static List<String> getRandomString(List<String> list, int n) {
    List<String> codeName = new LinkedList<String>(list);
    Collections.shuffle(codeName);
    List<String> List;
    
    List<String> lista = new LinkedList<String>();
        lista.add("Fierce");
        lista.add("Jaugar");
        lista.add("Sleepy");
        lista.add("LadyBug");
    
//    List<String> randomPicks = getRandomString(list, 2);
    return codeName.subList(2, n);
}
}
    
        
/*        Random random = new Random();
//        ArrayList<String> list = new ArrayList<String>();
//        StringBuilder codeName = new StringBuilder();

        // add all strings to the list
        list.add("Fierce");
        list.add("Frighten");
        list.add("Jaguar");
        list.add("Sleeping");

        // builds the return string
        while(!list.isEmpty())
        {
            //this line makes the listlist.size()
            codeName.append(list.remove(random.nextInt(list.size())));
            codeName.append(' ');
        }
        return codeName.toString();
    }

    public RandomGenerator() {
    }

    public static void main(String[] args)
    {
        System.out.println(getRandomString());
    }
}
        
*/  
// }

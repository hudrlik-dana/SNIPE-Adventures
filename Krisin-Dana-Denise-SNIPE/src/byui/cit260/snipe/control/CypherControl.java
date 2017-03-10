/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.control;
import byui.cit260.snipe.view.View;
import java.util.Scanner;
/**
 *
 * @author danahudrlik
 */
public class CypherControl extends View {
    
    private String answerOption;

    public CypherControl() {
        super(); 
        CypherControl cypherDecoder = new CypherControl(); 

        //display cypher decoder  
        System.out.println(
                        "\n**************** Cypher Decoder *****************"
                      + "\n A = 6    G = T     M = N     S = H    Y = 1"   
                      + "\n B = Z    H = S     N = M     T = G    Z = B"   
                      + "\n C = X    I = 4     O = 3     U = 2         "
                      + "\n D = W    J = Q     P = L     V = F         "
                      + "\n E = 5    K = 8     Q = J     W = D         "
                      + "\n F = V    L = P     R = 7     X = C         "
                      + "\n*************************************************"
                      + "\n Retrieve your master code pieces from the "
                      + "\n Collected Codes list. Decode the secret message."
                      + "\n Arrange the words in order to discover an "
                      + "\n important message."
                      + "\n*************************************************"
    //                  + "\n _ _ _ _    _ _ _   _ _   _   _ _ _   _ _ "
    //                  + "\n _ _ _ _ _ _ _ _   _ _ _   _ _ _  "
    //                  + "\n _ _ _ _ _ _ _ _ _    _ _ _ _ _ _ _ _ _ "
    //                  + "\n _ _ _    _ _ _ _ _ _ _."
    //                  + "\n _ _ _ _ _    _ _    _ _ _    _ _ _ _ _ _ _ _"
    //                  + "\n _ _ _   _ _ _ _.  _ _   _ _ _ _ _ _"              
                    );
        
        }
        public void displayMenuView() {

        boolean done = false; //set flag to not done
        do {
            String answerOption = this.getInput();

            //do the requested action and display the next view
            done = this.doAction(answerOption);

           } while (!done);
        }
    
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase(); //convert choice to upper case
                System.out.println(
                        "\n******* Congratulations! ********"
                      + "\n You are now a S.N.I.P.E Agent."   
                      + "\n*********************************"
                      + "\n Press any key to take a well "
                      + "\n      deserved vacation."
                      + "\n*********************************"
                ); 
        return true;
    }
    
   // public class MainMenuView extends View {
   //     public void MainMenuView() {
   //     super("\n"
   //             + "\n--------------------------------"
   //             + "\n Main Menu                      "
   //             + "\n--------------------------------"
   //             + "\n N - Start New Game             "
   //             + "\n Q - Exit Game                  " 
   //             + "\n--------------------------------");
   // }
  
    @Override
    public String getInput() {
        Scanner keyboard = new Scanner(System.in); //get infile for Keyboard
        boolean valid = false; //initialize to not valid
        String value = ""; //value to be returned

        while (!valid) {
            System.out.println("\n" + this.displayMessage);

            value = keyboard.nextLine(); //get next line typed on keyboard
            value = value.trim(); //trim off leading and trailing blanks

            if (value.length() < 1) { // value is blank
                System.out.println("\nInvalid: entry required.");
                continue;
            }
            break; //end the loop
        }
        return value; //return entered value

    }

//        @Override
//        public boolean doAction(String value) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        }
    }

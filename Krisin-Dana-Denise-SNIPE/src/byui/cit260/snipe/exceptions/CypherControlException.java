/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.snipe.exceptions;

/**
 *
 * @author aingealfire@gmail.com (new16014@byui.edu)
 */
public class CypherControlException extends Exception {

    public CypherControlException() {
    }

    public CypherControlException(String message) {
        super(message);
    }

    public CypherControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public CypherControlException(Throwable cause) {
        super(cause);
    }

    public CypherControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}

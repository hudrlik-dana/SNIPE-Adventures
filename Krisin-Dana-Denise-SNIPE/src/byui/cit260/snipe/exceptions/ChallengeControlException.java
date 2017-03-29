
package byui.cit260.snipe.exceptions;

/**
 *
 * @author aingealfire@gmail.com (new16014@byui.edu)
 */
public class ChallengeControlException extends Exception {

    public ChallengeControlException() {
    }

    public ChallengeControlException(String message) {
        super(message);
    }

    public ChallengeControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public ChallengeControlException(Throwable cause) {
        super(cause);
    }

    public ChallengeControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}

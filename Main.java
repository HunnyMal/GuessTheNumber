import java.awt.*;

/**
 * 
 * @author HunnyMal
 */
public class Main {

    /**
     * @param args the command line arguments
     */    
    public static void main(String[] args) {
        GuessNumber obj = new GuessNumber(); //instance of GuessNumber to call methods
        obj.inputNumbers(); //method to enable user to set maximum range (0 - x);
                            //and determine correct number to guess
        obj.analyzeGuess(); //allows user to input number as guess
                            //and check if your guess is correct
    }
}

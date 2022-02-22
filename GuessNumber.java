import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author HunnyMal
 */
public class GuessNumber {
    /**
     * Private attributes of class GuessNumber()
     */
    private int maxNum,     //maximum range of the number to guess ( 0 to (maxNum) )
            correctNumber,  //single number to guess within the range of 0 to (maxNum)
            guessNumber,    //input of user as guess for value of (correctNumber)
            scoreNumber;    //attempts made by user to guess (correctNumber)

    /**
     * Constructor for GuessNumber() with predetermined values of maxNum, scoreNumber;
     * and prints on screen an introductory message
     */
    GuessNumber() {
        maxNum = 100;
        scoreNumber = 0;
        System.out.println("Welcome to Number Guesser Written by HunnyMal.");
    }
     /**
      * Getters and Setters of GuessNumber() class attributes
      */
    public void setMaxNum(int max) {        //public setter method for maxNum
        this.maxNum = max; 
    }
    private int getMaxNum() {               //private getter method for maxNum
        return this.maxNum; 
    } 
    private void setCorrectNumber() {       //private setter method for correctNumber
        Random randNum = new Random();
        this.correctNumber = randNum.nextInt(getMaxNum() + 1); 
    }
    public int getCorrectNumber() {         //public getter method for correctNumber
        return this.correctNumber; 
    }
    private void setGuessNumber(int num) {  //private setter method for guessNumber
        this.guessNumber = num; 
    }
    public int getGuessNumber() {           //public getter method for guessNumber
        return this.guessNumber; 
    }
    private void setScore(int num) {        //private setter method for scoreNumber
        this.scoreNumber = num; 
    }
    public int getScore() {                 //public getter method for scoreNumber
        return this.scoreNumber;
    }

    Scanner scanInt = new Scanner(System.in);   //instance of Scanner for local usage 
                                                //(creates bugs if multiple instances are created in each methods)

    /**
     * Method to allow user to input the maximum number range, and 
     * determines the value of the correctNumber within 0 to maxNum; 
     * while loop creates instance of Scanner for input, and ensures input value is more than 0;
     * uses setMaxNum(int num) to set value of maxNum based on input;
     * uses setCorrectNumber() to set value of correctNumber 
     */
    public void inputNumbers() {
        int max = 0;
        while (max <= 0) {
            System.out.println("Input the Maximum Number Range (Enter a Real Number from 0 onwards): ");
            max = scanInt.nextInt();
        }
        setMaxNum(max);
        setCorrectNumber();     
    }

    /**
     * method to receive guessNumber input and analyze if it matches with value of correctNumber;
     * uses while loop to analyze input if correct, 
     * ensure Scanner instance is made to allow user input if it does not match condition, 
     * increment and print value of scoreNumber,
     * prints different String depending if condition is met/unmet
     */
    public void analyzeGuess() {
        System.out.println("Input Your Guess: ");
        while (this.guessNumber != correctNumber) {
            int guess = scanInt.nextInt();
            setGuessNumber(guess);
            if (this.guessNumber != this.correctNumber) {
                System.out.println("You are wrong. Guess Again :-(");
                setScore(++scoreNumber);
                System.out.println("Attempt/s: " + getScore());
            }
        }
        System.out.println("Your answer is correct (" + correctNumber + ")");
        setScore(++scoreNumber);
        System.out.println("Attempt: " + getScore());
        scanInt.close();
    }
}

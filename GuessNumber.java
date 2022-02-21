import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    //Attributes
    private int maxNum, 
                correctNumber, guessNumber,
                scoreNumber;

    //Constructor
    GuessNumber() {
        maxNum = 100;
        scoreNumber = 0;
        System.out.println("Welcome to Number Guesser Written by HunnyMal.");
    }

    //GETTERS AND SETTERS
    //maxNum
    public int getMaxNum() {
        return this.maxNum;
    }
    public void setMaxNum(int max) {
        this.maxNum = max; 
    }
    //correctNumber
    private void setCorrectNumber() {
        Random randNum = new Random();
        this.correctNumber = randNum.nextInt(maxNum + 1);
    }
    public int getCorrectNumber() {
        return this.correctNumber;
    }
    //guessNumber
    private void setGuessNumber(int num) {
        this.guessNumber = num;
    }
    public int getGuessNumber() {
        return this.guessNumber;
    }
    //scoreNumber
    private void setScore(int num) {
        this.scoreNumber = num;
    }
    public int getScore() {
        return this.scoreNumber;
    }

    //Methods
    Scanner scanInt = new Scanner(System.in);

    public void inputNumbers() {
        //maxNum
        int max = 0;
        while (max <= 0) {
            System.out.println("Input the Maximum Number Range (Enter a Real Number from 0 onwards): ");
            max = scanInt.nextInt();
        }
        setMaxNum(max);
        //scanInt.close();
        //correctNumber
        setCorrectNumber();
        //guessNumber
        
    }

    public void analyzeGuess() {
        //Scanner scanGuess = new Scanner(System.in);
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

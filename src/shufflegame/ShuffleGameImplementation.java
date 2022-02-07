package shufflegame;

import java.util.Arrays;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ShuffleGameImplementation implements ShuffleGameRoadmap {

    // global variables
    Integer[] array = { 1, 0, 1 };
    char answer;
    int guess;

    // create new scanner object
    Scanner sc = new Scanner(System.in);

    public void runGame() {
        shuffleGame();
        askForValidGuess();
    }

    public void intro() {
        System.out.println("----------------------Welcome to shuffle game---------------------");
        System.out.println("Guess where the 0 is!");
        System.out.println("Are you ready to play? y/n");
        askForValidAnswer();
    }

    public void shuffleGame() {
        Collections.shuffle(Arrays.asList(array));
    }

    public void checkAnswer() {
        int indexOfZero = Arrays.asList(array).indexOf(0);
        indexOfZero++;
        if (guess == indexOfZero) {
            rightAnswer();
        } else {
            wrongAnswer();
        }
    }

    public void wrongAnswer() {
        System.out.println("Sorry!!! Wrong guess!");
        keepPlaying();
    }

    public void rightAnswer() {
        System.out.println("Good guess!");
        keepPlaying();
    }

    public void keepPlaying() {
        System.out.println("Do you want to keep playing? y/n");
        askForValidAnswer();
    }

    public void askForValidAnswer() {
        do {
            try {
                answer = sc.nextLine().charAt(0);
            } catch (InputMismatchException e) {
                System.out.println("Invalid entry. Please enter 'y' for yes or 'n' for no");
            }
            sc.nextLine(); // clears the buffer
        } while (answer != 'y' && answer != 'n');

        if (answer == 'y') {
            runGame();
        } else {
            System.out.println("See you next time!");
        }
    }

    public void askForValidGuess() {
        do {
            try {
                System.out.print("Pick 1, 2 or 3!");
                guess = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid entry. Please enter 1, 2 or 3");
            }
            sc.nextLine(); // clears the buffer
        } while (guess != 1 && guess != 2 && guess != 3);

        checkAnswer();
    }
}

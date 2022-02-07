package shufflegame;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ShuffleGameImplementation implements ShuffleGameRoadmap {
    Integer[] array = { 1, 0, 1 };
    String[] messages = {"----------------------Welcome to shuffle game---------------------",
                         "                       Guess where the 0 is!                      ",
                         "                    Are you ready to play? y/n                    ",
                         "Pick 1, 2 or 3!",
                         "Good guess!",
                         "Sorry!!! Wrong guess!",
                         "Do you want to keep playing? y/n",
                         "See you next time!",
                         "Not a valid answer; please try again!"};
    char answer;
    int guess;

    Scanner sc = new Scanner(System.in);

    public void intro() {
        System.out.println(messages[0]);
        System.out.println(messages[1]);
        System.out.println(messages[2]);
        askForValidAnswer();
    }

    public void runGame() {
        shuffleGame();
        System.out.println(messages[3]);
        guess = sc.nextInt();
        askForValidGuess();
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
        System.out.println(messages[5]);
        keepPlaying();
    }

    public void rightAnswer() {
        System.out.println(messages[4]);
        keepPlaying();
    }

    public void keepPlaying() {
        System.out.println("Do you want to keep playing? y/n");
        askForValidAnswer();
    }

    public void askForValidAnswer() {
        answer = sc.nextLine().charAt(0);
        while (answer != 'y' && answer != 'n') {
            System.out.println("Invalid entry. Please enter 'y' for yes or 'n' for no");
            answer = sc.nextLine().charAt(0);
            if (answer == 'y') {
                runGame();
            } else {
                System.out.println(messages[7]);
            }
        }
    }

    public void askForValidGuess() {
        while (guess != 1 && guess != 2 && guess != 3) {
            System.out.println("Invalid entry. Please enter 1, 2 or 3");
            guess = sc.nextInt();
            if (guess == 1 || guess == 2 || guess == 3) {
                checkAnswer();
            }
        }

    }
}

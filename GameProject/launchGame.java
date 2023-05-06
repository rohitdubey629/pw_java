package GameProject;

import java.util.*;

import javafx.scene.effect.Light.Spot;

class Guesser {
    int guessNum;

    int guessingNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Guesser! Kindly guess the number");
        guessNum = sc.nextInt();
        return guessNum;
    }
}

class Player {
    int guessNum;

    int guessingNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Player! Kindly guess the number");
        guessNum = sc.nextInt();
        return guessNum;
    }
}

class Umpire {
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    void collectNumFromGuesser() {
        Guesser g = new Guesser();
        numFromGuesser = g.guessingNumber();
    }

    void collectNumFromPlayer() {
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        numFromPlayer1 = p1.guessingNumber();
        numFromPlayer2 = p2.guessingNumber();
        numFromPlayer3 = p3.guessingNumber();
    }

    void compare() {
        if (numFromGuesser == numFromPlayer1) {
            if (numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3) {
                System.out.println("All player guessing the correct number all player is winner");
            } else if (numFromGuesser == numFromPlayer2) {
                System.out.println("Player 1 and Player 2 is Winner");
            } else if (numFromGuesser == numFromPlayer3) {
                System.out.println("Player 1 and Player 3 is Winner");
            } else {
                System.out.println("Player 1 is Winner");
            }
        } else if (numFromGuesser == numFromPlayer2) {
            if (numFromGuesser == numFromPlayer3) {
                System.out.println("Player 2 and Player 3 is Winner");
            } else {
                System.out.println("Player 2 is Winner");

            }
        } else if (numFromGuesser == numFromPlayer3) {
            System.out.println("Player 3 is Winner");
        } else {
            System.out.println("All player is not guess the correct number");

        }
    }
}

public class launchGame {
    public static void main(String args[]) {
        System.out.println("Game start");
        Umpire u = new Umpire();
        u.collectNumFromGuesser();
        u.collectNumFromPlayer();
        u.compare();
    }
}

package Hangman;

import java.util.Objects;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        System.out.println("HANGMAN" + "\nThe game will be a avalieble soon.");
        Scanner Scanner = new Scanner(System.in);
        System.out.println("HANGMAN \nGuess the word:");
        String word = Scanner.nextLine();
        if (Objects.equals(word, "java")) {
            System.out.println("You survived!");
        } else {
            System.out.println("You lost!");
        }
    }
}
package ChatBot;

import java.util.Scanner;


public class ChatBot {
    public static void main(String[] args){
        Scanner Scanner = new Scanner(System.in);
        String bot_name = "Karina";

        int bot_year = 2022;
        System.out.println("Hello! My name is " + bot_name + ".");
        System.out.println("I was created in " + bot_year + ".");
        System.out.println("Please, remind your name: ");
        String input_name = Scanner.nextLine();
        System.out.println("What a great name you have, " +input_name +"!");

    }
}

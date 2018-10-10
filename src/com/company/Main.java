package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        public static String guess () {
            Scanner num = new Scanner(System.in);
            System.out.println("Guess a number from 1 to 10: ");
            String guess = num.nextLine();
            while (!guess.equals("7")) {
                System.out.println("Guess again: " + guess);
                guess = num.nextLine();
            }
            System.out.println("Congratulations, the correct answer is 7");
        }
    }
}

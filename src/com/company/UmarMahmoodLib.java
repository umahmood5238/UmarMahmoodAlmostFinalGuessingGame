package com.company;
import java.util.Scanner;

public class UmarMahmoodLib
{
    public static int AIGuessing()
    {
        Scanner num = new Scanner(System.in);
        System.out.println("Guess a number from 1 to 100: ");
        int guess = num.nextInt();
        while (guess != 70)
        {
            while (guess < 70) {
                System.out.println("higher");
            }
            while (guess > 70) {
                System.out.println("lower");
            }
        }
        System.out.println("Correct, the answer is ");
        return guess;
    }
}


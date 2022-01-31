package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static void guessMethod() {
        System.out.println("Hello! What is your name?");

        Scanner input = new Scanner(System.in);
        String username = input.nextLine();
        System.out.println("Well, " + username + ", I am thinking of a number between 1 and 20.");
        System.out.println("Take a guess.");

        Scanner numInput = new Scanner(System.in);
        int guess = numInput.nextInt();
        Random random = new Random();
        int num = random.nextInt(20)+1;
        int i, attempts =  6;



        for( i=0; i<attempts;i++){
            if(guess == num){
                System.out.println("Good job " + username + "! You guessed my number in " + i + " guesses!");
                break;
            } else if (guess >num){
                System.out.println("Your guess is too high");
                System.out.println("Take a guess.");
                guess = numInput.nextInt();
            }else if (guess < num){
                System.out.println("Your guess is too low");
                System.out.println("Take a guess");
                guess = numInput.nextInt();
            }
        }

        if (i == attempts){
            System.out.println("You have run out of attempts! The number was " + num);
        }
    }

    public static void main(String[] args) {

        guessMethod();

        System.out.println("Would you like to play again? (y or n)");
        Scanner playAgain = new Scanner(System.in);
        String play = playAgain.nextLine();
        if (play.equals("y")){
            guessMethod();
        } else System.out.println("Thank you for playing");

    }
}
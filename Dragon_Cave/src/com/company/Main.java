package com.company;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {

    public static void main(String[] args) {
        System.out.println("You are in a land full of dragons. In front of you,");
        System.out.println("you see two caves. In one cave, the dragon is friendly");
        System.out.println("and will share his treasure with you. The other dragon");
        System.out.println("is greedy and hungry and will eat you on sight.");
        System.out.println("Which cave will you go into? (1 or 2)");





        Scanner caveSel = new Scanner(System.in);
        while (!caveSel.hasNextInt()){
            System.out.println("You must choose cave 1 or cave 2");
            caveSel.next();
        }
        int cave = caveSel.nextInt();
        while (cave != 1 && cave != 2){
            System.out.println("You must choose cave 1 or cave 2");
            cave = caveSel.nextInt();
        }
        if (cave == 1){
            System.out.println("You approach the cave...");
            System.out.println("It is dark and spooky...");
            System.out.println("A large dragon jumps out in front of you! He opens his jaws and...");
            System.out.println(" Gobbles you down in one bite!");
        } else System.out.println("Congratulations you have reached the dragons unguarded treasure!");

    }
}
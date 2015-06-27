package com.github.tedda42.psr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Do you choose rock, paper or scissors?");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String userChoice = br.readLine();
        double computerChoiceRand = Math.random();
        String computerChoice;

        if (computerChoiceRand < 0.34) {
            computerChoice = "rock";
        } else if (computerChoiceRand <= 0.67) {
            computerChoice = "paper";
        } else {
            computerChoice = "scissors";
        }

        System.out.println("User    : " + userChoice);
        System.out.println("Computer: " + computerChoice);

        String result = compare(userChoice, computerChoice);
        System.out.println(result);
    }

    static String compare(String choice1, String choice2) {
        if (choice1.equals(choice2)) {
            return "The result is a tie!";
        } else if (choice1.equals("rock")) {
            if (choice2.equals("scissors")) {
                return "rock wins!";
            } else {
                return "paper wins!";
            }
        } else if (choice1.equals("paper")) {
            if (choice2.equals("rock")) {
                return "paper wins!";
            }
            else {
                return "scissors wins!";
            }
        } else if (choice1.equals("scissors")) {
            if (choice2.equals("rock")) {
                return "rock wins!";
            } else {
                return "scissors wins!";
            }
        } else {
            return "Invalid choice '" + choice1 +"'";
        }
    }
}

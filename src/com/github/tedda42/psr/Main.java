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

        System.out.println("userChoice = " + userChoice);
        System.out.println("computerChoice = " + computerChoice);

        String result = compare(userChoice, computerChoice);
        System.out.println("result = " + result);
    }

    static String compare(String choice1, String choice2) {
        return "TODO";
    }
}

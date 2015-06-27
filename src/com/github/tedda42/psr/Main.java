package com.github.tedda42.psr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Do you choose rock, paper or scissors?");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String userChoice = br.readLine();
        System.out.println("userChoice = " + userChoice);
        double computerChoice = Math.random();
        System.out.println("computerChoice = " + computerChoice);
    }
}

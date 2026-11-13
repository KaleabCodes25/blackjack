package com.pluralsight;

import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the first players name?");
        String firstPlayer = scanner.nextLine();


        System.out.println();

        System.out.println("What is the second player's name?");
        String secondPlayer = scanner.nextLine();


        System.out.println();

        Deck deck = new Deck();
        deck.shuffle();

        Hand firstHand = new Hand();
        firstHand.deal(deck.deal());
        firstHand.deal(deck.deal());


        Hand secondHand = new Hand();
        secondHand.deal(deck.deal());
        secondHand.deal(deck.deal());

        System.out.println(firstPlayer + "'s Hand:");
        firstHand.print();

        int firstScore = firstHand.getValue();
        System.out.println("Score: " + firstScore);

        System.out.println();

        System.out.println(secondPlayer + "'s Hand:");
        secondHand.print();

        int secondScore = secondHand.getValue();
        System.out.println("Score: " + secondScore);

        System.out.println();

        if (firstScore > 21 && secondScore > 21) {
            System.out.println("Both players went over 21!");
            System.out.println("It's a tie!");

        } else if (firstScore > 21) {
            System.out.println(secondPlayer + " wins!");

        } else if (secondScore > 21) {
            System.out.println(firstPlayer + " wins!");

        } else if (firstScore > secondScore) {
            System.out.println(firstPlayer + " wins!");

        } else if (secondScore > firstScore) {
            System.out.println(secondPlayer + " wins!");

        } else {
            System.out.println("It's a tie!");
        }
        scanner.close();


    }
}

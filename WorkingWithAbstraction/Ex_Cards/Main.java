package WorkingWithAbstraction.Ex_Cards;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CardSuits[] cardSuits=CardSuits.values();
        System.out.println("Card Suits:");

        for(CardSuits cardSuit:cardSuits){
            System.out.printf("Ordinal value: %d; Name value: %s%n",cardSuit.ordinal(),cardSuit.name());
        }
    }
}

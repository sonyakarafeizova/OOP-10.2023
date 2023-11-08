package WorkingWithAbstraction.Ex_CardsWithPower;

import WorkingWithAbstraction.Ex_CardRank.CardRanks;

public class Card {
    private CardSuits cardSuit;
    private CardRanks cardRank;

    public Card(CardSuits cardSuit, CardRanks cardRank) {

        this.cardSuit = cardSuit;
        this.cardRank = cardRank;
    }

    public int calculatePower() {
        return this.cardSuit.getValue() + this.cardRank.getValue();
    }
}

package WorkingWithAbstraction.Ex_CardRank;

public class Main {
    public static void main(String[] args) {

        CardRanks[] cardRanks=CardRanks.values();//spisuk s elementi

        System.out.println("Card Ranks:");

        for(CardRanks cardRank:cardRanks){
            System.out.printf("Ordinal value: %d; Name value: %s%n",cardRank.ordinal(), cardRank.name());
        }

    }
}

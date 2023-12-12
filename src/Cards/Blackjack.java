package Cards;

public class Blackjack {
    public static void main(String[] args) {
       Deck myDeck = new Deck();
       Card myCard = myDeck.deal();
       myCard.flip();
    }
}

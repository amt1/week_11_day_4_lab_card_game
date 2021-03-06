import java.util.ArrayList;
import java.util.Collections;


public class Deck {

    private ArrayList<Card> deck;

    public Deck(){
        this.deck = new ArrayList<>();
    }

    public int getNumberOfCards() {
        return deck.size();
    }

    public void addCard(Card card) {
        deck.add(card);
    }

    public void populate() {
        for (Suit suit : Suit.values()) {
            for (CardRank rank : CardRank.values()) {
                Card card = new Card(suit, rank);
                this.addCard(card);
            }
        }
    }

    public Card dealCard() {
        return deck.remove(0);
    }

    public void shuffle(){
        Collections.shuffle(this.deck);
    }

}

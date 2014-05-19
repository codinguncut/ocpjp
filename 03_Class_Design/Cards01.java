import java.util.ArrayList;
import java.util.Collections;

class Card {
    public enum Suit {
        CLUBS, DIAMONDS, HEARTS, SPADES;
    }

    public enum Value {
        V7, V8, V9, V10, JACK, QUEEN, KING, ACE;
    }

    Suit suit;
    Value value;
    public Card(Value value, Suit suit) {
        this.suit = suit;
        this.value = value;   
    }

    public String toString() {
        return "Card(" + this.value + " of " + this.suit + ")";
    }
}


class Deck {
    ArrayList<Card> cards;
    public Deck() {
        cards = new ArrayList<>();
        for (Card.Suit suit : Card.Suit.values()) {
            for (Card.Value value : Card.Value.values()) {
                cards.add(new Card(value, suit));
            }
        }
    }

    public String toString() {
        return "Deck(" + cards + ")";
    }

    // should be in dealer
    public void shuffle() {
        Collections.shuffle(cards);
    }

    // should be in dealer
    public Hand giveCard(Hand hand) {
        return hand.addCard(cards.remove(0));
    }
}


class Hand {
    ArrayList<Card> cards;
    public Hand() {
        cards = new ArrayList<>();
    }

    public Hand addCard(Card card) {
        cards.add(card);
        return this;
    }

    public String toString() {
        return "Hand(" + cards + ")";
    }
}

public class Cards01 {
    public static void main(String[] args) {
        Card card = new Card(Card.Value.JACK, Card.Suit.HEARTS);
        System.out.println("card " + card);

        Deck deck = new Deck();
        System.out.println("deck " + deck + "\n");
        deck.shuffle();
        System.out.println("deck " + deck + "\n");

        Hand hand = new Hand();
        for (int i = 0; i < 5; i++) {
            deck.giveCard(hand);
        }
        System.out.println("hand " + hand + "\n");
    }
}

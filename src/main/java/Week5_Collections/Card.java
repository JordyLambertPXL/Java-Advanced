package Week5_Collections;

public class Card implements Comparable<Card> {
    //Eigenschappen
    private Suit suit;
    private Value value;

    //Constructor
    public Card() {

    }

    public Card(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }

    //Methodes
    public Suit getSuit() {
        return suit;
    }

    public Value getValue() {
        return value;
    }

    @Override
    public int compareTo(Card card) {
        if (card.suit == suit) {
            return 0;
        } else {
            return 1;
        }
    }
}

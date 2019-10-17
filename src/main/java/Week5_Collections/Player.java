package Week5_Collections;

import java.util.Set;
import java.util.TreeSet;

public class Player {
    //Eigenschappen
    private String name;
    private Set<Card> hand = new TreeSet<>();

    //constructoren
    public Player(String name){
        setName(name);
    }

    //Methoden
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addCard(Card card){
        hand.add(card);
    }

    public boolean hasSuit(Suit suit){
        return hand.contains(suit);
    }

    @Override
    public String toString() {
        StringBuilder cards = new StringBuilder();
        for (Card c : hand){
            cards.append(String.format("%s of %s", c.getValue(), c.getSuit()));
        }
        return cards.toString();
    }
}

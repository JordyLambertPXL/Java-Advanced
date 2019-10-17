package Week5_Collections;

import java.text.Format;
import java.util.*;

public class Deck extends Card {
    //Eigenschappen
    private Queue<Card> cards;

    //Constructor
    public Deck(){
        List<Card> cardList = new LinkedList<>();
        for (int i = 0; i < 52; i++){
            Suit suit = null;
            Value value = null;

            for (Suit s : Suit.values()){
                suit = s;
            }
            for (Value v : Value.values()){
                value = v;
            }

            Card card = new Card(suit, value);
            cardList.add(card);
        }
        Collections.shuffle(cardList);
        cards = new LinkedList<>(cardList);
    }

    //Methodes
    public Card dealCard(){
        return cards.poll();
    }

    public int getSize(){
        return cards.size();
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();

        for (Card c : cards){
            s.append(String.format("%s of %s", c.getValue(), c.getSuit()));
        }
        return s.toString();
    }
}

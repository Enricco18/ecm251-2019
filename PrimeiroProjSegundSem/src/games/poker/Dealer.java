package games.poker;

import utilities.Card;
import utilities.Deck;

import java.util.List;

public class Dealer {

    public Hand deal(Deck deck){
        List<Card> a = deck.getCards(5);
        Hand hand = new Hand(a);
        return  hand;
    }
}
